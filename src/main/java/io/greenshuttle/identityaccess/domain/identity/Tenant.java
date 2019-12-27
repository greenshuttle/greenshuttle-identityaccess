package io.greenshuttle.identityaccess.domain.identity;

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

}
