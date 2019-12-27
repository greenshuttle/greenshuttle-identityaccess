package io.greenshuttle.identityaccess.domain;

import io.greenshuttle.identityaccess.IdentityAccessApplication;
import io.greenshuttle.identityaccess.domain.identity.User;
import io.greenshuttle.identityaccess.domain.identity.UserRepository;
import io.greenshuttle.identityaccess.domain.identity.TenantId;
import io.greenshuttle.identityaccess.infrastructure.datascope.Policy;
import org.hibernate.Filter;
import org.hibernate.Session;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.context.WebApplicationContext;

import javax.persistence.EntityManager;
import java.util.ArrayList;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = IdentityAccessApplication.class)
@Transactional
public class UserRepositoryTest {

    @Autowired
    private WebApplicationContext webApplicationContext;

    private EntityManager entityManager;

    private UserRepository userRepository;

    private List<User> users;

    @Before
    public void initBean() {
        userRepository = webApplicationContext.getBean(UserRepository.class);
        entityManager = webApplicationContext.getBean(EntityManager.class);
        users = userBuilder();
    }

    private static List<User> userBuilder() {
        TenantId tenantId = new TenantId("123456");
        User a = new User("1", "john", "test", tenantId);
        User b = new User("2", "marry", "test", tenantId);
        User c = new User("3", "bob", "admin", tenantId);
        List<User> list = new ArrayList<>(3);
        list.add(a);
        list.add(b);
        list.add(c);
        return list;
    }

    @Test
    public void testOwnerFilter() {
        Session session = entityManager.unwrap(Session.class);
        Filter filter = session.enableFilter(Policy.OWN.getFilter());
        filter.setParameter("createUser", "test");
        userRepository.saveAll(users);
        int size = userRepository.findAll().size();
        assertThat(size).isEqualTo(users.size() - 1);
    }

}