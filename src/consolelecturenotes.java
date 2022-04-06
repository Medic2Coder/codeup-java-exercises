//scanner class is a class that allows you to read input from the console
//it is a class that is part of the java.util package
//it is a class that is part of the java.util.Scanner class
//Goes above the public class
//from classes we can create objects
//so you can create a scanner object, but only use it on a class level one per each class
//scanner is expensive in th memory
 import java.util.Scanner;
public class consolelecturenotes {


    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Hello World");

        Scanner scanner = new Scanner(System.in);
        String name = "coding";
        System.out.printf("Hello there, So Nice to see you %s", name);

        System.out.println("Please enter a city name:");
        String city = scanner.nextLine();
        System.out.println("Please enter a state name:");
        String state = scanner.nextLine();
        System.out.println("How long have you lived here?");
        String zip = scanner.nextLine();

        int years = scanner.nextInt();

        System.out.printf("You live in %s, %s, %s, and you have lived here for %d years", city,
                state, zip, years);


                         //notes:
                       //system.out.printf is a method that allows you to format the output

        //scanner class needs to be imported
        //scanner class is a class that allows you to read input from the console
                     //TODO: Get a way to color the console output, code, response etc
        //all files in java are classes


    }

}
