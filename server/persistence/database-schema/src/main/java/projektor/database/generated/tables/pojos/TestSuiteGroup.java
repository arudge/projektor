/*
 * This file is generated by jOOQ.
 */
package projektor.database.generated.tables.pojos;


import java.io.Serializable;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class TestSuiteGroup implements Serializable {

    private static final long serialVersionUID = 1L;

    private Long   id;
    private Long   testRunId;
    private String groupName;
    private String groupLabel;
    private String directory;

    public TestSuiteGroup() {}

    public TestSuiteGroup(TestSuiteGroup value) {
        this.id = value.id;
        this.testRunId = value.testRunId;
        this.groupName = value.groupName;
        this.groupLabel = value.groupLabel;
        this.directory = value.directory;
    }

    public TestSuiteGroup(
        Long   id,
        Long   testRunId,
        String groupName,
        String groupLabel,
        String directory
    ) {
        this.id = id;
        this.testRunId = testRunId;
        this.groupName = groupName;
        this.groupLabel = groupLabel;
        this.directory = directory;
    }

    /**
     * Getter for <code>public.test_suite_group.id</code>.
     */
    public Long getId() {
        return this.id;
    }

    /**
     * Setter for <code>public.test_suite_group.id</code>.
     */
    public TestSuiteGroup setId(Long id) {
        this.id = id;
        return this;
    }

    /**
     * Getter for <code>public.test_suite_group.test_run_id</code>.
     */
    public Long getTestRunId() {
        return this.testRunId;
    }

    /**
     * Setter for <code>public.test_suite_group.test_run_id</code>.
     */
    public TestSuiteGroup setTestRunId(Long testRunId) {
        this.testRunId = testRunId;
        return this;
    }

    /**
     * Getter for <code>public.test_suite_group.group_name</code>.
     */
    public String getGroupName() {
        return this.groupName;
    }

    /**
     * Setter for <code>public.test_suite_group.group_name</code>.
     */
    public TestSuiteGroup setGroupName(String groupName) {
        this.groupName = groupName;
        return this;
    }

    /**
     * Getter for <code>public.test_suite_group.group_label</code>.
     */
    public String getGroupLabel() {
        return this.groupLabel;
    }

    /**
     * Setter for <code>public.test_suite_group.group_label</code>.
     */
    public TestSuiteGroup setGroupLabel(String groupLabel) {
        this.groupLabel = groupLabel;
        return this;
    }

    /**
     * Getter for <code>public.test_suite_group.directory</code>.
     */
    public String getDirectory() {
        return this.directory;
    }

    /**
     * Setter for <code>public.test_suite_group.directory</code>.
     */
    public TestSuiteGroup setDirectory(String directory) {
        this.directory = directory;
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
        final TestSuiteGroup other = (TestSuiteGroup) obj;
        if (id == null) {
            if (other.id != null)
                return false;
        }
        else if (!id.equals(other.id))
            return false;
        if (testRunId == null) {
            if (other.testRunId != null)
                return false;
        }
        else if (!testRunId.equals(other.testRunId))
            return false;
        if (groupName == null) {
            if (other.groupName != null)
                return false;
        }
        else if (!groupName.equals(other.groupName))
            return false;
        if (groupLabel == null) {
            if (other.groupLabel != null)
                return false;
        }
        else if (!groupLabel.equals(other.groupLabel))
            return false;
        if (directory == null) {
            if (other.directory != null)
                return false;
        }
        else if (!directory.equals(other.directory))
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((this.id == null) ? 0 : this.id.hashCode());
        result = prime * result + ((this.testRunId == null) ? 0 : this.testRunId.hashCode());
        result = prime * result + ((this.groupName == null) ? 0 : this.groupName.hashCode());
        result = prime * result + ((this.groupLabel == null) ? 0 : this.groupLabel.hashCode());
        result = prime * result + ((this.directory == null) ? 0 : this.directory.hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("TestSuiteGroup (");

        sb.append(id);
        sb.append(", ").append(testRunId);
        sb.append(", ").append(groupName);
        sb.append(", ").append(groupLabel);
        sb.append(", ").append(directory);

        sb.append(")");
        return sb.toString();
    }
}
