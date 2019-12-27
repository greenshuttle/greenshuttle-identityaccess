package io.greenshuttle.identityaccess.application.command;

import javax.validation.constraints.NotNull;

/**
 * @author yangzifeng
 */
public class AddTenantCommand {

    @NotNull(message = "租户名不可以为空")
    private String tenantName;
    private String description;

    public AddTenantCommand(String tenantName, String description) {
        this.tenantName = tenantName;
        this.description = description;
    }

    public AddTenantCommand() {
    }

    public String getTenantName() {
        return tenantName;
    }

    public void setTenantName(String tenantName) {
        this.tenantName = tenantName;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
