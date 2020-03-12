/*
 * This file is generated by jOOQ.
 */
package projektor.database.generated.tables.daos;


import java.util.List;

import javax.annotation.processing.Generated;

import org.jooq.Configuration;
import org.jooq.impl.DAOImpl;

import projektor.database.generated.tables.TestFailure;
import projektor.database.generated.tables.records.TestFailureRecord;


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
public class TestFailureDao extends DAOImpl<TestFailureRecord, projektor.database.generated.tables.pojos.TestFailure, Long> {

    /**
     * Create a new TestFailureDao without any configuration
     */
    public TestFailureDao() {
        super(TestFailure.TEST_FAILURE, projektor.database.generated.tables.pojos.TestFailure.class);
    }

    /**
     * Create a new TestFailureDao with an attached configuration
     */
    public TestFailureDao(Configuration configuration) {
        super(TestFailure.TEST_FAILURE, projektor.database.generated.tables.pojos.TestFailure.class, configuration);
    }

    @Override
    public Long getId(projektor.database.generated.tables.pojos.TestFailure object) {
        return object.getId();
    }

    /**
     * Fetch records that have <code>id BETWEEN lowerInclusive AND upperInclusive</code>
     */
    public List<projektor.database.generated.tables.pojos.TestFailure> fetchRangeOfId(Long lowerInclusive, Long upperInclusive) {
        return fetchRange(TestFailure.TEST_FAILURE.ID, lowerInclusive, upperInclusive);
    }

    /**
     * Fetch records that have <code>id IN (values)</code>
     */
    public List<projektor.database.generated.tables.pojos.TestFailure> fetchById(Long... values) {
        return fetch(TestFailure.TEST_FAILURE.ID, values);
    }

    /**
     * Fetch a unique record that has <code>id = value</code>
     */
    public projektor.database.generated.tables.pojos.TestFailure fetchOneById(Long value) {
        return fetchOne(TestFailure.TEST_FAILURE.ID, value);
    }

    /**
     * Fetch records that have <code>test_case_id BETWEEN lowerInclusive AND upperInclusive</code>
     */
    public List<projektor.database.generated.tables.pojos.TestFailure> fetchRangeOfTestCaseId(Long lowerInclusive, Long upperInclusive) {
        return fetchRange(TestFailure.TEST_FAILURE.TEST_CASE_ID, lowerInclusive, upperInclusive);
    }

    /**
     * Fetch records that have <code>test_case_id IN (values)</code>
     */
    public List<projektor.database.generated.tables.pojos.TestFailure> fetchByTestCaseId(Long... values) {
        return fetch(TestFailure.TEST_FAILURE.TEST_CASE_ID, values);
    }

    /**
     * Fetch records that have <code>failure_message BETWEEN lowerInclusive AND upperInclusive</code>
     */
    public List<projektor.database.generated.tables.pojos.TestFailure> fetchRangeOfFailureMessage(String lowerInclusive, String upperInclusive) {
        return fetchRange(TestFailure.TEST_FAILURE.FAILURE_MESSAGE, lowerInclusive, upperInclusive);
    }

    /**
     * Fetch records that have <code>failure_message IN (values)</code>
     */
    public List<projektor.database.generated.tables.pojos.TestFailure> fetchByFailureMessage(String... values) {
        return fetch(TestFailure.TEST_FAILURE.FAILURE_MESSAGE, values);
    }

    /**
     * Fetch records that have <code>failure_type BETWEEN lowerInclusive AND upperInclusive</code>
     */
    public List<projektor.database.generated.tables.pojos.TestFailure> fetchRangeOfFailureType(String lowerInclusive, String upperInclusive) {
        return fetchRange(TestFailure.TEST_FAILURE.FAILURE_TYPE, lowerInclusive, upperInclusive);
    }

    /**
     * Fetch records that have <code>failure_type IN (values)</code>
     */
    public List<projektor.database.generated.tables.pojos.TestFailure> fetchByFailureType(String... values) {
        return fetch(TestFailure.TEST_FAILURE.FAILURE_TYPE, values);
    }

    /**
     * Fetch records that have <code>failure_text BETWEEN lowerInclusive AND upperInclusive</code>
     */
    public List<projektor.database.generated.tables.pojos.TestFailure> fetchRangeOfFailureText(String lowerInclusive, String upperInclusive) {
        return fetchRange(TestFailure.TEST_FAILURE.FAILURE_TEXT, lowerInclusive, upperInclusive);
    }

    /**
     * Fetch records that have <code>failure_text IN (values)</code>
     */
    public List<projektor.database.generated.tables.pojos.TestFailure> fetchByFailureText(String... values) {
        return fetch(TestFailure.TEST_FAILURE.FAILURE_TEXT, values);
    }
}
