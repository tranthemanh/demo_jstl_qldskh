package com.example.demo_jstl_dskh;

public class Customer {
    private String name;
    private String birthDate;
    private String address;
    private String imageUrl;

    // Constructors, getters, and setters
    public Customer(String name, String birthDate, String address, String imageUrl) {
        this.name = name;
        this.birthDate = birthDate;
        this.address = address;
        this.imageUrl = imageUrl;
    }

    // Getters and setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(String birthDate) {
        this.birthDate = birthDate;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }
}
