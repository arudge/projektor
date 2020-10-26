/*
 * This file is generated by jOOQ.
 */
package projektor.database.generated.tables;


import java.util.Arrays;
import java.util.List;

import org.jooq.Field;
import org.jooq.ForeignKey;
import org.jooq.Identity;
import org.jooq.Index;
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

import projektor.database.generated.Indexes;
import projektor.database.generated.Keys;
import projektor.database.generated.Public;
import projektor.database.generated.tables.records.ResultsMetadataRecord;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class ResultsMetadata extends TableImpl<ResultsMetadataRecord> {

    private static final long serialVersionUID = 1L;

    /**
     * The reference instance of <code>public.results_metadata</code>
     */
    public static final ResultsMetadata RESULTS_METADATA = new ResultsMetadata();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<ResultsMetadataRecord> getRecordType() {
        return ResultsMetadataRecord.class;
    }

    /**
     * The column <code>public.results_metadata.id</code>.
     */
    public final TableField<ResultsMetadataRecord, Long> ID = createField(DSL.name("id"), SQLDataType.BIGINT.nullable(false).identity(true), this, "");

    /**
     * The column <code>public.results_metadata.test_run_id</code>.
     */
    public final TableField<ResultsMetadataRecord, Long> TEST_RUN_ID = createField(DSL.name("test_run_id"), SQLDataType.BIGINT, this, "");

    /**
     * The column <code>public.results_metadata.ci</code>.
     */
    public final TableField<ResultsMetadataRecord, Boolean> CI = createField(DSL.name("ci"), SQLDataType.BOOLEAN, this, "");

    private ResultsMetadata(Name alias, Table<ResultsMetadataRecord> aliased) {
        this(alias, aliased, null);
    }

    private ResultsMetadata(Name alias, Table<ResultsMetadataRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""), TableOptions.table());
    }

    /**
     * Create an aliased <code>public.results_metadata</code> table reference
     */
    public ResultsMetadata(String alias) {
        this(DSL.name(alias), RESULTS_METADATA);
    }

    /**
     * Create an aliased <code>public.results_metadata</code> table reference
     */
    public ResultsMetadata(Name alias) {
        this(alias, RESULTS_METADATA);
    }

    /**
     * Create a <code>public.results_metadata</code> table reference
     */
    public ResultsMetadata() {
        this(DSL.name("results_metadata"), null);
    }

    public <O extends Record> ResultsMetadata(Table<O> child, ForeignKey<O, ResultsMetadataRecord> key) {
        super(child, key, RESULTS_METADATA);
    }

    @Override
    public Schema getSchema() {
        return Public.PUBLIC;
    }

    @Override
    public List<Index> getIndexes() {
        return Arrays.<Index>asList(Indexes.RESULTS_METADATA_TEST_RUN_ID_IDX);
    }

    @Override
    public Identity<ResultsMetadataRecord, Long> getIdentity() {
        return (Identity<ResultsMetadataRecord, Long>) super.getIdentity();
    }

    @Override
    public UniqueKey<ResultsMetadataRecord> getPrimaryKey() {
        return Keys.RESULTS_METADATA_PKEY;
    }

    @Override
    public List<UniqueKey<ResultsMetadataRecord>> getKeys() {
        return Arrays.<UniqueKey<ResultsMetadataRecord>>asList(Keys.RESULTS_METADATA_PKEY);
    }

    @Override
    public List<ForeignKey<ResultsMetadataRecord, ?>> getReferences() {
        return Arrays.<ForeignKey<ResultsMetadataRecord, ?>>asList(Keys.RESULTS_METADATA__RESULTS_METADATA_TEST_RUN_ID_FKEY);
    }

    public TestRun testRun() {
        return new TestRun(this, Keys.RESULTS_METADATA__RESULTS_METADATA_TEST_RUN_ID_FKEY);
    }

    @Override
    public ResultsMetadata as(String alias) {
        return new ResultsMetadata(DSL.name(alias), this);
    }

    @Override
    public ResultsMetadata as(Name alias) {
        return new ResultsMetadata(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public ResultsMetadata rename(String name) {
        return new ResultsMetadata(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public ResultsMetadata rename(Name name) {
        return new ResultsMetadata(name, null);
    }

    // -------------------------------------------------------------------------
    // Row3 type methods
    // -------------------------------------------------------------------------

    @Override
    public Row3<Long, Long, Boolean> fieldsRow() {
        return (Row3) super.fieldsRow();
    }
}
