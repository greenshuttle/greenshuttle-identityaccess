package io.greenshuttle.identityaccess.domain.identity;

import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 * @author yangzifeng
 */
@Embeddable
public final class TenantId {

    private static final long serialVersionUID = 1L;

    @Column(name = "tenant_id_id")
    private String id;

    public TenantId(String anId) {
        this.id = anId;
    }

    protected TenantId() {
        super();
    }

}
