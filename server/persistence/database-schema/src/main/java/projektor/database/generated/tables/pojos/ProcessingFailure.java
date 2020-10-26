/*
 * This file is generated by jOOQ.
 */
package projektor.database.generated.tables.pojos;


import java.io.Serializable;
import java.time.LocalDateTime;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class ProcessingFailure implements Serializable {

    private static final long serialVersionUID = 1L;

    private Long          id;
    private String        publicId;
    private String        body;
    private String        failure;
    private String        bodyType;
    private LocalDateTime createdTimestamp;

    public ProcessingFailure() {}

    public ProcessingFailure(ProcessingFailure value) {
        this.id = value.id;
        this.publicId = value.publicId;
        this.body = value.body;
        this.failure = value.failure;
        this.bodyType = value.bodyType;
        this.createdTimestamp = value.createdTimestamp;
    }

    public ProcessingFailure(
        Long          id,
        String        publicId,
        String        body,
        String        failure,
        String        bodyType,
        LocalDateTime createdTimestamp
    ) {
        this.id = id;
        this.publicId = publicId;
        this.body = body;
        this.failure = failure;
        this.bodyType = bodyType;
        this.createdTimestamp = createdTimestamp;
    }

    /**
     * Getter for <code>public.processing_failure.id</code>.
     */
    public Long getId() {
        return this.id;
    }

    /**
     * Setter for <code>public.processing_failure.id</code>.
     */
    public ProcessingFailure setId(Long id) {
        this.id = id;
        return this;
    }

    /**
     * Getter for <code>public.processing_failure.public_id</code>.
     */
    public String getPublicId() {
        return this.publicId;
    }

    /**
     * Setter for <code>public.processing_failure.public_id</code>.
     */
    public ProcessingFailure setPublicId(String publicId) {
        this.publicId = publicId;
        return this;
    }

    /**
     * Getter for <code>public.processing_failure.body</code>.
     */
    public String getBody() {
        return this.body;
    }

    /**
     * Setter for <code>public.processing_failure.body</code>.
     */
    public ProcessingFailure setBody(String body) {
        this.body = body;
        return this;
    }

    /**
     * Getter for <code>public.processing_failure.failure</code>.
     */
    public String getFailure() {
        return this.failure;
    }

    /**
     * Setter for <code>public.processing_failure.failure</code>.
     */
    public ProcessingFailure setFailure(String failure) {
        this.failure = failure;
        return this;
    }

    /**
     * Getter for <code>public.processing_failure.body_type</code>.
     */
    public String getBodyType() {
        return this.bodyType;
    }

    /**
     * Setter for <code>public.processing_failure.body_type</code>.
     */
    public ProcessingFailure setBodyType(String bodyType) {
        this.bodyType = bodyType;
        return this;
    }

    /**
     * Getter for <code>public.processing_failure.created_timestamp</code>.
     */
    public LocalDateTime getCreatedTimestamp() {
        return this.createdTimestamp;
    }

    /**
     * Setter for <code>public.processing_failure.created_timestamp</code>.
     */
    public ProcessingFailure setCreatedTimestamp(LocalDateTime createdTimestamp) {
        this.createdTimestamp = createdTimestamp;
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
        final ProcessingFailure other = (ProcessingFailure) obj;
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
        if (body == null) {
            if (other.body != null)
                return false;
        }
        else if (!body.equals(other.body))
            return false;
        if (failure == null) {
            if (other.failure != null)
                return false;
        }
        else if (!failure.equals(other.failure))
            return false;
        if (bodyType == null) {
            if (other.bodyType != null)
                return false;
        }
        else if (!bodyType.equals(other.bodyType))
            return false;
        if (createdTimestamp == null) {
            if (other.createdTimestamp != null)
                return false;
        }
        else if (!createdTimestamp.equals(other.createdTimestamp))
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((this.id == null) ? 0 : this.id.hashCode());
        result = prime * result + ((this.publicId == null) ? 0 : this.publicId.hashCode());
        result = prime * result + ((this.body == null) ? 0 : this.body.hashCode());
        result = prime * result + ((this.failure == null) ? 0 : this.failure.hashCode());
        result = prime * result + ((this.bodyType == null) ? 0 : this.bodyType.hashCode());
        result = prime * result + ((this.createdTimestamp == null) ? 0 : this.createdTimestamp.hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("ProcessingFailure (");

        sb.append(id);
        sb.append(", ").append(publicId);
        sb.append(", ").append(body);
        sb.append(", ").append(failure);
        sb.append(", ").append(bodyType);
        sb.append(", ").append(createdTimestamp);

        sb.append(")");
        return sb.toString();
    }
}
