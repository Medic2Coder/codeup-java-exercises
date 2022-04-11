//   //TODO 1. Basic Arithmetic
//
//Create four separate methods. Each will perform an arithmetic operation:
//
//Addition
//Multiplication
//Division
//Each function needs to take two parameters/arguments so that the operation can be performed.
//
//Test your methods and verify the output.
//
//Add a modulus method that finds the modulus of two numbers.
//
//Food for thought: What happens if we try to divide by zero? What should happen?
//
//Bonus
//
////TODO 2. Create your multiplication method without the * operator (Hint: a loop might be
// helpful).
//Do the above with recursion.
//Create a method that validates that user input is in a certain range
//
//The method signature should look like this:
//
//
//public static int getInteger(int min, int max);
//and is used like this:
//
//
//System.out.print("Enter a number between 1 and 10: ");
//int userInput = getInteger(1, 10);
//If the input is invalid, prompt the user again.
//
//Hint: recursion might be helpful here!
//
////TODO 3. Calculate the factorial of a number.
//
//Prompt the user to enter an integer from 1 to 10.
//Display the factorial of the number entered by the user.
//Ask if the user wants to continue.
//Use a for loop to calculate the factorial.
//Assume that the user will enter an integer, but verify it’s between 1 and 10.
//Use the long type to store the factorial.
//Continue only if the user agrees to.
//A factorial is a number multiplied by each of the numbers before it.
//Factorials are denoted by the exclamation point (n!). Ex:
//
//
//1! = 1               = 1
//2! = 1 x 2           = 2
//3! = 1 x 2 x 3       = 6
//4! = 1 x 2 x 3 x 4   = 24
//Bonus
//
//Test the application and find the integer for the highest factorial that can be accurately
//calculated by this application, then modify the prompt so that it prompts the user for a number
//"from 1 to {the highest integer that returns accurate factorial calculation}". Don’t forget to
//change your verification too!
// */
// */
//         */
//         Use recursion to implement the factorial.
//
////TODO. 4 Create an application that simulates dice rolling.
//
//         Ask the user to enter the number of sides for a pair of dice.
//         Prompt the user to roll the dice.
//         "Roll"two n-sided dice,display the results of each,
//         and then ask the user if he/she wants to roll the dice again.
//         Use static methods to implement the method(s)that generate the random numbers.
//        Use the.random method of the java.lang.Math
//
//class to generate random numbers.
//
//        TODO 5.Game Development 101
//
//        Welcome to the world of game development!
//
//        You are going to build a high-low guessing game.Create a
//
//class named HighLow inside of src.
//
//        The specs for the game are:
//
//        Game picks a random number between 1and 100.
//        Prompts user to guess the number.
//        All user inputs are validated.
//        If user's guess is less than the number, it outputs "HIGHER".
//        If user's guess is more than the number, it outputs "LOWER".
//        If a user guesses the number,the game should declare"GOOD GUESS!"
//        Hints
//
//        Use the random method of the java.lang.Math
//
//class to generate a random number.
//        Bonus
//
//        Keep track of how many guesses a user makes.
//        Set an upper limit on the number of guesses.
//        codeycodey Pair programming exercise
//
//        Remember to follow our pair programming best practices and switch computers every once
//        in a while.
//
//        TODO. 1.2Console Adventure Game!
//
//        Using what you've learned so far in the Java I module, we're going to create a classic
//        text-based RPG game.These types of online role-playing games date back to the 70's and
//        solely rely on a text-based interface. In this case, we'll be using Java to run this
//        game in our console.
//
//        The idea is that your game will prompt the user,
//        who will then input answers through the console(using the Scanner class).How the game
//        changes depending on their answer is completely up to you!Below are a list of suggested
//        features to get you started:
//
//        Ask if the user is ready to start.If they type in"yes",start the game.
//        Ask the user for their name.Store this as a variable to personalize the adventure.
//        A classic RPG will have the hero going through different scenarios and battling their
//        enemies.
//        Display enemy stats and hero stats.Properties and values can be assigned by you.
//        For example:Health,Attack Points,etc.
//        Decide on what actions your hero can take.
//        Attack(decreases enemyHealth)
//        Drink potion(adds to heroHealth)
//        Run?(ends the game)
//        Keep asking for user input until the enemyHealth reaches 0,then end the game.
//        Bonuses
//
//        Allow the user to specify hero stats and enemy stats.
//        Automate an enemyAttack after each time the hero takes a turn.
//        End the game if either heroHealth or enemyHealth drops to 0.
//        Indicate how many potions your hero starts with.Decrement this number each time'Use
//        Potion'action is used.
//
//        Remember that these are only suggestions.Feel free to get creative and have fun!!
//        */




