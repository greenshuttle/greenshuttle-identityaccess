package io.greenshuttle.identityaccess.domain.identity;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

/**
 * @author yangzifeng
 */
@Repository
public interface TenantRepository extends JpaRepository<Tenant, String> {

    /**
     * 根据租户id寻找租户
     * @param tenantId TenantId
     * @return Tenant
     */
    Optional<Tenant> findByTenantId(TenantId tenantId);
}
