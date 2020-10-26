/*
 * This file is generated by jOOQ.
 */
package projektor.database.generated;


import org.jooq.Sequence;
import org.jooq.impl.Internal;
import org.jooq.impl.SQLDataType;


/**
 * Convenience access to all sequences in public.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Sequences {

    /**
     * The sequence <code>public.code_coverage_file_id_seq</code>
     */
    public static final Sequence<Long> CODE_COVERAGE_FILE_ID_SEQ = Internal.createSequence("code_coverage_file_id_seq", Public.PUBLIC, SQLDataType.BIGINT.nullable(false), null, null, null, null, false, null);

    /**
     * The sequence <code>public.code_coverage_group_id_seq</code>
     */
    public static final Sequence<Long> CODE_COVERAGE_GROUP_ID_SEQ = Internal.createSequence("code_coverage_group_id_seq", Public.PUBLIC, SQLDataType.BIGINT.nullable(false), null, null, null, null, false, null);

    /**
     * The sequence <code>public.code_coverage_run_id_seq</code>
     */
    public static final Sequence<Long> CODE_COVERAGE_RUN_ID_SEQ = Internal.createSequence("code_coverage_run_id_seq", Public.PUBLIC, SQLDataType.BIGINT.nullable(false), null, null, null, null, false, null);

    /**
     * The sequence <code>public.code_coverage_stats_id_seq</code>
     */
    public static final Sequence<Long> CODE_COVERAGE_STATS_ID_SEQ = Internal.createSequence("code_coverage_stats_id_seq", Public.PUBLIC, SQLDataType.BIGINT.nullable(false), null, null, null, null, false, null);

    /**
     * The sequence <code>public.git_metadata_id_seq</code>
     */
    public static final Sequence<Long> GIT_METADATA_ID_SEQ = Internal.createSequence("git_metadata_id_seq", Public.PUBLIC, SQLDataType.BIGINT.nullable(false), null, null, null, null, false, null);

    /**
     * The sequence <code>public.processing_failure_id_seq</code>
     */
    public static final Sequence<Long> PROCESSING_FAILURE_ID_SEQ = Internal.createSequence("processing_failure_id_seq", Public.PUBLIC, SQLDataType.BIGINT.nullable(false), null, null, null, null, false, null);

    /**
     * The sequence <code>public.results_metadata_id_seq</code>
     */
    public static final Sequence<Long> RESULTS_METADATA_ID_SEQ = Internal.createSequence("results_metadata_id_seq", Public.PUBLIC, SQLDataType.BIGINT.nullable(false), null, null, null, null, false, null);

    /**
     * The sequence <code>public.test_case_id_seq</code>
     */
    public static final Sequence<Long> TEST_CASE_ID_SEQ = Internal.createSequence("test_case_id_seq", Public.PUBLIC, SQLDataType.BIGINT.nullable(false), null, null, null, null, false, null);

    /**
     * The sequence <code>public.test_case_test_suite_id_seq</code>
     */
    public static final Sequence<Long> TEST_CASE_TEST_SUITE_ID_SEQ = Internal.createSequence("test_case_test_suite_id_seq", Public.PUBLIC, SQLDataType.BIGINT.nullable(false), null, null, null, null, false, null);

    /**
     * The sequence <code>public.test_failure_id_seq</code>
     */
    public static final Sequence<Long> TEST_FAILURE_ID_SEQ = Internal.createSequence("test_failure_id_seq", Public.PUBLIC, SQLDataType.BIGINT.nullable(false), null, null, null, null, false, null);

    /**
     * The sequence <code>public.test_failure_test_case_id_seq</code>
     */
    public static final Sequence<Long> TEST_FAILURE_TEST_CASE_ID_SEQ = Internal.createSequence("test_failure_test_case_id_seq", Public.PUBLIC, SQLDataType.BIGINT.nullable(false), null, null, null, null, false, null);

    /**
     * The sequence <code>public.test_run_attachment_id_seq</code>
     */
    public static final Sequence<Long> TEST_RUN_ATTACHMENT_ID_SEQ = Internal.createSequence("test_run_attachment_id_seq", Public.PUBLIC, SQLDataType.BIGINT.nullable(false), null, null, null, null, false, null);

    /**
     * The sequence <code>public.test_run_id_seq</code>
     */
    public static final Sequence<Long> TEST_RUN_ID_SEQ = Internal.createSequence("test_run_id_seq", Public.PUBLIC, SQLDataType.BIGINT.nullable(false), null, null, null, null, false, null);

    /**
     * The sequence <code>public.test_suite_group_id_seq</code>
     */
    public static final Sequence<Long> TEST_SUITE_GROUP_ID_SEQ = Internal.createSequence("test_suite_group_id_seq", Public.PUBLIC, SQLDataType.BIGINT.nullable(false), null, null, null, null, false, null);

    /**
     * The sequence <code>public.test_suite_id_seq</code>
     */
    public static final Sequence<Long> TEST_SUITE_ID_SEQ = Internal.createSequence("test_suite_id_seq", Public.PUBLIC, SQLDataType.BIGINT.nullable(false), null, null, null, null, false, null);

    /**
     * The sequence <code>public.test_suite_test_run_id_seq</code>
     */
    public static final Sequence<Long> TEST_SUITE_TEST_RUN_ID_SEQ = Internal.createSequence("test_suite_test_run_id_seq", Public.PUBLIC, SQLDataType.BIGINT.nullable(false), null, null, null, null, false, null);
}
