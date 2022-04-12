package OOP;

public class Person {
    private String name;

    public String getName() {
        //return the person's name
        return this.name;
    }

    public void setName (String name) {         //setter is always void, sets property and stops
        // executing
        this.name = name;
    }

    public void sayHello() {
        //print "Hello, my name is " + name
        System.out.println("Hello, my name is " + this.name);
    }
}
