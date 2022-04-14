package JavaTutorialAmazingness;

public class LearningTheThing {

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
        

        addExclamationPoint("hot dogs"); //this is a method call, it's a function call


        //yay you can do so many things with objects!

        String name = "Markle"; //semi colons help Java parse it to make sense of it al
        // if it's a different color, like string in this case, it's an object!
        //to do crazy things with the object, just type the objects name and then the dot operator
        System.out.println(name.toUpperCase()); //toUpperCase() is a method that's part of the string class
        System.out.println(name.toLowerCase());

    }

        private static void addExclamationPoint(String s) {
            System.out.println(s + "!");//to put two strings together,
            // you need to use the +
            // operator
    }




}



