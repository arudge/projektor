/*
 * This file is generated by jOOQ.
 */
package projektor.database.generated.tables.pojos;


import java.io.Serializable;

import javax.annotation.processing.Generated;


/**
 * This class is generated by jOOQ.
 */
@Generated(
    value = {
        "https://www.jooq.org",
        "jOOQ version:3.13.1"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class TestRunAttachment implements Serializable {

    private static final long serialVersionUID = -154519618;

    private Long   id;
    private String fileName;
    private String objectName;
    private Long   fileSize;
    private String testRunPublicId;

    public TestRunAttachment() {}

    public TestRunAttachment(TestRunAttachment value) {
        this.id = value.id;
        this.fileName = value.fileName;
        this.objectName = value.objectName;
        this.fileSize = value.fileSize;
        this.testRunPublicId = value.testRunPublicId;
    }

    public TestRunAttachment(
        Long   id,
        String fileName,
        String objectName,
        Long   fileSize,
        String testRunPublicId
    ) {
        this.id = id;
        this.fileName = fileName;
        this.objectName = objectName;
        this.fileSize = fileSize;
        this.testRunPublicId = testRunPublicId;
    }

    public Long getId() {
        return this.id;
    }

    public TestRunAttachment setId(Long id) {
        this.id = id;
        return this;
    }

    public String getFileName() {
        return this.fileName;
    }

    public TestRunAttachment setFileName(String fileName) {
        this.fileName = fileName;
        return this;
    }

    public String getObjectName() {
        return this.objectName;
    }

    public TestRunAttachment setObjectName(String objectName) {
        this.objectName = objectName;
        return this;
    }

    public Long getFileSize() {
        return this.fileSize;
    }

    public TestRunAttachment setFileSize(Long fileSize) {
        this.fileSize = fileSize;
        return this;
    }

    public String getTestRunPublicId() {
        return this.testRunPublicId;
    }

    public TestRunAttachment setTestRunPublicId(String testRunPublicId) {
        this.testRunPublicId = testRunPublicId;
        return this;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        final TestRunAttachment other = (TestRunAttachment) obj;
        if (id == null) {
            if (other.id != null)
                return false;
        }
        else if (!id.equals(other.id))
            return false;
        if (fileName == null) {
            if (other.fileName != null)
                return false;
        }
        else if (!fileName.equals(other.fileName))
            return false;
        if (objectName == null) {
            if (other.objectName != null)
                return false;
        }
        else if (!objectName.equals(other.objectName))
            return false;
        if (fileSize == null) {
            if (other.fileSize != null)
                return false;
        }
        else if (!fileSize.equals(other.fileSize))
            return false;
        if (testRunPublicId == null) {
            if (other.testRunPublicId != null)
                return false;
        }
        else if (!testRunPublicId.equals(other.testRunPublicId))
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((this.id == null) ? 0 : this.id.hashCode());
        result = prime * result + ((this.fileName == null) ? 0 : this.fileName.hashCode());
        result = prime * result + ((this.objectName == null) ? 0 : this.objectName.hashCode());
        result = prime * result + ((this.fileSize == null) ? 0 : this.fileSize.hashCode());
        result = prime * result + ((this.testRunPublicId == null) ? 0 : this.testRunPublicId.hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("TestRunAttachment (");

        sb.append(id);
        sb.append(", ").append(fileName);
        sb.append(", ").append(objectName);
        sb.append(", ").append(fileSize);
        sb.append(", ").append(testRunPublicId);

        sb.append(")");
        return sb.toString();
    }
}
