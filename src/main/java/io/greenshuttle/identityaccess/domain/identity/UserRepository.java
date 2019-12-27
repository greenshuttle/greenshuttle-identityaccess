package io.greenshuttle.identityaccess.domain.identity;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * @author yangzifeng
 */
@Repository
public interface UserRepository extends JpaRepository<User, String> {

}
