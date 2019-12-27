package io.greenshuttle.identityaccess.infrastructure.datascope.aop;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

import javax.persistence.EntityManager;

/**
 * @author yangzifeng
 */
@Configuration
@EnableAspectJAutoProxy
public class AspectjConfiguration {

    @Bean
    DataScopeAspect dataScopeAspect(EntityManager entityManager) {
        return new DataScopeAspect(entityManager);
    }
}
