package grades;

import java.util.HashMap;

public class GradesApplication {

    public static void main(String[] args) {
     HashMap<String, Integer> grades = new HashMap<>();
     grades.put("A", 90);
     grades.put("B", 80);
     grades.put("C", 70);
     grades.put("D", 60);
     grades.put("F", 50);
     grades.put("Excellent!", 100);

     HashMap<Object, Object> students = new HashMap<>();
     students.put("John", 100, 90, 80);
     students.put(100, 70, 90, "Mary");
     students.put(90, 90, 60, "Bob");
     students.put(90, 90, 60, "Jane");
     students.put(90, 90, 60, "Sally");

     System.out.println(students);
     System.out.println(grades);
    }
}


