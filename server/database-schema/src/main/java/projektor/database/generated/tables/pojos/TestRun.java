/*
 * This file is generated by jOOQ.
 */
package projektor.database.generated.tables.pojos;


import java.io.Serializable;
import java.math.BigDecimal;
import java.sql.Timestamp;

import javax.annotation.Generated;


/**
 * This class is generated by jOOQ.
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.11.11"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class TestRun implements Serializable {

    private static final long serialVersionUID = 2068817104;

    private Long       id;
    private String     publicId;
    private Integer    totalTestCount;
    private Integer    totalPassingCount;
    private Integer    totalSkippedCount;
    private Integer    totalFailureCount;
    private Boolean    passed;
    private BigDecimal cumulativeDuration;
    private BigDecimal averageDuration;
    private BigDecimal slowestTestCaseDuration;
    private Timestamp  createdTimestamp;
    private Boolean    hasAttachments;

    public TestRun() {}

    public TestRun(TestRun value) {
        this.id = value.id;
        this.publicId = value.publicId;
        this.totalTestCount = value.totalTestCount;
        this.totalPassingCount = value.totalPassingCount;
        this.totalSkippedCount = value.totalSkippedCount;
        this.totalFailureCount = value.totalFailureCount;
        this.passed = value.passed;
        this.cumulativeDuration = value.cumulativeDuration;
        this.averageDuration = value.averageDuration;
        this.slowestTestCaseDuration = value.slowestTestCaseDuration;
        this.createdTimestamp = value.createdTimestamp;
        this.hasAttachments = value.hasAttachments;
    }

    public TestRun(
        Long       id,
        String     publicId,
        Integer    totalTestCount,
        Integer    totalPassingCount,
        Integer    totalSkippedCount,
        Integer    totalFailureCount,
        Boolean    passed,
        BigDecimal cumulativeDuration,
        BigDecimal averageDuration,
        BigDecimal slowestTestCaseDuration,
        Timestamp  createdTimestamp,
        Boolean    hasAttachments
    ) {
        this.id = id;
        this.publicId = publicId;
        this.totalTestCount = totalTestCount;
        this.totalPassingCount = totalPassingCount;
        this.totalSkippedCount = totalSkippedCount;
        this.totalFailureCount = totalFailureCount;
        this.passed = passed;
        this.cumulativeDuration = cumulativeDuration;
        this.averageDuration = averageDuration;
        this.slowestTestCaseDuration = slowestTestCaseDuration;
        this.createdTimestamp = createdTimestamp;
        this.hasAttachments = hasAttachments;
    }

    public Long getId() {
        return this.id;
    }

    public TestRun setId(Long id) {
        this.id = id;
        return this;
    }

    public String getPublicId() {
        return this.publicId;
    }

    public TestRun setPublicId(String publicId) {
        this.publicId = publicId;
        return this;
    }

    public Integer getTotalTestCount() {
        return this.totalTestCount;
    }

    public TestRun setTotalTestCount(Integer totalTestCount) {
        this.totalTestCount = totalTestCount;
        return this;
    }

    public Integer getTotalPassingCount() {
        return this.totalPassingCount;
    }

    public TestRun setTotalPassingCount(Integer totalPassingCount) {
        this.totalPassingCount = totalPassingCount;
        return this;
    }

    public Integer getTotalSkippedCount() {
        return this.totalSkippedCount;
    }

    public TestRun setTotalSkippedCount(Integer totalSkippedCount) {
        this.totalSkippedCount = totalSkippedCount;
        return this;
    }

    public Integer getTotalFailureCount() {
        return this.totalFailureCount;
    }

    public TestRun setTotalFailureCount(Integer totalFailureCount) {
        this.totalFailureCount = totalFailureCount;
        return this;
    }

    public Boolean getPassed() {
        return this.passed;
    }

    public TestRun setPassed(Boolean passed) {
        this.passed = passed;
        return this;
    }

    public BigDecimal getCumulativeDuration() {
        return this.cumulativeDuration;
    }

    public TestRun setCumulativeDuration(BigDecimal cumulativeDuration) {
        this.cumulativeDuration = cumulativeDuration;
        return this;
    }

    public BigDecimal getAverageDuration() {
        return this.averageDuration;
    }

    public TestRun setAverageDuration(BigDecimal averageDuration) {
        this.averageDuration = averageDuration;
        return this;
    }

    public BigDecimal getSlowestTestCaseDuration() {
        return this.slowestTestCaseDuration;
    }

    public TestRun setSlowestTestCaseDuration(BigDecimal slowestTestCaseDuration) {
        this.slowestTestCaseDuration = slowestTestCaseDuration;
        return this;
    }

    public Timestamp getCreatedTimestamp() {
        return this.createdTimestamp;
    }

    public TestRun setCreatedTimestamp(Timestamp createdTimestamp) {
        this.createdTimestamp = createdTimestamp;
        return this;
    }

    public Boolean getHasAttachments() {
        return this.hasAttachments;
    }

    public TestRun setHasAttachments(Boolean hasAttachments) {
        this.hasAttachments = hasAttachments;
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
        final TestRun other = (TestRun) obj;
        if (id == null) {
            if (other.id != null)
                return false;
        }
        else if (!id.equals(other.id))
            return false;
        if (publicId == null) {
            if (other.publicId != null)
                return false;
        }
        else if (!publicId.equals(other.publicId))
            return false;
        if (totalTestCount == null) {
            if (other.totalTestCount != null)
                return false;
        }
        else if (!totalTestCount.equals(other.totalTestCount))
            return false;
        if (totalPassingCount == null) {
            if (other.totalPassingCount != null)
                return false;
        }
        else if (!totalPassingCount.equals(other.totalPassingCount))
            return false;
        if (totalSkippedCount == null) {
            if (other.totalSkippedCount != null)
                return false;
        }
        else if (!totalSkippedCount.equals(other.totalSkippedCount))
            return false;
        if (totalFailureCount == null) {
            if (other.totalFailureCount != null)
                return false;
        }
        else if (!totalFailureCount.equals(other.totalFailureCount))
            return false;
        if (passed == null) {
            if (other.passed != null)
                return false;
        }
        else if (!passed.equals(other.passed))
            return false;
        if (cumulativeDuration == null) {
            if (other.cumulativeDuration != null)
                return false;
        }
        else if (!cumulativeDuration.equals(other.cumulativeDuration))
            return false;
        if (averageDuration == null) {
            if (other.averageDuration != null)
                return false;
        }
        else if (!averageDuration.equals(other.averageDuration))
            return false;
        if (slowestTestCaseDuration == null) {
            if (other.slowestTestCaseDuration != null)
                return false;
        }
        else if (!slowestTestCaseDuration.equals(other.slowestTestCaseDuration))
            return false;
        if (createdTimestamp == null) {
            if (other.createdTimestamp != null)
                return false;
        }
        else if (!createdTimestamp.equals(other.createdTimestamp))
            return false;
        if (hasAttachments == null) {
            if (other.hasAttachments != null)
                return false;
        }
        else if (!hasAttachments.equals(other.hasAttachments))
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((this.id == null) ? 0 : this.id.hashCode());
        result = prime * result + ((this.publicId == null) ? 0 : this.publicId.hashCode());
        result = prime * result + ((this.totalTestCount == null) ? 0 : this.totalTestCount.hashCode());
        result = prime * result + ((this.totalPassingCount == null) ? 0 : this.totalPassingCount.hashCode());
        result = prime * result + ((this.totalSkippedCount == null) ? 0 : this.totalSkippedCount.hashCode());
        result = prime * result + ((this.totalFailureCount == null) ? 0 : this.totalFailureCount.hashCode());
        result = prime * result + ((this.passed == null) ? 0 : this.passed.hashCode());
        result = prime * result + ((this.cumulativeDuration == null) ? 0 : this.cumulativeDuration.hashCode());
        result = prime * result + ((this.averageDuration == null) ? 0 : this.averageDuration.hashCode());
        result = prime * result + ((this.slowestTestCaseDuration == null) ? 0 : this.slowestTestCaseDuration.hashCode());
        result = prime * result + ((this.createdTimestamp == null) ? 0 : this.createdTimestamp.hashCode());
        result = prime * result + ((this.hasAttachments == null) ? 0 : this.hasAttachments.hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("TestRun (");

        sb.append(id);
        sb.append(", ").append(publicId);
        sb.append(", ").append(totalTestCount);
        sb.append(", ").append(totalPassingCount);
        sb.append(", ").append(totalSkippedCount);
        sb.append(", ").append(totalFailureCount);
        sb.append(", ").append(passed);
        sb.append(", ").append(cumulativeDuration);
        sb.append(", ").append(averageDuration);
        sb.append(", ").append(slowestTestCaseDuration);
        sb.append(", ").append(createdTimestamp);
        sb.append(", ").append(hasAttachments);

        sb.append(")");
        return sb.toString();
    }
}
