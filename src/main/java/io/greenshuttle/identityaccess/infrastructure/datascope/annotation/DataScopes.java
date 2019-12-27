package io.greenshuttle.identityaccess.infrastructure.datascope.annotation;

import java.lang.annotation.*;

/**
 * @author yangzifeng
 */
@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface DataScopes {
    DataScope[] value();
}
