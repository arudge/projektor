/*
 * This file is generated by jOOQ.
 */
package projektor.database.generated.tables;


import java.time.LocalDateTime;
import java.util.Arrays;
import java.util.List;

import org.jooq.Field;
import org.jooq.ForeignKey;
import org.jooq.Name;
import org.jooq.Record;
import org.jooq.Row3;
import org.jooq.Schema;
import org.jooq.Table;
import org.jooq.TableField;
import org.jooq.TableOptions;
import org.jooq.UniqueKey;
import org.jooq.impl.DSL;
import org.jooq.impl.SQLDataType;
import org.jooq.impl.TableImpl;

import projektor.database.generated.Keys;
import projektor.database.generated.Public;
import projektor.database.generated.tables.records.ResultsProcessingFailureRecord;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class ResultsProcessingFailure extends TableImpl<ResultsProcessingFailureRecord> {

    private static final long serialVersionUID = 1L;

    /**
     * The reference instance of <code>public.results_processing_failure</code>
     */
    public static final ResultsProcessingFailure RESULTS_PROCESSING_FAILURE = new ResultsProcessingFailure();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<ResultsProcessingFailureRecord> getRecordType() {
        return ResultsProcessingFailureRecord.class;
    }

    /**
     * The column <code>public.results_processing_failure.public_id</code>.
     */
    public final TableField<ResultsProcessingFailureRecord, String> PUBLIC_ID = createField(DSL.name("public_id"), SQLDataType.VARCHAR(12).nullable(false), this, "");

    /**
     * The column <code>public.results_processing_failure.body</code>.
     */
    public final TableField<ResultsProcessingFailureRecord, String> BODY = createField(DSL.name("body"), SQLDataType.CLOB.nullable(false), this, "");

    /**
     * The column <code>public.results_processing_failure.created_timestamp</code>.
     */
    public final TableField<ResultsProcessingFailureRecord, LocalDateTime> CREATED_TIMESTAMP = createField(DSL.name("created_timestamp"), SQLDataType.LOCALDATETIME(6), this, "");

    private ResultsProcessingFailure(Name alias, Table<ResultsProcessingFailureRecord> aliased) {
        this(alias, aliased, null);
    }

    private ResultsProcessingFailure(Name alias, Table<ResultsProcessingFailureRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""), TableOptions.table());
    }

    /**
     * Create an aliased <code>public.results_processing_failure</code> table reference
     */
    public ResultsProcessingFailure(String alias) {
        this(DSL.name(alias), RESULTS_PROCESSING_FAILURE);
    }

    /**
     * Create an aliased <code>public.results_processing_failure</code> table reference
     */
    public ResultsProcessingFailure(Name alias) {
        this(alias, RESULTS_PROCESSING_FAILURE);
    }

    /**
     * Create a <code>public.results_processing_failure</code> table reference
     */
    public ResultsProcessingFailure() {
        this(DSL.name("results_processing_failure"), null);
    }

    public <O extends Record> ResultsProcessingFailure(Table<O> child, ForeignKey<O, ResultsProcessingFailureRecord> key) {
        super(child, key, RESULTS_PROCESSING_FAILURE);
    }

    @Override
    public Schema getSchema() {
        return Public.PUBLIC;
    }

    @Override
    public UniqueKey<ResultsProcessingFailureRecord> getPrimaryKey() {
        return Keys.RESULTS_PROCESSING_FAILURE_PKEY;
    }

    @Override
    public List<UniqueKey<ResultsProcessingFailureRecord>> getKeys() {
        return Arrays.<UniqueKey<ResultsProcessingFailureRecord>>asList(Keys.RESULTS_PROCESSING_FAILURE_PKEY);
    }

    @Override
    public List<ForeignKey<ResultsProcessingFailureRecord, ?>> getReferences() {
        return Arrays.<ForeignKey<ResultsProcessingFailureRecord, ?>>asList(Keys.RESULTS_PROCESSING_FAILURE__RESULTS_PROCESSING_FAILURE_PUBLIC_ID_FKEY);
    }

    public ResultsProcessing resultsProcessing() {
        return new ResultsProcessing(this, Keys.RESULTS_PROCESSING_FAILURE__RESULTS_PROCESSING_FAILURE_PUBLIC_ID_FKEY);
    }

    @Override
    public ResultsProcessingFailure as(String alias) {
        return new ResultsProcessingFailure(DSL.name(alias), this);
    }

    @Override
    public ResultsProcessingFailure as(Name alias) {
        return new ResultsProcessingFailure(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public ResultsProcessingFailure rename(String name) {
        return new ResultsProcessingFailure(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public ResultsProcessingFailure rename(Name name) {
        return new ResultsProcessingFailure(name, null);
    }

    // -------------------------------------------------------------------------
    // Row3 type methods
    // -------------------------------------------------------------------------

    @Override
    public Row3<String, String, LocalDateTime> fieldsRow() {
        return (Row3) super.fieldsRow();
    }
}
