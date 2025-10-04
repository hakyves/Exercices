package CodingInterview;

import java.util.HashMap;
import java.util.Objects;

public class Person implements Comparable<Person>{
    private String name;
    private String lastname;
    private int base;

    public Person(String name, String lastname) {
        this.name = name;
        this.lastname = lastname;
    }
    public int interestCalc(String name,String lastname,int base){
       // int base = 5;
        int gross =10;
        int interest = base * gross;
        return interest;
    }
    public static void main(String []args){
        HashMap<Person, String> personMap = new HashMap<>();
        Person person1 = new Person("Sminth","John");
        Person person2 = new Person("Sminth","John");
        personMap.put(person1, "person1");
        System.out.println(personMap.get(person2));

    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return Objects.equals(name, person.name) && Objects.equals(lastname, person.lastname);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, lastname);
    }

    @Override
    public int compareTo(Person o) {
        return this.base;
    }
}
