package io.greenshuttle.identityaccess.application.service.security.oauth2;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.security.access.expression.method.MethodSecurityExpressionHandler;
import org.springframework.security.config.annotation.method.configuration.GlobalMethodSecurityConfiguration;
import org.springframework.security.oauth2.config.annotation.web.configuration.EnableResourceServer;
import org.springframework.security.oauth2.provider.expression.OAuth2MethodSecurityExpressionHandler;
import org.springframework.security.oauth2.provider.token.RemoteTokenServices;

/**
 * @author yangzifeng
 */
@Configuration
@EnableResourceServer
public class Oauth2Configuration extends GlobalMethodSecurityConfiguration {

    /**
     * 验证token是否有效，如果使用jwt，可以不用配置
     * @return RemoteTokenServices
     */
    @Primary
    @Bean
    public RemoteTokenServices tokenService() {
        RemoteTokenServices tokenService = new RemoteTokenServices();
        tokenService.setCheckTokenEndpointUrl("http://localhost:4444/oauth2/token");
        tokenService.setClientId("sampleclient");
        tokenService.setClientSecret("sampleclientsecret");
        return tokenService;
    }

    @Override
    protected MethodSecurityExpressionHandler createExpressionHandler() {
        return new OAuth2MethodSecurityExpressionHandler();
    }
}
