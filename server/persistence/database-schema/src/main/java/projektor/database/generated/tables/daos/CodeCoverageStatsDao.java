/*
 * This file is generated by jOOQ.
 */
package projektor.database.generated.tables.daos;


import java.util.List;
import java.util.Optional;

import org.jooq.Configuration;
import org.jooq.impl.DAOImpl;

import projektor.database.generated.tables.CodeCoverageStats;
import projektor.database.generated.tables.records.CodeCoverageStatsRecord;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class CodeCoverageStatsDao extends DAOImpl<CodeCoverageStatsRecord, projektor.database.generated.tables.pojos.CodeCoverageStats, Long> {

    /**
     * Create a new CodeCoverageStatsDao without any configuration
     */
    public CodeCoverageStatsDao() {
        super(CodeCoverageStats.CODE_COVERAGE_STATS, projektor.database.generated.tables.pojos.CodeCoverageStats.class);
    }

    /**
     * Create a new CodeCoverageStatsDao with an attached configuration
     */
    public CodeCoverageStatsDao(Configuration configuration) {
        super(CodeCoverageStats.CODE_COVERAGE_STATS, projektor.database.generated.tables.pojos.CodeCoverageStats.class, configuration);
    }

    @Override
    public Long getId(projektor.database.generated.tables.pojos.CodeCoverageStats object) {
        return object.getId();
    }

    /**
     * Fetch records that have <code>id BETWEEN lowerInclusive AND
     * upperInclusive</code>
     */
    public List<projektor.database.generated.tables.pojos.CodeCoverageStats> fetchRangeOfId(Long lowerInclusive, Long upperInclusive) {
        return fetchRange(CodeCoverageStats.CODE_COVERAGE_STATS.ID, lowerInclusive, upperInclusive);
    }

    /**
     * Fetch records that have <code>id IN (values)</code>
     */
    public List<projektor.database.generated.tables.pojos.CodeCoverageStats> fetchById(Long... values) {
        return fetch(CodeCoverageStats.CODE_COVERAGE_STATS.ID, values);
    }

    /**
     * Fetch a unique record that has <code>id = value</code>
     */
    public projektor.database.generated.tables.pojos.CodeCoverageStats fetchOneById(Long value) {
        return fetchOne(CodeCoverageStats.CODE_COVERAGE_STATS.ID, value);
    }

    /**
     * Fetch a unique record that has <code>id = value</code>
     */
    public Optional<projektor.database.generated.tables.pojos.CodeCoverageStats> fetchOptionalById(Long value) {
        return fetchOptional(CodeCoverageStats.CODE_COVERAGE_STATS.ID, value);
    }

    /**
     * Fetch records that have <code>code_coverage_run_id BETWEEN lowerInclusive
     * AND upperInclusive</code>
     */
    public List<projektor.database.generated.tables.pojos.CodeCoverageStats> fetchRangeOfCodeCoverageRunId(Long lowerInclusive, Long upperInclusive) {
        return fetchRange(CodeCoverageStats.CODE_COVERAGE_STATS.CODE_COVERAGE_RUN_ID, lowerInclusive, upperInclusive);
    }

    /**
     * Fetch records that have <code>code_coverage_run_id IN (values)</code>
     */
    public List<projektor.database.generated.tables.pojos.CodeCoverageStats> fetchByCodeCoverageRunId(Long... values) {
        return fetch(CodeCoverageStats.CODE_COVERAGE_STATS.CODE_COVERAGE_RUN_ID, values);
    }

    /**
     * Fetch records that have <code>scope BETWEEN lowerInclusive AND
     * upperInclusive</code>
     */
    public List<projektor.database.generated.tables.pojos.CodeCoverageStats> fetchRangeOfScope(String lowerInclusive, String upperInclusive) {
        return fetchRange(CodeCoverageStats.CODE_COVERAGE_STATS.SCOPE, lowerInclusive, upperInclusive);
    }

    /**
     * Fetch records that have <code>scope IN (values)</code>
     */
    public List<projektor.database.generated.tables.pojos.CodeCoverageStats> fetchByScope(String... values) {
        return fetch(CodeCoverageStats.CODE_COVERAGE_STATS.SCOPE, values);
    }

    /**
     * Fetch records that have <code>statement_covered BETWEEN lowerInclusive
     * AND upperInclusive</code>
     */
    public List<projektor.database.generated.tables.pojos.CodeCoverageStats> fetchRangeOfStatementCovered(Integer lowerInclusive, Integer upperInclusive) {
        return fetchRange(CodeCoverageStats.CODE_COVERAGE_STATS.STATEMENT_COVERED, lowerInclusive, upperInclusive);
    }

    /**
     * Fetch records that have <code>statement_covered IN (values)</code>
     */
    public List<projektor.database.generated.tables.pojos.CodeCoverageStats> fetchByStatementCovered(Integer... values) {
        return fetch(CodeCoverageStats.CODE_COVERAGE_STATS.STATEMENT_COVERED, values);
    }

    /**
     * Fetch records that have <code>statement_missed BETWEEN lowerInclusive AND
     * upperInclusive</code>
     */
    public List<projektor.database.generated.tables.pojos.CodeCoverageStats> fetchRangeOfStatementMissed(Integer lowerInclusive, Integer upperInclusive) {
        return fetchRange(CodeCoverageStats.CODE_COVERAGE_STATS.STATEMENT_MISSED, lowerInclusive, upperInclusive);
    }

    /**
     * Fetch records that have <code>statement_missed IN (values)</code>
     */
    public List<projektor.database.generated.tables.pojos.CodeCoverageStats> fetchByStatementMissed(Integer... values) {
        return fetch(CodeCoverageStats.CODE_COVERAGE_STATS.STATEMENT_MISSED, values);
    }

    /**
     * Fetch records that have <code>line_covered BETWEEN lowerInclusive AND
     * upperInclusive</code>
     */
    public List<projektor.database.generated.tables.pojos.CodeCoverageStats> fetchRangeOfLineCovered(Integer lowerInclusive, Integer upperInclusive) {
        return fetchRange(CodeCoverageStats.CODE_COVERAGE_STATS.LINE_COVERED, lowerInclusive, upperInclusive);
    }

    /**
     * Fetch records that have <code>line_covered IN (values)</code>
     */
    public List<projektor.database.generated.tables.pojos.CodeCoverageStats> fetchByLineCovered(Integer... values) {
        return fetch(CodeCoverageStats.CODE_COVERAGE_STATS.LINE_COVERED, values);
    }

    /**
     * Fetch records that have <code>line_missed BETWEEN lowerInclusive AND
     * upperInclusive</code>
     */
    public List<projektor.database.generated.tables.pojos.CodeCoverageStats> fetchRangeOfLineMissed(Integer lowerInclusive, Integer upperInclusive) {
        return fetchRange(CodeCoverageStats.CODE_COVERAGE_STATS.LINE_MISSED, lowerInclusive, upperInclusive);
    }

    /**
     * Fetch records that have <code>line_missed IN (values)</code>
     */
    public List<projektor.database.generated.tables.pojos.CodeCoverageStats> fetchByLineMissed(Integer... values) {
        return fetch(CodeCoverageStats.CODE_COVERAGE_STATS.LINE_MISSED, values);
    }

    /**
     * Fetch records that have <code>branch_covered BETWEEN lowerInclusive AND
     * upperInclusive</code>
     */
    public List<projektor.database.generated.tables.pojos.CodeCoverageStats> fetchRangeOfBranchCovered(Integer lowerInclusive, Integer upperInclusive) {
        return fetchRange(CodeCoverageStats.CODE_COVERAGE_STATS.BRANCH_COVERED, lowerInclusive, upperInclusive);
    }

    /**
     * Fetch records that have <code>branch_covered IN (values)</code>
     */
    public List<projektor.database.generated.tables.pojos.CodeCoverageStats> fetchByBranchCovered(Integer... values) {
        return fetch(CodeCoverageStats.CODE_COVERAGE_STATS.BRANCH_COVERED, values);
    }

    /**
     * Fetch records that have <code>branch_missed BETWEEN lowerInclusive AND
     * upperInclusive</code>
     */
    public List<projektor.database.generated.tables.pojos.CodeCoverageStats> fetchRangeOfBranchMissed(Integer lowerInclusive, Integer upperInclusive) {
        return fetchRange(CodeCoverageStats.CODE_COVERAGE_STATS.BRANCH_MISSED, lowerInclusive, upperInclusive);
    }

    /**
     * Fetch records that have <code>branch_missed IN (values)</code>
     */
    public List<projektor.database.generated.tables.pojos.CodeCoverageStats> fetchByBranchMissed(Integer... values) {
        return fetch(CodeCoverageStats.CODE_COVERAGE_STATS.BRANCH_MISSED, values);
    }
}
