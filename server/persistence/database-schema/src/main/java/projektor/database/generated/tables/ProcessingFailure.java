/*
 * This file is generated by jOOQ.
 */
package projektor.database.generated.tables;


import java.time.LocalDateTime;
import java.util.Arrays;
import java.util.List;

import org.jooq.Field;
import org.jooq.ForeignKey;
import org.jooq.Identity;
import org.jooq.Index;
import org.jooq.Name;
import org.jooq.Record;
import org.jooq.Row6;
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
import projektor.database.generated.tables.records.ProcessingFailureRecord;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class ProcessingFailure extends TableImpl<ProcessingFailureRecord> {

    private static final long serialVersionUID = 1L;

    /**
     * The reference instance of <code>public.processing_failure</code>
     */
    public static final ProcessingFailure PROCESSING_FAILURE = new ProcessingFailure();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<ProcessingFailureRecord> getRecordType() {
        return ProcessingFailureRecord.class;
    }

    /**
     * The column <code>public.processing_failure.id</code>.
     */
    public final TableField<ProcessingFailureRecord, Long> ID = createField(DSL.name("id"), SQLDataType.BIGINT.nullable(false).identity(true), this, "");

    /**
     * The column <code>public.processing_failure.public_id</code>.
     */
    public final TableField<ProcessingFailureRecord, String> PUBLIC_ID = createField(DSL.name("public_id"), SQLDataType.VARCHAR(12), this, "");

    /**
     * The column <code>public.processing_failure.body</code>.
     */
    public final TableField<ProcessingFailureRecord, String> BODY = createField(DSL.name("body"), SQLDataType.CLOB, this, "");

    /**
     * The column <code>public.processing_failure.failure</code>.
     */
    public final TableField<ProcessingFailureRecord, String> FAILURE = createField(DSL.name("failure"), SQLDataType.CLOB, this, "");

    /**
     * The column <code>public.processing_failure.body_type</code>.
     */
    public final TableField<ProcessingFailureRecord, String> BODY_TYPE = createField(DSL.name("body_type"), SQLDataType.CLOB.nullable(false), this, "");

    /**
     * The column <code>public.processing_failure.created_timestamp</code>.
     */
    public final TableField<ProcessingFailureRecord, LocalDateTime> CREATED_TIMESTAMP = createField(DSL.name("created_timestamp"), SQLDataType.LOCALDATETIME(6).nullable(false), this, "");

    private ProcessingFailure(Name alias, Table<ProcessingFailureRecord> aliased) {
        this(alias, aliased, null);
    }

    private ProcessingFailure(Name alias, Table<ProcessingFailureRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""), TableOptions.table());
    }

    /**
     * Create an aliased <code>public.processing_failure</code> table reference
     */
    public ProcessingFailure(String alias) {
        this(DSL.name(alias), PROCESSING_FAILURE);
    }

    /**
     * Create an aliased <code>public.processing_failure</code> table reference
     */
    public ProcessingFailure(Name alias) {
        this(alias, PROCESSING_FAILURE);
    }

    /**
     * Create a <code>public.processing_failure</code> table reference
     */
    public ProcessingFailure() {
        this(DSL.name("processing_failure"), null);
    }

    public <O extends Record> ProcessingFailure(Table<O> child, ForeignKey<O, ProcessingFailureRecord> key) {
        super(child, key, PROCESSING_FAILURE);
    }

    @Override
    public Schema getSchema() {
        return Public.PUBLIC;
    }

    @Override
    public List<Index> getIndexes() {
        return Arrays.<Index>asList(Indexes.IDX_PROCESSING_FAILURE_PUBLIC_ID);
    }

    @Override
    public Identity<ProcessingFailureRecord, Long> getIdentity() {
        return (Identity<ProcessingFailureRecord, Long>) super.getIdentity();
    }

    @Override
    public UniqueKey<ProcessingFailureRecord> getPrimaryKey() {
        return Keys.PROCESSING_FAILURE_PKEY;
    }

    @Override
    public List<UniqueKey<ProcessingFailureRecord>> getKeys() {
        return Arrays.<UniqueKey<ProcessingFailureRecord>>asList(Keys.PROCESSING_FAILURE_PKEY);
    }

    @Override
    public List<ForeignKey<ProcessingFailureRecord, ?>> getReferences() {
        return Arrays.<ForeignKey<ProcessingFailureRecord, ?>>asList(Keys.PROCESSING_FAILURE__PROCESSING_FAILURE_PUBLIC_ID_FKEY);
    }

    public TestRun testRun() {
        return new TestRun(this, Keys.PROCESSING_FAILURE__PROCESSING_FAILURE_PUBLIC_ID_FKEY);
    }

    @Override
    public ProcessingFailure as(String alias) {
        return new ProcessingFailure(DSL.name(alias), this);
    }

    @Override
    public ProcessingFailure as(Name alias) {
        return new ProcessingFailure(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public ProcessingFailure rename(String name) {
        return new ProcessingFailure(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public ProcessingFailure rename(Name name) {
        return new ProcessingFailure(name, null);
    }

    // -------------------------------------------------------------------------
    // Row6 type methods
    // -------------------------------------------------------------------------

    @Override
    public Row6<Long, String, String, String, String, LocalDateTime> fieldsRow() {
        return (Row6) super.fieldsRow();
    }
}
