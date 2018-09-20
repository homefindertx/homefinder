package com.homefindertx.homefindertx.models;

import org.hibernate.annotations.Fetch;
import org.hibernate.annotations.FetchMode;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

@Entity
@Table(name="User")
public class User implements Serializable {

    @Id
    @GeneratedValue
    private long id;

    @Column(nullable = false, length = 16)
    private String username;

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

    @Fetch(value = FetchMode.SELECT)
    @OneToMany(cascade = CascadeType.ALL)
    private List<Listing> listings;

    @Column(nullable = false)
    private Boolean isBuyer = false;

    public User(User copy) {
        id = copy.id; // This line is SUPER important! Many things won't work if it's absent
        username = copy.username;
        first_name = copy.first_name;
        last_name = copy.last_name;
        email = copy.email;
        password = copy.password;
        phone_number = copy.phone_number;
        listings =copy.listings;
        isBuyer = copy.isBuyer;
    }

    public User(String username, String first_name, String last_name, String email, String password, String phone_number, List<Listing> listings, Boolean isBuyer) {
        this.username = username;
        this.first_name = first_name;
        this.last_name = last_name;
        this.email = email;
        this.password = password;
        this.phone_number = phone_number;
        this.listings = listings;
        this.isBuyer = isBuyer;
    }

    public User(long id, String username, String first_name, String last_name, String email, String password, String phone_number, List<Listing> listings, Boolean isBuyer) {
        this.id = id;
        this.username = username;
        this.first_name = first_name;
        this.last_name = last_name;
        this.email = email;
        this.password = password;
        this.phone_number = phone_number;
        this.listings = listings;
        this.isBuyer = isBuyer;
    }
    public User(long id, String username, String first_name, String last_name, String email, String password, String phone_number, Boolean isBuyer) {
        this.id = id;
        this.username = username;
        this.first_name = first_name;
        this.last_name = last_name;
        this.email = email;
        this.password = password;
        this.phone_number = phone_number;
        this.isBuyer = isBuyer;
    }

    public User() {

    }

    public long getId() { return id; }

    public void setId(long id) { this.id = id; }

    public String getUsername(){ return username; }

    public void setUsername(String username) { this.username = username; }

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

    public List<Listing> getListing() { return listings; }

    public void setListing(List<Listing> listings) { this.listings = listings; }

    public Boolean getIsBuyer() { return isBuyer; }

    public void setIsBuyer(Boolean isBuyer) { this.isBuyer = isBuyer; }

}