/*
   //TODO 1. Basic Arithmetic

Create four separate methods. Each will perform an arithmetic operation:

Addition
Subtraction
Multiplication
Division
Each function needs to take two parameters/arguments so that the operation can be performed.

Test your methods and verify the output.

Add a modulus method that finds the modulus of two numbers.

Food for thought: What happens if we try to divide by zero? What should happen?

 */

//

import java.util.Scanner;

public class MethodsExercises {
    public static void main(String[] args) {
        getInteger(1, 10);
    }


    public static double addition(double n1, double n2) {
        return n1 + n2;
    }

    public static double subtraction(double n1, double n2) {
        return n1 - n2;
    }

    public static double multiplication(double n1, double n2) {
        return n1 * n2;
    }

    public static double division(double n1, double n2) {
        return n1 / n2;
    }

    public static double modulus(double n1, double n2) {
        return n1 % n2;
    }

    //Create a method that validates the user input is in a certain range
    public static int getInteger(int min, int max) {
        Scanner scanner = new Scanner(System.in);
        int input = 0; // to give it initial default value  // and cannot be null (major
        // difference b.t js and java
        //do while loop is recursive
        do {
            //get number
            System.out.printf("Invalid number. Please enter a number between 1 and 10: ");
            input = scanner.nextInt();
        }
        while (min >= input || max <= input);                // input is outside of our range

        return input;

    }
}
////TODO 3. Calculate the factorial of a number.
//
//Prompt the user to enter an integer from 1 to 10.

//Display the factorial of the number entered by the user.
//Ask if the user wants to continue.
//Use a for loop to calculate the factorial.
//Assume that the user will enter an integer, but verify it’s between 1 and 10.
//Use the long type to store the factorial.
//Continue only if the user agrees to.
//A factorial is a number multiplied by each of the numbers before it.
//Factorials are denoted by the exclamation point (n!). Ex:
//
//
//1! = 1               = 1
//2! = 1 x 2           = 2
//3! = 1 x 2 x 3       = 6
//4! = 1 x 2 x 3 x 4   = 24
//Bonus
//
//Test the application and find the integer for the highest factorial that can be accurately
//calculated by this application, then modify the prompt so that it prompts the user for a number
//"from 1 to {the highest integer that returns accurate factorial calculation}". Don’t forget to
//change your verification too!
// */
// */
//         */
//         Use recursion to implement the factorial.
//
//                             TODO: Review Recursion
//        Recursion is a concept that aims to solve a problem by dividing it into smaller chunks.
//        The core idea of recursion is creating a method that calls itself, but with different
//        parameters than were originally passed.
//             TODO: Review e.g., of Counting from 5 to 1 using recursion:
//        public static void count(int n) {
//            if (n <= 0) {
//                System.out.println("All done!");
//                return;
//            }
//            System.out.println(n);
//            count(n - 1);
//        }

//        public static void main(String[] args) {
//            count(5);
//        }

//       public static long factorial () {
//           int num = getInterger(1,10);
//           boolean run = true;
//           while (run) {
//               if (num == 1) {
//                   return 1;
//                   long total = 1;
//                   for (int i = 1; i <= num; i++) {
//                       total = total * i;
////                       //still lost, TODO: needs review
//                   }
//               }
//           }
//        }

//        public static long factorial(int num) {
//            if (num == 1) {
//                return 1;
//                long total = 0;
//                for (int i = 1; i <= num; i++) {
//                    total = total * i;
//                            system.out.println
//
//                }
//            }
//        }


//                    Scanner scanner = new Scanner(System.in);
//                    String input = scanner.nextLine();
//                    String.confirm.equalsIgnoreCase("y");
//                    if (input.equalsIgnoreCase("y")) {

