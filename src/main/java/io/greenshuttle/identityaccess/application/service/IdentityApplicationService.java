package io.greenshuttle.identityaccess.application.service;

import io.greenshuttle.identityaccess.application.command.ActiveTenantCommand;
import io.greenshuttle.identityaccess.application.command.AddTenantCommand;
import io.greenshuttle.identityaccess.domain.identity.Tenant;
import io.greenshuttle.identityaccess.domain.identity.TenantId;
import io.greenshuttle.identityaccess.domain.identity.TenantRepository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Optional;

/**
 * @author yangzifeng
 */
@Service
public class IdentityApplicationService {

    private TenantRepository tenantRepository;

    public IdentityApplicationService(TenantRepository tenantRepository) {
        this.tenantRepository = tenantRepository;
    }

    @Transactional(rollbackFor = Exception.class)
    public Tenant addTenant(AddTenantCommand addTenantCommand) {
        //TODO tenantId生成，包含关键地理信息等
        TenantId tenantId = new TenantId("123456");
        Tenant tenant = new Tenant(tenantId, addTenantCommand.getTenantName(),
                addTenantCommand.getDescription(), false);
        return tenantRepository.save(tenant);
    }

    @Transactional(rollbackFor = Exception.class)
    public void activeTenant(ActiveTenantCommand activeTenantCommand) {
        Tenant tenant = this.existingTenant(activeTenantCommand.getTenantId());
        tenant.activate();
    }

    @Transactional(readOnly = true)
    public Tenant existingTenant(String tenantId) {
        Optional<Tenant> optionalTenant = tenantRepository.findByTenantId(new TenantId(tenantId));
        if (!optionalTenant.isPresent()) {
            throw new IllegalArgumentException(
                    "Tenant does not exist for: " + tenantId);
        }
        return optionalTenant.get();
    }
}
