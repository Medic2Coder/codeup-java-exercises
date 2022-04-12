package OOP;

public class Person {
    private String name;

    public String getName() {
        //return the person's name
        return this.name;
    }
    public Person(String name) {
        //constructor sets the name property
        this.name = name; //this defines the constructor, and now we HAVE to pass a name
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
