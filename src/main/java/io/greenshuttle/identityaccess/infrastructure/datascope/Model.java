package io.greenshuttle.identityaccess.infrastructure.datascope;

import java.util.Collections;
import java.util.Set;

/**
 * @author yangzifeng
 */
public class Model {

    /**
     * 资源编号，从接口注解上获取
     */
    private String resourceCode;

    /**
     * 策略启用的过滤器，可多个，用<code>,</code>隔开
     */
    private Set<String> filter = Collections.emptySet();

    /**
     * 启用对应角色
     */
    private String role;

    /**
     * 过滤可见字段，暂时没有实现
     */
    private Set<String> fields;
}
