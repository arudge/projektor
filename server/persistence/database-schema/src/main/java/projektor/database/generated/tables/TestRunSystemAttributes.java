/*
 * This file is generated by jOOQ.
 */
package projektor.database.generated.tables;


import java.util.Arrays;
import java.util.List;

import org.jooq.Field;
import org.jooq.ForeignKey;
import org.jooq.Name;
import org.jooq.Record;
import org.jooq.Row2;
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
import projektor.database.generated.tables.records.TestRunSystemAttributesRecord;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class TestRunSystemAttributes extends TableImpl<TestRunSystemAttributesRecord> {

    private static final long serialVersionUID = 1L;

    /**
     * The reference instance of <code>public.test_run_system_attributes</code>
     */
    public static final TestRunSystemAttributes TEST_RUN_SYSTEM_ATTRIBUTES = new TestRunSystemAttributes();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<TestRunSystemAttributesRecord> getRecordType() {
        return TestRunSystemAttributesRecord.class;
    }

    /**
     * The column
     * <code>public.test_run_system_attributes.test_run_public_id</code>.
     */
    public final TableField<TestRunSystemAttributesRecord, String> TEST_RUN_PUBLIC_ID = createField(DSL.name("test_run_public_id"), SQLDataType.VARCHAR(12).nullable(false), this, "");

    /**
     * The column <code>public.test_run_system_attributes.pinned</code>.
     */
    public final TableField<TestRunSystemAttributesRecord, Boolean> PINNED = createField(DSL.name("pinned"), SQLDataType.BOOLEAN.nullable(false), this, "");

    private TestRunSystemAttributes(Name alias, Table<TestRunSystemAttributesRecord> aliased) {
        this(alias, aliased, null);
    }

    private TestRunSystemAttributes(Name alias, Table<TestRunSystemAttributesRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""), TableOptions.table());
    }

    /**
     * Create an aliased <code>public.test_run_system_attributes</code> table
     * reference
     */
    public TestRunSystemAttributes(String alias) {
        this(DSL.name(alias), TEST_RUN_SYSTEM_ATTRIBUTES);
    }

    /**
     * Create an aliased <code>public.test_run_system_attributes</code> table
     * reference
     */
    public TestRunSystemAttributes(Name alias) {
        this(alias, TEST_RUN_SYSTEM_ATTRIBUTES);
    }

    /**
     * Create a <code>public.test_run_system_attributes</code> table reference
     */
    public TestRunSystemAttributes() {
        this(DSL.name("test_run_system_attributes"), null);
    }

    public <O extends Record> TestRunSystemAttributes(Table<O> child, ForeignKey<O, TestRunSystemAttributesRecord> key) {
        super(child, key, TEST_RUN_SYSTEM_ATTRIBUTES);
    }

    @Override
    public Schema getSchema() {
        return aliased() ? null : Public.PUBLIC;
    }

    @Override
    public UniqueKey<TestRunSystemAttributesRecord> getPrimaryKey() {
        return Keys.TEST_RUN_SYSTEM_ATTRIBUTES_PKEY;
    }

    @Override
    public List<ForeignKey<TestRunSystemAttributesRecord, ?>> getReferences() {
        return Arrays.asList(Keys.TEST_RUN_SYSTEM_ATTRIBUTES__TEST_RUN_SYSTEM_ATTRIBUTES_TEST_RUN_PUBLIC_ID_FKEY);
    }

    private transient TestRun _testRun;

    /**
     * Get the implicit join path to the <code>public.test_run</code> table.
     */
    public TestRun testRun() {
        if (_testRun == null)
            _testRun = new TestRun(this, Keys.TEST_RUN_SYSTEM_ATTRIBUTES__TEST_RUN_SYSTEM_ATTRIBUTES_TEST_RUN_PUBLIC_ID_FKEY);

        return _testRun;
    }

    @Override
    public TestRunSystemAttributes as(String alias) {
        return new TestRunSystemAttributes(DSL.name(alias), this);
    }

    @Override
    public TestRunSystemAttributes as(Name alias) {
        return new TestRunSystemAttributes(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public TestRunSystemAttributes rename(String name) {
        return new TestRunSystemAttributes(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public TestRunSystemAttributes rename(Name name) {
        return new TestRunSystemAttributes(name, null);
    }

    // -------------------------------------------------------------------------
    // Row2 type methods
    // -------------------------------------------------------------------------

    @Override
    public Row2<String, Boolean> fieldsRow() {
        return (Row2) super.fieldsRow();
    }
}
