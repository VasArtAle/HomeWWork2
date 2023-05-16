package com.example.thirdlesson4;

import java.io.Serializable;

public class User implements Serializable {

    private String ID;
    private String address;
    private String time;
    private String price;

    public User(String ID, String address, String time, String price) {
        this.ID = ID;
        this.address = address;
        this.time = time;
        this.price = price;
    }

    public String getID() {
        return ID;
    }

    public void setId(String id) {
        this.ID = id;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }
}

