package io.greenshuttle.identityaccess.infrastructure.datascope;

/**
 * @author yangzifeng
 */
public enum Policy {

    /**
     * 租户全部数据
     */
    ALL(1, "OrganizationFilter", "全部"),

    /**
     * 本人创建可见
     */
    OWN(2, "OwnerFilter", "本人创建可见"),

    /**
     * 所在机构可见
     */
    OWN_DEPT(3, "OrganizationFilter", "所在机构可见"),

    /**
     * 所在机构及子级可见
     */
    OWN_DEPT_CHILD(4, "OrganizationFilter", "所在机构及子级可见"),

    /**
     * 自定义
     */
    CUSTOM(5, "OrganizationFilter", "自定义部门");

    /**
     * 类型
     */
    private final int type;
    /**
     * 对应的filter
     */
    private final String filter;
    /**
     * 描述
     */
    private final String description;

    Policy(int type, String filter, String description) {
        this.type = type;
        this.filter = filter;
        this.description = description;
    }

    public static Policy of(Integer policyType) {
        if (policyType == null) {
            return null;
        }
        Policy[] values = Policy.values();
        for (Policy dataScopePolicy : values) {
            if (dataScopePolicy.type == policyType) {
                return dataScopePolicy;
            }
        }
        return null;
    }

    public String getDescription() {
        return description;
    }

    public int getType() {
        return type;
    }

    public String getFilter() {
        return filter;
    }
}
