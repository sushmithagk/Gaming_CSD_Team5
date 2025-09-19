package com.team5.models;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "admin_users")
public class AdminUsers {

    @Id
    private String admin_users_id;
    private String username;
    private String password;

    public AdminUsers() {
    }

    public AdminUsers(String admin_users_id, String username, String password) {
        this.admin_users_id = admin_users_id;
        this.username = username;
        this.password = password;
    }

    public String getAdmin_users_id() {
        return admin_users_id;
    }

    public void setAdmin_users_id(String admin_users_id) {
        this.admin_users_id = admin_users_id;
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

    @Override
    public String toString() {
        return "AdminUsers{" +
                "admin_users_id='" + admin_users_id + '\'' +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}
