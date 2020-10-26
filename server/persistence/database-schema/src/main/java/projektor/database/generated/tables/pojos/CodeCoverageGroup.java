/*
 * This file is generated by jOOQ.
 */
package projektor.database.generated.tables.pojos;


import java.io.Serializable;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class CodeCoverageGroup implements Serializable {

    private static final long serialVersionUID = 1L;

    private Long   id;
    private Long   codeCoverageRunId;
    private String name;
    private Long   statsId;

    public CodeCoverageGroup() {}

    public CodeCoverageGroup(CodeCoverageGroup value) {
        this.id = value.id;
        this.codeCoverageRunId = value.codeCoverageRunId;
        this.name = value.name;
        this.statsId = value.statsId;
    }

    public CodeCoverageGroup(
        Long   id,
        Long   codeCoverageRunId,
        String name,
        Long   statsId
    ) {
        this.id = id;
        this.codeCoverageRunId = codeCoverageRunId;
        this.name = name;
        this.statsId = statsId;
    }

    /**
     * Getter for <code>public.code_coverage_group.id</code>.
     */
    public Long getId() {
        return this.id;
    }

    /**
     * Setter for <code>public.code_coverage_group.id</code>.
     */
    public CodeCoverageGroup setId(Long id) {
        this.id = id;
        return this;
    }

    /**
     * Getter for <code>public.code_coverage_group.code_coverage_run_id</code>.
     */
    public Long getCodeCoverageRunId() {
        return this.codeCoverageRunId;
    }

    /**
     * Setter for <code>public.code_coverage_group.code_coverage_run_id</code>.
     */
    public CodeCoverageGroup setCodeCoverageRunId(Long codeCoverageRunId) {
        this.codeCoverageRunId = codeCoverageRunId;
        return this;
    }

    /**
     * Getter for <code>public.code_coverage_group.name</code>.
     */
    public String getName() {
        return this.name;
    }

    /**
     * Setter for <code>public.code_coverage_group.name</code>.
     */
    public CodeCoverageGroup setName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Getter for <code>public.code_coverage_group.stats_id</code>.
     */
    public Long getStatsId() {
        return this.statsId;
    }

    /**
     * Setter for <code>public.code_coverage_group.stats_id</code>.
     */
    public CodeCoverageGroup setStatsId(Long statsId) {
        this.statsId = statsId;
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
        final CodeCoverageGroup other = (CodeCoverageGroup) obj;
        if (id == null) {
            if (other.id != null)
                return false;
        }
        else if (!id.equals(other.id))
            return false;
        if (codeCoverageRunId == null) {
            if (other.codeCoverageRunId != null)
                return false;
        }
        else if (!codeCoverageRunId.equals(other.codeCoverageRunId))
            return false;
        if (name == null) {
            if (other.name != null)
                return false;
        }
        else if (!name.equals(other.name))
            return false;
        if (statsId == null) {
            if (other.statsId != null)
                return false;
        }
        else if (!statsId.equals(other.statsId))
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((this.id == null) ? 0 : this.id.hashCode());
        result = prime * result + ((this.codeCoverageRunId == null) ? 0 : this.codeCoverageRunId.hashCode());
        result = prime * result + ((this.name == null) ? 0 : this.name.hashCode());
        result = prime * result + ((this.statsId == null) ? 0 : this.statsId.hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("CodeCoverageGroup (");

        sb.append(id);
        sb.append(", ").append(codeCoverageRunId);
        sb.append(", ").append(name);
        sb.append(", ").append(statsId);

        sb.append(")");
        return sb.toString();
    }
}
