package io.greenshuttle.identityaccess.infrastructure.datascope.aop;

import io.greenshuttle.identityaccess.infrastructure.datascope.annotation.DataScope;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.hibernate.Filter;
import org.hibernate.Session;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.persistence.EntityManager;

/**
 * @author yangzifeng
 */
@Aspect
public class DataScopeAspect {

    private final Logger logger = LoggerFactory.getLogger(DataScopeAspect.class);

    private EntityManager entityManager;

    public DataScopeAspect(EntityManager entityManager) {
        this.entityManager = entityManager;
    }

    @Pointcut(value = "@annotation(io.greenshuttle.identityaccess.infrastructure.datascope.annotation.DataScope)")
    public void pointCut() {
    }

    @Before(value = "pointCut() && @annotation(dataScope)")
    public void before(DataScope dataScope) {
        logger.info("the follow filter will be enabled : {}", dataScope.policy().getFilter());
        Session session = entityManager.unwrap(Session.class);
        Filter filter = session.enableFilter(dataScope.policy().getFilter());
        filter.setParameter("createUser", "test");
    }
}

