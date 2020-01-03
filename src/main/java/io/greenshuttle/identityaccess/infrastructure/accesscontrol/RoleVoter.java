package io.greenshuttle.identityaccess.infrastructure.accesscontrol;


import org.springframework.security.access.AccessDecisionVoter;
import org.springframework.security.access.ConfigAttribute;
import org.springframework.security.core.Authentication;

import java.util.Collection;

/**
 * 实现RoleVoter有两种方式：
 *    1. 自定义RoleVoter
 *    2. 在进入领域层前实现自定义Role的获取
 *
 * @author yangzifeng
 */
public class RoleVoter implements AccessDecisionVoter<Object> {
    @Override
    public boolean supports(ConfigAttribute attribute) {
        return false;
    }

    @Override
    public boolean supports(Class<?> clazz) {
        return false;
    }

    @Override
    public int vote(Authentication authentication, Object object, Collection<ConfigAttribute> attributes) {
        return ACCESS_ABSTAIN;
    }
}
