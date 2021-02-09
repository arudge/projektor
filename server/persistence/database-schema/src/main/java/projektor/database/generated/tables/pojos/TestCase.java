/*
 * This file is generated by jOOQ.
 */
package projektor.database.generated.tables.pojos;


import java.io.Serializable;
import java.math.BigDecimal;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class TestCase implements Serializable {

    private static final long serialVersionUID = 1L;

    private Long       id;
    private Long       testSuiteId;
    private Integer    idx;
    private String     name;
    private String     packageName;
    private String     className;
    private BigDecimal duration;
    private Boolean    passed;
    private Boolean    skipped;
    private String     systemOut;
    private String     systemErr;
    private Boolean    hasSystemOut;
    private Boolean    hasSystemErr;

    public TestCase() {}

    public TestCase(TestCase value) {
        this.id = value.id;
        this.testSuiteId = value.testSuiteId;
        this.idx = value.idx;
        this.name = value.name;
        this.packageName = value.packageName;
        this.className = value.className;
        this.duration = value.duration;
        this.passed = value.passed;
        this.skipped = value.skipped;
        this.systemOut = value.systemOut;
        this.systemErr = value.systemErr;
        this.hasSystemOut = value.hasSystemOut;
        this.hasSystemErr = value.hasSystemErr;
    }

    public TestCase(
        Long       id,
        Long       testSuiteId,
        Integer    idx,
        String     name,
        String     packageName,
        String     className,
        BigDecimal duration,
        Boolean    passed,
        Boolean    skipped,
        String     systemOut,
        String     systemErr,
        Boolean    hasSystemOut,
        Boolean    hasSystemErr
    ) {
        this.id = id;
        this.testSuiteId = testSuiteId;
        this.idx = idx;
        this.name = name;
        this.packageName = packageName;
        this.className = className;
        this.duration = duration;
        this.passed = passed;
        this.skipped = skipped;
        this.systemOut = systemOut;
        this.systemErr = systemErr;
        this.hasSystemOut = hasSystemOut;
        this.hasSystemErr = hasSystemErr;
    }

    /**
     * Getter for <code>public.test_case.id</code>.
     */
    public Long getId() {
        return this.id;
    }

    /**
     * Setter for <code>public.test_case.id</code>.
     */
    public TestCase setId(Long id) {
        this.id = id;
        return this;
    }

    /**
     * Getter for <code>public.test_case.test_suite_id</code>.
     */
    public Long getTestSuiteId() {
        return this.testSuiteId;
    }

    /**
     * Setter for <code>public.test_case.test_suite_id</code>.
     */
    public TestCase setTestSuiteId(Long testSuiteId) {
        this.testSuiteId = testSuiteId;
        return this;
    }

    /**
     * Getter for <code>public.test_case.idx</code>.
     */
    public Integer getIdx() {
        return this.idx;
    }

    /**
     * Setter for <code>public.test_case.idx</code>.
     */
    public TestCase setIdx(Integer idx) {
        this.idx = idx;
        return this;
    }

    /**
     * Getter for <code>public.test_case.name</code>.
     */
    public String getName() {
        return this.name;
    }

    /**
     * Setter for <code>public.test_case.name</code>.
     */
    public TestCase setName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Getter for <code>public.test_case.package_name</code>.
     */
    public String getPackageName() {
        return this.packageName;
    }

    /**
     * Setter for <code>public.test_case.package_name</code>.
     */
    public TestCase setPackageName(String packageName) {
        this.packageName = packageName;
        return this;
    }

    /**
     * Getter for <code>public.test_case.class_name</code>.
     */
    public String getClassName() {
        return this.className;
    }

    /**
     * Setter for <code>public.test_case.class_name</code>.
     */
    public TestCase setClassName(String className) {
        this.className = className;
        return this;
    }

    /**
     * Getter for <code>public.test_case.duration</code>.
     */
    public BigDecimal getDuration() {
        return this.duration;
    }

    /**
     * Setter for <code>public.test_case.duration</code>.
     */
    public TestCase setDuration(BigDecimal duration) {
        this.duration = duration;
        return this;
    }

    /**
     * Getter for <code>public.test_case.passed</code>.
     */
    public Boolean getPassed() {
        return this.passed;
    }

    /**
     * Setter for <code>public.test_case.passed</code>.
     */
    public TestCase setPassed(Boolean passed) {
        this.passed = passed;
        return this;
    }

    /**
     * Getter for <code>public.test_case.skipped</code>.
     */
    public Boolean getSkipped() {
        return this.skipped;
    }

    /**
     * Setter for <code>public.test_case.skipped</code>.
     */
    public TestCase setSkipped(Boolean skipped) {
        this.skipped = skipped;
        return this;
    }

    /**
     * Getter for <code>public.test_case.system_out</code>.
     */
    public String getSystemOut() {
        return this.systemOut;
    }

    /**
     * Setter for <code>public.test_case.system_out</code>.
     */
    public TestCase setSystemOut(String systemOut) {
        this.systemOut = systemOut;
        return this;
    }

    /**
     * Getter for <code>public.test_case.system_err</code>.
     */
    public String getSystemErr() {
        return this.systemErr;
    }

    /**
     * Setter for <code>public.test_case.system_err</code>.
     */
    public TestCase setSystemErr(String systemErr) {
        this.systemErr = systemErr;
        return this;
    }

    /**
     * Getter for <code>public.test_case.has_system_out</code>.
     */
    public Boolean getHasSystemOut() {
        return this.hasSystemOut;
    }

    /**
     * Setter for <code>public.test_case.has_system_out</code>.
     */
    public TestCase setHasSystemOut(Boolean hasSystemOut) {
        this.hasSystemOut = hasSystemOut;
        return this;
    }

    /**
     * Getter for <code>public.test_case.has_system_err</code>.
     */
    public Boolean getHasSystemErr() {
        return this.hasSystemErr;
    }

    /**
     * Setter for <code>public.test_case.has_system_err</code>.
     */
    public TestCase setHasSystemErr(Boolean hasSystemErr) {
        this.hasSystemErr = hasSystemErr;
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
        final TestCase other = (TestCase) obj;
        if (id == null) {
            if (other.id != null)
                return false;
        }
        else if (!id.equals(other.id))
            return false;
        if (testSuiteId == null) {
            if (other.testSuiteId != null)
                return false;
        }
        else if (!testSuiteId.equals(other.testSuiteId))
            return false;
        if (idx == null) {
            if (other.idx != null)
                return false;
        }
        else if (!idx.equals(other.idx))
            return false;
        if (name == null) {
            if (other.name != null)
                return false;
        }
        else if (!name.equals(other.name))
            return false;
        if (packageName == null) {
            if (other.packageName != null)
                return false;
        }
        else if (!packageName.equals(other.packageName))
            return false;
        if (className == null) {
            if (other.className != null)
                return false;
        }
        else if (!className.equals(other.className))
            return false;
        if (duration == null) {
            if (other.duration != null)
                return false;
        }
        else if (!duration.equals(other.duration))
            return false;
        if (passed == null) {
            if (other.passed != null)
                return false;
        }
        else if (!passed.equals(other.passed))
            return false;
        if (skipped == null) {
            if (other.skipped != null)
                return false;
        }
        else if (!skipped.equals(other.skipped))
            return false;
        if (systemOut == null) {
            if (other.systemOut != null)
                return false;
        }
        else if (!systemOut.equals(other.systemOut))
            return false;
        if (systemErr == null) {
            if (other.systemErr != null)
                return false;
        }
        else if (!systemErr.equals(other.systemErr))
            return false;
        if (hasSystemOut == null) {
            if (other.hasSystemOut != null)
                return false;
        }
        else if (!hasSystemOut.equals(other.hasSystemOut))
            return false;
        if (hasSystemErr == null) {
            if (other.hasSystemErr != null)
                return false;
        }
        else if (!hasSystemErr.equals(other.hasSystemErr))
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((this.id == null) ? 0 : this.id.hashCode());
        result = prime * result + ((this.testSuiteId == null) ? 0 : this.testSuiteId.hashCode());
        result = prime * result + ((this.idx == null) ? 0 : this.idx.hashCode());
        result = prime * result + ((this.name == null) ? 0 : this.name.hashCode());
        result = prime * result + ((this.packageName == null) ? 0 : this.packageName.hashCode());
        result = prime * result + ((this.className == null) ? 0 : this.className.hashCode());
        result = prime * result + ((this.duration == null) ? 0 : this.duration.hashCode());
        result = prime * result + ((this.passed == null) ? 0 : this.passed.hashCode());
        result = prime * result + ((this.skipped == null) ? 0 : this.skipped.hashCode());
        result = prime * result + ((this.systemOut == null) ? 0 : this.systemOut.hashCode());
        result = prime * result + ((this.systemErr == null) ? 0 : this.systemErr.hashCode());
        result = prime * result + ((this.hasSystemOut == null) ? 0 : this.hasSystemOut.hashCode());
        result = prime * result + ((this.hasSystemErr == null) ? 0 : this.hasSystemErr.hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("TestCase (");

        sb.append(id);
        sb.append(", ").append(testSuiteId);
        sb.append(", ").append(idx);
        sb.append(", ").append(name);
        sb.append(", ").append(packageName);
        sb.append(", ").append(className);
        sb.append(", ").append(duration);
        sb.append(", ").append(passed);
        sb.append(", ").append(skipped);
        sb.append(", ").append(systemOut);
        sb.append(", ").append(systemErr);
        sb.append(", ").append(hasSystemOut);
        sb.append(", ").append(hasSystemErr);

        sb.append(")");
        return sb.toString();
    }
}
