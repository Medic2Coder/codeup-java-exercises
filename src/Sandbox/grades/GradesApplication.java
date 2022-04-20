package Sandbox.grades;

import Sandbox.grades.util.Input;

import java.util.HashMap;
import java.util.Locale;

public class GradesApplication {

    public static void main(String[] args) {

        HashMap<String, Student> students = getStudents();

        do{
            initGradesApp(students);
        } while(Input.yesNo("Would you like to search for another student? (y/n)"));
        //TODO: fix the scan next scan next line bug

    }

    private static void initGradesApp(HashMap<String, Student> students){
        System.out.println(students.keySet().stream().reduce("", (allNames, currentName) -> {
            return allNames + "\n -> " + currentName;
        }));

        String username = Input.getString("\nPlease enter the GitHub username of a student if you want more info: \n");

        if (students.containsKey(username)){
            Student chosenOne = students.get(username);
            System.out.println("Student Name: " + chosenOne.getName().toUpperCase(Locale.ROOT));
            System.out.println(chosenOne.getGradeAverage());

        }else{
            System.out.println("No username found matching: " + username);
        }
    }


    private static HashMap<String, Student> getStudents() {
        Student student1 = new Student("billi");

        student1.addGrade(90);
        student1.addGrade(65);
        student1.addGrade(100);

        Student student2 = new Student("susie");

        student2.addGrade(100);
        student2.addGrade(100);
        student2.addGrade(100);

        Student student3 = new Student("ralph");

        student3.addGrade(0);
        student3.addGrade(0);
        student3.addGrade(25);

        HashMap<String, Student> students = new HashMap<>();

        String student1gh = "billiversustheworld";

        students.put(student1gh, student1);
        students.put("ohsusanna", student2);
        students.put("rektralph", student3);

        return students;
    }
}
