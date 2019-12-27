package io.greenshuttle.identityaccess.domain.identity;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * @author yangzifeng
 */
@Service
public class TenantService {

    private TenantRepository tenantRepository;

    public TenantService(TenantRepository tenantRepository) {
        this.tenantRepository = tenantRepository;
    }

    @Transactional(rollbackFor = Exception.class)
    public Tenant addTenant(String tenantName, String description) {
        //TODO tenantId生成，包含关键地理信息等
        TenantId tenantId = new TenantId("123456");
        Tenant tenant = new Tenant(tenantId, tenantName,
                description, false);
        return tenantRepository.save(tenant);
    }
}
