package grades;

public class Student {
    private String name;
    private int grade;


    //    a main method and creating Student objects
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.setName("John");
        s1.setGrade(90);
        System.out.println(s1.getName() + " " + s1.getGrade());

        Student s2 = new Student();
        s2.setName("Jane");
        s2.setGrade(80);
        System.out.println(s2.getName() + " " + s2.getGrade());
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getGrade() {
        return grade;
    }

    public void setGrade(int grade) {
        this.grade = grade;
    }

    public void addGrade (int grade) {
        this.grade += grade;
    }

    public double getGradeAverage() {
        return (double) grade / 2;
    }



}

