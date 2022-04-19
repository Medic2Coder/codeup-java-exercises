package OOP;

public class Person {
    private String name;
    private int age;
    private String dateOfBirth;
    private String address;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Person(String name) {
        this.name = name;

//        this.age = age;
//        this.dateOfBirth = dateOfBirth;
//        this.address = address;
    }

}



//    public String getName() {
//        //return the person's name
//        return this.name;
//    }
//    public Person() {
//        //constructor sets the name property
//        this.name = name; //this defines the constructor, and now we HAVE to pass a name
//    }
//
//    public void setName (String name) {         //setter is always void, sets property and stops
//        // executing
//        this.name = name;
//    }
//
//    public void sayHello() {
//        //print "Hello, my name is " + name
//        System.out.println("Hello, my name is " + this.name);
//
//
//    }
//}
