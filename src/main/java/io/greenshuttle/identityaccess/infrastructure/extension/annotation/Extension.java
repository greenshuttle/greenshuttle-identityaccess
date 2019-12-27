package io.greenshuttle.identityaccess.infrastructure.extension.annotation;

/**
 * @author yangzifeng
 */
public @interface Extension {

    /**
     * 业务线，通常对应一个域或团队，例如企业应用里的财务云、组织云、人力云，互联网领域的供应链、物流等
     */
    String bizCode();

    /**
     * 用例，一个业务流程
     */
    String useCase();

    /**
     * 场景，一个业务场景
     */
    String scenario();

}
