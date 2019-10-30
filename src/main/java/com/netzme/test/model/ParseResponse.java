package com.netzme.test.model;

public class ParseResponse {
    private String gender;
    private String fullname;
    private String address;
    private String picture;

    public ParseResponse(String gender, String fullname, String address, String picture) {
        this.gender = gender;
        this.fullname = fullname;
        this.address = address;
        this.picture = picture;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getFullname() {
        return fullname;
    }

    public void setFullname(String fullname) {
        this.fullname = fullname;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPicture() {
        return picture;
    }

    public void setPicture(String picture) {
        this.picture = picture;
    }
}
