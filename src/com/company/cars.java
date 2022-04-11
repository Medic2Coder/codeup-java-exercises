package com.company;


public class cars {
    private String name;
    private String price;
    private String topSpeed;
    private String year;
    public cars(String name, String price, String topSpeed, String year) {
        this.name = name;
        this.price = price;
        this.topSpeed = topSpeed;
        this.year = year; //constructors  are used to initialize the values of the variables
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public String getTopSpeed() {
        return topSpeed;
    }

    public void setTopSpeed(String topSpeed) {
        this.topSpeed = topSpeed;
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }


}

