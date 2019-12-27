package io.greenshuttle.identityaccess.application.command;

/**
 * @author yangzifeng
 */
public class ActiveTenantCommand {

    private String tenantId;

    public ActiveTenantCommand(String tenantId) {
        this.tenantId = tenantId;
    }

    public ActiveTenantCommand() {
    }

    public String getTenantId() {
        return tenantId;
    }

    public void setTenantId(String tenantId) {
        this.tenantId = tenantId;
    }
}
