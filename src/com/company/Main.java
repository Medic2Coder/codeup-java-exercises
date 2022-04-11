package com.company;

public class Main {
              //this is for employee.java
//    public static void main(String[] args) {
//        employee e = new employee();  //getters and setters need for private keys
//           e.setID(6);
//           e.setName("John");
//           e.setSalary(60000);
//           System.out.println("Name: " + e.getName());
//           System.out.println("ID: " + e.getID());
//           System.out.println("Salary: " + e.getSalary());

//    }
             //this is for cars.java
    public static void main(String[] args) {
         //first create object of cars class //then assign values
        cars c = new cars("Toyota", "150mph", "50000", "2020");
        //then print values
//        System.out.println("Name: " + c.getName());
        //getters
        // and
        // setters need for
        // private
        // keys
        System.out.println("Name: " + c.getName()+"\n"+"Top Speed: " + c.getTopSpeed()+"\n"+"Price: " + c.getPrice()+"\n"+"Year: " + c.getYear());
    }
}




