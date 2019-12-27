package io.greenshuttle.identityaccess.infrastructure.datascope.annotation;

import io.greenshuttle.identityaccess.infrastructure.datascope.Policy;

import java.lang.annotation.*;

/**
 * @author yangzifeng
 */
@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
@Documented
@Repeatable(DataScopes.class)
public @interface DataScope {

    String resourceCode();

    String role();

    Policy policy();
}
