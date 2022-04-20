package Sandbox.grades;

import java.util.ArrayList;

public class Student {

    private String name;
    private ArrayList<Integer> grades = new ArrayList<>();

    public Student(String name){
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void addGrade(int newGrade){
        this.grades.add(newGrade);
    }

    public double getGradeAverage(){
        int totalPoints = this.grades.stream().reduce(0, (sum, currentGradeElement) -> {
            System.out.println("The sum is currently: " + sum);
            System.out.println("The current grade element is: " + currentGradeElement);
            System.out.println("*************************");
            return sum + currentGradeElement;
        });
        return (double) totalPoints / this.grades.size();
    }








}
