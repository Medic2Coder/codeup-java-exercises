package com.company;

public class MainMethodEmployee {

    public static void main(String[] args) {
        Employee e = new Employee();
        e.setID(6);
        e.setName("John");
        e.setSalary(60000);
        System.out.println("Name: " + e.getName());
        System.out.println("ID: " + e.getID());
        System.out.println("Salary: " + e.getSalary());
    }
}

