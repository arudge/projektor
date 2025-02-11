const axios = require("axios");
const MockAdapter = require("axios-mock-adapter");
const {
  extractUncompressedResultsPostData,
} = require("./util/compression-util");
const { run, runCLI } = require("../index");

describe("node script index", () => {
  let mockAxios;
  let consoleError;
  let consoleLog;

  beforeEach(() => {
    mockAxios = new MockAdapter(axios);
    consoleError = jest.spyOn(console, "error").mockImplementation();
    consoleLog = jest.spyOn(console, "log").mockImplementation();
    process.exitCode = 0;
  });

  afterEach(() => {
    mockAxios.restore();
    consoleError.mockRestore();
    consoleLog.mockRestore();
  });

  it("should use settings from projektor.json if there is one", async () => {
    mockAxios
      .onPost("http://localhost:8080/groupedResults")
      .reply(200, { id: "ABC123", uri: "/tests/ABC123" });

    const { reportUrl, publicId } = await run(
      {},
      {},
      null,
      "src/__tests__/projektor.test.json"
    );

    expect(reportUrl).toEqual("http://localhost:8080/tests/ABC123");
    expect(publicId).toEqual("ABC123");

    expect(mockAxios.history.post.length).toBe(1);

    const postRequest = mockAxios.history.post[0];
    expect(postRequest.url).toContain("/groupedResults");
    const postData = await extractUncompressedResultsPostData(mockAxios);

    expect(postData).toContain("resultsDir1-results1");
    expect(postData).toContain("resultsDir1-results2");

    expect(process.exitCode).not.toBe(1);
  });

  it("should use settings from custom projektor.json if it is specified on command line", async () => {
    mockAxios
      .onPost("http://localhost:8080/groupedResults")
      .reply(200, { id: "DEF345", uri: "/tests/DEF345" });

    const { reportUrl, publicId } = await runCLI(
      ["--configFile=src/__tests__/projektor.test.json"],
      null,
      "projektor.fake.json"
    );

    expect(reportUrl).toEqual("http://localhost:8080/tests/DEF345");
    expect(publicId).toEqual("DEF345");

    const postData = await extractUncompressedResultsPostData(mockAxios);

    expect(postData).toContain("resultsDir1-results1");
    expect(postData).toContain("resultsDir1-results2");

    expect(process.exitCode).not.toBe(1);
  });

  it("should log error when no results, coverage, performance, or code quality dirs specified", async () => {
    await runCLI(
      ["--configFile=src/__tests__/projektor.missing.results.json"],
      null,
      "projektor.fake.json"
    );

    expect(consoleError).toHaveBeenLastCalledWith(
      expect.stringContaining("Results files not configured")
    );
  });

  it("should send results and single attachment directory", async () => {
    const resultsFileGlobs = ["src/__tests__/resultsDir1/*.xml"];
    const attachments = "src/__tests__/attachmentsDir1/*.txt";
    const serverUrl = "http://localhost:8080";

    mockAxios
      .onPost("http://localhost:8080/groupedResults")
      .reply(200, { id: "ABC123", uri: "/tests/ABC123" });

    mockAxios
      .onPost("http://localhost:8080/run/ABC123/attachments/attachment1.txt")
      .reply(200);

    mockAxios
      .onPost("http://localhost:8080/run/ABC123/attachments/attachment2.txt")
      .reply(200);

    await run(
      { resultsFileGlobs, attachments, serverUrl },
      {},
      null,
      "projektor.none.json"
    );

    expect(mockAxios.history.post.length).toBe(3);

    const postUrls = mockAxios.history.post.map((post) => post.url);
    expect(postUrls).toContain("http://localhost:8080/groupedResults");
    expect(postUrls).toContain(
      "http://localhost:8080/run/ABC123/attachments/attachment1.txt"
    );
    expect(postUrls).toContain(
      "http://localhost:8080/run/ABC123/attachments/attachment2.txt"
    );
  });

  it("should send results and multiple attachment directories", async () => {
    const resultsFileGlobs = ["src/__tests__/resultsDir1/*.xml"];
    const attachments = [
      "src/__tests__/attachmentsDir1/*.txt",
      "src/__tests__/attachmentsNestedDir/*.txt",
    ];
    const serverUrl = "http://localhost:8080";

    mockAxios
      .onPost("http://localhost:8080/groupedResults")
      .reply(200, { id: "ABC123", uri: "/tests/ABC123" });

    mockAxios
      .onPost("http://localhost:8080/run/ABC123/attachments/attachment1.txt")
      .reply(200);

    mockAxios
      .onPost("http://localhost:8080/run/ABC123/attachments/attachment2.txt")
      .reply(200);

    await run(
      { resultsFileGlobs, attachments, serverUrl },
      {},
      null,
      "projektor.none.json"
    );

    expect(mockAxios.history.post.length).toBe(4);

    const postUrls = mockAxios.history.post.map((post) => post.url);
    expect(postUrls).toContain("http://localhost:8080/groupedResults");
    expect(postUrls).toContain(
      "http://localhost:8080/run/ABC123/attachments/attachment1.txt"
    );
    expect(postUrls).toContain(
      "http://localhost:8080/run/ABC123/attachments/attachment2.txt"
    );
    expect(postUrls).toContain(
      "http://localhost:8080/run/ABC123/attachments/attachmentNested1.txt"
    );
  });

  it("should default to results max body length of 20MB", async () => {
    const resultsFileGlobs = ["src/__tests__/resultsDir1/*.xml"];
    const serverUrl = "http://localhost:8080";

    mockAxios
      .onPost("http://localhost:8080/groupedResults")
      .reply(200, { id: "ABC123", uri: "/tests/ABC123" });

    await run(
      {
        resultsFileGlobs,
        attachments: null,
        serverUrl,
        resultsMaxSizeMB: "20",
      },
      {},
      null,
      "projektor.none.json"
    );

    expect(mockAxios.history.post.length).toBe(1);

    const postMaxBodyLength = mockAxios.history.post[0].maxBodyLength;
    expect(postMaxBodyLength).toEqual(20971520);
  });

  it("should support customizable results max body length", async () => {
    const resultsFileGlobs = ["src/__tests__/resultsDir1/*.xml"];
    const serverUrl = "http://localhost:8080";

    mockAxios
      .onPost("http://localhost:8080/groupedResults")
      .reply(200, { id: "ABC123", uri: "/tests/ABC123" });

    await run(
      {
        resultsFileGlobs,
        attachments: null,
        serverUrl,
        resultsMaxSizeMB: "30",
      },
      {},
      null,
      "projektor.none.json"
    );

    expect(mockAxios.history.post.length).toBe(1);

    const postMaxBodyLength = mockAxios.history.post[0].maxBodyLength;
    expect(postMaxBodyLength).toEqual(31457280);
  });

  it("should log message when no test results found", async () => {
    const serverUrl = "http://localhost:8080";
    const resultsFileGlobs = ["does_not_exist/*.xml"];
    const compressionEnabled = false;

    await run(
      { resultsFileGlobs, serverUrl, compressionEnabled },
      {},
      null,
      "projektor.none.json"
    );

    expect(mockAxios.history.post.length).toBe(0);

    expect(consoleLog).toHaveBeenCalledWith(
      "No test results files found in locations does_not_exist/*.xml"
    );
  });
});
