package com.homefindertx.homefindertx.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class listing {

    @Id
    @GeneratedValue
    private long id;

    @Column(nullable = false)
    private String address;

    @Column(nullable = false, length = 100)
    private String description;

    @Column(nullable = false, length = 100)
    private double bedrooms;

    @Column(nullable = false, length = 100)
    private double bathrooms;

    @Column(nullable = false, length = 100)
    private double square_footage;

    @Column(nullable = false, length = 100)
    private double price;

    @Column(nullable = false, length = 100)
    private int year_built;

    @Column(nullable = false, length = 100)
    private double lot_size;

    @Column(nullable = false, length = 100)
    private String city;

    @Column(nullable = false, length = 100)
    private String zipcode;

    @Column(nullable = false, length = 100)
    private String status;

    @Column(nullable = false, length = 100)
    private String state;

    public listing(){
    }

    public listing(String address, String description, double bedrooms, double bathrooms, double square_footage, double price, int year_built, double lot_size, String city, String zipcode, String status, String state) {
        this.address = address;
        this.description = description;
        this.bedrooms = bedrooms;
        this.bathrooms = bathrooms;
        this.square_footage = square_footage;
        this.price = price;
        this.year_built = year_built;
        this.lot_size = lot_size;
        this.city = city;
        this.zipcode = zipcode;
        this.status = status;
        this.state = state;
    }

    public listing(long id, String address, String description, double bedrooms, double bathrooms, double square_footage, double price, int year_built, double lot_size, String city, String zipcode, String status, String state) {
        this.id = id;
        this.address = address;
        this.description = description;
        this.bedrooms = bedrooms;
        this.bathrooms = bathrooms;
        this.square_footage = square_footage;
        this.price = price;
        this.year_built = year_built;
        this.lot_size = lot_size;
        this.city = city;
        this.zipcode = zipcode;
        this.status = status;
        this.state = state;
    }

    public long getId() { return id; }

    public void setId(long id) { this.id = id; }

    public String getAddress() { return address; }

    public void setAddress(String address) { this.address = address; }

    public String getDescription() { return description; }

    public void setDescription(String description) { this.description = description; }

    public double getBedrooms() { return bedrooms; }

    public void setBedrooms(double bedrooms) { this.bedrooms = bedrooms; }

    public double getBathrooms() { return bathrooms; }

    public void setBathrooms(double bathrooms) { this.bathrooms = bathrooms; }

    public double getSquare_footage() { return square_footage; }

    public void setSquare_footage(double square_footage) { this.square_footage = square_footage; }

    public double getPrice() { return price; }

    public void setPrice(double price) { this.price = price; }

    public int getYear_built() { return year_built; }

    public void setYear_built(int year_built) { this.year_built = year_built; }

    public double getLot_size() { return lot_size; }

    public void setLot_size(double lot_size) { this.lot_size = lot_size; }

    public String getCity() { return city; }

    public void setCity(String city) { this.city = city; }

    public String getZipcode() { return zipcode; }

    public void setZipcode(String zipcode) { this.zipcode = zipcode; }

    public String getStatus() { return status; }

    public void setStatus(String status) { this.status = status; }

    public String getState() { return state; }

    public void setState(String state) { this.state = state; }
}
