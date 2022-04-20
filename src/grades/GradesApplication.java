package grades;

import java.util.HashMap;

public class GradesApplication {


    public static void main(String[] args) {
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

        //ask the user which student they want to see grades for
        System.out.println("Which student would you like to see grades for?");
        System.out.println("Enter the git username of the student you would like to see grades " +
                "for");
        String gitUsername = System.console().readLine();
        Student student = null;
        if (students.containsKey(gitUsername)) {
            student = students.get(gitUsername);
            System.out.println("The grades for " + student.getName() + " are: ");
            for (int i = 0; i < student.getGrades().size(); i++) {
                System.out.println(student.getGrades().get(i));
            } //end for loop
        }
        else {
            System.out.println("That student does not exist");
        } //end if statement

        //print the average grade for the student
        System.out.println("The average grade for " + student.getName() + " is: " + student.getAverageGrade());

    }
}



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



