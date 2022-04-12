package com.company;

public class MainMethodCars {

    public static void main(String[] args) {
        Cars c = new Cars("Toyota", "50000", "150mph", "2020");
        System.out.println("Name: " + c.getName()+"\n"+"Top Speed: " + c.getTopSpeed()+"\n"+"Price: " + c.getPrice()+"\n"+"Year: " + c.getYear());
    }
}




