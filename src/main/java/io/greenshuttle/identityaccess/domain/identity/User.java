package io.greenshuttle.identityaccess.domain.identity;

import org.hibernate.annotations.Filter;

import javax.persistence.*;
import java.io.Serializable;

/**
 * @author yangzifeng
 */
@Table(name = "iam_user")
@Entity
@Filter(
        name = "OwnerFilter"
)
public class User implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    private String id;

    @Column(name = "username")
    private String username;

    @Column(name = "create_user")
    private String createUser;

    @Embedded
    private TenantId tenantId;

    private TenantId tenantId() {
        return this.tenantId;
    }

    public User(String id, String username, String createUser, TenantId tenantId) {
        this.id = id;
        this.username = username;
        this.createUser = createUser;
        this.tenantId = tenantId;
    }

    public User() {
    }

    @Override
    public String toString() {
        return "User{" +
                "id='" + id + '\'' +
                ", username='" + username + '\'' +
                ", createUser='" + createUser + '\'' +
                ", tenantId=" + tenantId +
                '}';
    }


    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getCreateUser() {
        return createUser;
    }

    public void setCreateUser(String createUser) {
        this.createUser = createUser;
    }

    public TenantId getTenantId() {
        return tenantId;
    }

    public void setTenantId(TenantId tenantId) {
        this.tenantId = tenantId;
    }
}
