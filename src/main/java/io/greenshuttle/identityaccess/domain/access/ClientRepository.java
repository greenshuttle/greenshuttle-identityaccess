package io.greenshuttle.identityaccess.domain.access;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * @author yangzifeng
 */
@Repository
public interface ClientRepository extends JpaRepository<Client, String> {
}
