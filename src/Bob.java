
//notes

import java.util.Scanner;


public class Bob {


    public static void main(String[] args) {

//        Scanner scanner = new Scanner(System.in);
        Scanner sc = new Scanner(System.in);

//        String userInput = scanner.nextLine();
        String userInput = sc.nextLine();
        converse(userInput);


        if (userInput.isEmpty()) {
            System.out.println("Fine. Be that way!");

        }
        if (userInput.endsWith("?")) {
            System.out.println("Sure.");
        } else if (userInput.endsWith("!")) {
            System.out.println("Whoa, chill out!");
        } else if (userInput.isEmpty()) {
            System.out.println("Fine. Be that way!");
        } else {
            System.out.println("Whatever.");
        }
    }


    //refactor example
//    converse(input);

    //TODO: find static and what it means
    public static void converse(String userInput) {
        if (userInput.endsWith("?")) {
            System.out.println("Sure.");
        } else if (userInput.endsWith("!")) {
            System.out.println("Whoa, chill out!");
        } else if (userInput.isEmpty()) {
            System.out.println("Fine. Be that way!");
        } else {
            System.out.println("Whatever.");
        }
    }

}

// remember: going outside a class throws an error
//not like java script where it will let you make errors
//because java won't let you compile


//errors
//compile error won't be allowed on java
// yet java and javascript do have runtime errors

//no undefined in JAVA, it will be considered as an compile error

//lots of classes but public is the default and private is next most common
