package OOP;

public class PersonTest {

    public static void main(String[] args) {
        Person person = new Person("John");

        System.out.println(person.getName());

        person.setName("Jane");

        System.out.println(person.getName());

        //custom method below
        person.sayHello();
        

    }
}

