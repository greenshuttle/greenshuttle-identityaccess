package io.greenshuttle.identityaccess.domain.identity;

import io.greenshuttle.identityaccess.infrastructure.eventpublisher.DomainEventPublisher;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.io.Serializable;

/**
 * @author yangzifeng
 */
@Table(name = "iam_tenant")
@Entity
public class Tenant implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    @GenericGenerator(name = "jpa-uuid", strategy = "uuid2")
    @GeneratedValue(generator = "jpa-uuid")
    @Column(name = "id", nullable = false, length = 40)
    private String id;

    @Column(name = "name")
    private String name;

    @Column(name = "description")
    private String description;

    @Column(name = "active")
    private boolean active;

    @Embedded
    private TenantId tenantId;

    public Tenant(TenantId aTenantId, String aName, String aDescription, boolean anActive) {
        this.setActive(anActive);
        this.setDescription(aDescription);
        this.setName(aName);
        this.setTenantId(aTenantId);
    }

    protected void setActive(boolean anActive) {
        this.active = anActive;
    }

    protected void setDescription(String aDescription) {
        this.description = aDescription;
    }

    protected void setName(String aName) {
        this.name = aName;
    }

    protected void setTenantId(TenantId aTenantId) {
        this.tenantId = aTenantId;
    }

    public void activate() {
        if (!this.isActive()) {
            this.setActive(true);
            // TODO 发送租户启用事件
        }
    }

    private boolean isActive() {
        return this.active;
    }
}
