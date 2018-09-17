package com.homefindertx.homefindertx.models;

import org.springframework.data.annotation.Id;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;

@Entity
public class User {

    @Id
    @GeneratedValue
    private long id;

    @Column(nullable = false, length = 100)
    private String first_name;

    @Column(nullable = false, length = 100)
    private String last_name;

    @Column(nullable = false, length = 100)
    private String email;

    @Column(nullable = false, length = 1000)
    private String password;

    @Column(nullable = false, length = 100)
    private String phone_number;

    @Column(nullable = false)
    private Boolean user_type;

    public User(String first_name, String last_name, String email, String password, String phone_number, Boolean user_type) {
        this.first_name = first_name;
        this.last_name = last_name;
        this.email = email;
        this.password = password;
        this.phone_number = phone_number;
        this.user_type = user_type;
    }

    public User(long id, String first_name, String last_name, String email, String password, String phone_number, Boolean user_type) {
        this.id = id;
        this.first_name = first_name;
        this.last_name = last_name;
        this.email = email;
        this.password = password;
        this.phone_number = phone_number;
        this.user_type = user_type;
    }

    public long getId() { return id; }

    public void setId(long id) { this.id = id; }

    public String getFirst_name() { return first_name; }

    public void setFirst_name(String first_name) { this.first_name = first_name; }

    public String getLast_name() { return last_name; }

    public void setLast_name(String last_name) { this.last_name = last_name; }

    public String getEmail() { return email; }

    public void setEmail(String email) { this.email = email; }

    public String getPassword() { return password; }

    public void setPassword(String password) { this.password = password; }

    public String getPhone_number() { return phone_number; }

    public void setPhone_number(String phone_number) { this.phone_number = phone_number; }

    public Boolean getUser_type() { return user_type; }

    public void setUser_type(Boolean user_type) { this.user_type = user_type; }

}
