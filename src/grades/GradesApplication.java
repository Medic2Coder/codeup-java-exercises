package grades;

import java.util.HashMap;
import java.util.Scanner;

public class GradesApplication {


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //HashMap named students with keys of type String and values of type Student Objects with
        // 4 Student Objects with 3 grades each
        HashMap<String, Student> students = new HashMap<>();
        Student student1 = new Student("John", "gitusername1");
        student1.addGrade(100);
        student1.addGrade(90);
        student1.addGrade(80);
        Student student2 = new Student("Jane", "gitusername2");
        student2.addGrade(100);
        student2.addGrade(70);
        student2.addGrade(100);
        Student student3 = new Student("Joe", "gitusername3");
        student3.addGrade(100);
        student3.addGrade(60);
        student3.addGrade(80);
        Student student4 = new Student("Jack", "gitusername4");
        student4.addGrade(100);
        student4.addGrade(90);
        student4.addGrade(100);

        //Create command line interface prints list of students and their grades
        students.put("gitusername1", student1);
        students.put("gitusername2", student2);
        students.put("gitusername3", student3);
        students.put("gitusername4", student4);

//        Print the list of GitHub usernames out to the console, and ask the user which student they would like to see more information about.

        System.out.println("Here are the GitHub usernames of our students:");
        for (String key : students.keySet()) {
            System.out.println(key);
        }
        System.out.println("Which student would you like to see more information about?");

        //Enter 1 for gitusername1 and 2 for gitusername2 and 3 for gitusername3 and 4 for
        // gitusername4
        System.out.println("Enter 1 and press return/enter for gitusername1 and 2 for " +
                "gitusername2 and 3 for gitusername3 and 4 for gitusername4");
        int userInput = scanner.nextInt();
        if (userInput == 1) {
            System.out.println("gitusername1's grades are: " + student1.getGrades());
        } else if (userInput == 2) {
            System.out.println("gitusername2's grades are: " + student2.getGrades());
        } else if (userInput == 3) {
            System.out.println("gitusername3's grades are: " + student3.getGrades());
        } else if (userInput == 4) {
            System.out.println("gitusername4's grades are: " + student4.getGrades());
        }
        //output if invalid git username or student not in hashmap
        else {
            System.out.println("Invalid git username or student not in hashmap");
        }
        // Press 1 to continue original program or 2 to exit
        System.out.println("Press 1 to restart program or 2 to exit");
        int userInput2 = scanner.nextInt();
        if (userInput2 == 1) {
            main(args);
        }  else if (userInput2 == 2) {
            System.out.println("Goodbye!");
        }


        //ask the user which student they want to see grades for
        System.out.println("Enter the git username of the student you would like to see grades " +
                "for");
        String gitUsername = scanner.nextLine();

        //if the student is in the hashmap, print the grades
        if (students.containsKey(gitUsername)) {
            Student student = students.get(gitUsername);
            System.out.println("The grades for " + student.getName() + " are: " + student.getGrades());
        }
    }
}

//        if (students.containsKey(gitUsername)) {
//            System.out.println("The grades for " + gitUsername + " are: " + students.get
//            (gitUsername).getGrades());
//        }



//    public double getGradeAverage() {
//        return (double) grade / 3;


//ask the user if they want to continue and keep running if they do


//        students = new HashMap<String, Student>();
//        grades = new HashMap<String, Grade>();


//    public static void main(String[] args) {
//     HashMap<String, Integer> grades = new HashMap<>();
//     grades.put("A", 90);
//     grades.put("B", 80);
//     grades.put("C", 70);
//     grades.put("D", 60);
//     grades.put("F", 50);
//     grades.put("Excellent!", 100);
//         System.out.println(grades);



