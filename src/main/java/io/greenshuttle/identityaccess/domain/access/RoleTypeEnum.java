package io.greenshuttle.identityaccess.domain.access;

/**
 * @author yangzifeng
 */
public enum RoleTypeEnum {

    /**
     * 系统不变的角色，例如管理员、
     */
    SYSTEM("system", "系统角色");

    private String code;

    private String name;

    RoleTypeEnum(String code, String name) {
        this.code = code;
        this.name = name;
    }

    public String getCode() {
        return code;
    }

    public String getName() {
        return name;
    }
}
