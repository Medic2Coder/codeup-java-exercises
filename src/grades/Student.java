package grades;

public class Student {
    private String name;
    private int grade;

    private double gradeAverage;



    //    a main method and creating Student objects
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.setName("John");
        s1.setGrade(90);
        s1.addGrade(80);
        s1.addGrade(70);
        System.out.println(s1.getName() + " " + s1.getGradeAverage());

        Student s2 = new Student();
        s2.setName("Jane");
        s2.setGrade(80);
        s2.addGrade(70);
        s2.addGrade(60);
        System.out.println(s2.getName() + " " + s2.getGradeAverage());

        Student s3 = new Student();
        s3.setName("Joe");
        s3.setGrade(70);
        s3.addGrade(60);
        s3.addGrade(50);
        System.out.println(s3.getName() + " " + s3.getGradeAverage());
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
        return (double) grade / 3;
    }

    public void setGradeAverage(double gradeAverage) {
        this.gradeAverage = gradeAverage;
    }

}




