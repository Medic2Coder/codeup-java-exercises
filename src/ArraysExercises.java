import OOP.Person;

import java.util.Arrays;

public class ArraysExercises {

    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5};
        System.out.println(numbers); // [I@7b8f8f0  = Today I learned... address in java key, fun
        // fact

        System.out.println(Arrays.toString(numbers)); // [1, 2, 3, 4, 5]

        Person people[] = new Person[3];
        people[0] = new Person("John");  //name:
        people[1] = new Person("Jane");
        people[2] = new Person("Jack");
        System.out.println(Arrays.toString(people));


        for (Person person : people) {
            System.out.println(person.getName());
        }
        people = addPerson(people, new Person("Alex"));
        for (Person person : people) {

        System.out.println(person.getName());
        }
    }

    public static Person[] addPerson(Person[] personArr, Person personToAdd) { // personToAdd
        // is a
        // Person object
        Person[] newPersonArr = Arrays.copyOf(personArr, personArr.length + 1);
        newPersonArr[newPersonArr.length - 1] = personToAdd;
        return newPersonArr;

    }

}

