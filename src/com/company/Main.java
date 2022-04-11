package com.company;

public class Main {

    public static void main(String[] args) {
        employee e = new employee();  //getters and setters need for priavate keys
           e.setID(6);
           e.setName("John");
           e.setSalary(60000);
           System.out.println("Name: " + e.getName());
           System.out.println("ID: " + e.getID());
           System.out.println("Salary: " + e.getSalary());

    }
}
