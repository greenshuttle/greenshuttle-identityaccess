package io.greenshuttle.identityaccess.infrastructure.persistence;

import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

/**
 * @author yangzifeng
 */
@Configuration
@EnableJpaRepositories("io.greenshuttle.identityaccess")
public class DatabaseConfiguration {

}
