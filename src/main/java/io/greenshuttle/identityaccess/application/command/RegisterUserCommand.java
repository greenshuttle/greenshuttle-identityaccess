package io.greenshuttle.identityaccess.application.command;

/**
 * @author yangzifeng
 */
public class RegisterUserCommand {
    private String tenantId;
    private String username;
    private String password;
    private boolean enabled = true;
    private String email;
    private String telephone;
    private String addressCity;
    private String language;
    private String zoneId;

    public RegisterUserCommand(String tenantId, String username,
                               String password, boolean enabled, String email,
                               String telephone, String addressCity,
                               String language, String zoneId) {
        this.tenantId = tenantId;
        this.username = username;
        this.password = password;
        this.enabled = enabled;
        this.email = email;
        this.telephone = telephone;
        this.addressCity = addressCity;
        this.language = language;
        this.zoneId = zoneId;
    }

    public String getTenantId() {
        return tenantId;
    }

    public void setTenantId(String tenantId) {
        this.tenantId = tenantId;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public boolean isEnabled() {
        return enabled;
    }

    public void setEnabled(boolean enabled) {
        this.enabled = enabled;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    public String getAddressCity() {
        return addressCity;
    }

    public void setAddressCity(String addressCity) {
        this.addressCity = addressCity;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public String getZoneId() {
        return zoneId;
    }

    public void setZoneId(String zoneId) {
        this.zoneId = zoneId;
    }
}
