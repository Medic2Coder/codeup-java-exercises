package JavaTutorialAmazingness;

import java.util.ArrayList;

public class LearningTheThing {      //TODO: review that class is just a java file  that helps us
    // ...make objects

    public static void main(String[] args) {
        int a = 5;
        char b = 'a';
        long c = 1234567890123456789L;
        double d = 3.14;
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);
        //to start a method... keywords has it's own purpose
        Animal e = new Animal();    //objects will always have this format
        String dog = e.iAmDog();
        System.out.println(dog);

        //importing other common objects like arrays:
        ArrayList<Integer> myList = new ArrayList<Integer>();
        myList.add(1); //remember each object has its own methods
        myList.add(2);
        myList.add(3);
        System.out.println(myList);
        //TODO: review object oriented programming, each class represents its own object which
        // has its own methods

        //yay you can do so many things with objects!
        addExclamationPoint("hot dogs"); //this is a method call, it's a function call

        String name = "Markle"; //semi colons help Java parse it to make sense of it al
        // if it's a different color, like string in this case, it's an object!
        //to do crazy things with the object, just type the objects name and then the dot operator
        System.out.println(name.toUpperCase()); //toUpperCase() is a method that's part of the
        // string class
        System.out.println(name.toLowerCase());


        doStuff();

        doMoreStuff();

        doEvenMoreStuff();

        doEvenMoreStuffSeriously();

    }

    private static void addExclamationPoint(String s) {
        System.out.println(s + "!");//to put two strings together,
        // you need to use the +
        // operator
    }

    public static void doStuff() {
        int a = 5;

        if (a == 0) {
            System.out.println("a is 0");

        } else if (a == 1) {
            System.out.println("a is 1");
        } else {
            System.out.println("a is not 0 or 1");
        }
    }
    public static void doMoreStuff() {
        int b = 5;
        for (int i = 0; i < 5; i++) {   // will run the code 5 times, same if i <b
            for (int j = 0; i < 5; i++) {       //can put for loop inside a loop
                   System.out.println("i is " + i + " and j is " + j);
            }
        }
    }
    public static void doEvenMoreStuff() {
        double c = 0.25;
        while (c <= 0.25 ) {
            System.out.println("Time to fuel up the car because your tank is " + c);  //this is
            // an infinite loop unless you end it
            c++;                                //ended it
        }
    }

    public static void doEvenMoreStuffSeriously() {
        int c = 5;

        try {
            
        }  catch (Exception e) {
            System.out.println("Something went wrong");
        }
    }


}




