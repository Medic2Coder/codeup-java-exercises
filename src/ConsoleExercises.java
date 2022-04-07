import java.util.Scanner;
public class ConsoleExercises {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double pi = 3.14159;
        System.out.println("The value of pi is approximately 3.14."); //check console
        System.out.printf("The value of pi is approximately %.2f.\n", pi);   //CORRECT check
        // difference
        System.out.printf("The value of pi is approximately %.4f.\n", pi);   // exploring, check
        // the difference

//        helped with walkthrough:
          System.out.println("Hey user please enter an interger:");

          int userInt = scanner.nextInt();

          System.out.println("Hey user enter three words one at a time:");

          String firstWord = scanner.next();
          String secondWord = scanner.next();
          String thirdWord = scanner.next();


          // try to remember when learning new languages
        //remember what you can do in that language
        //name of the game with data types, know em, love em
        

    }
}

