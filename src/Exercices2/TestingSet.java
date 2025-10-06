package Exercices2;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

public class TestingSet {
    public static void main(String []args){

        int []arr = {2,9,5,7};
        Arrays.sort(arr);
        Set<String> set = new HashSet<>();
        set.add("abc");
        set.add("abc");
        set.add("yzd");
        System.out.println(set);
        System.out.println("=================================");
        Set<Man> set2 = new HashSet<>();
        Man man1 = new Man("AB",1);
        Man man2 = new Man("AB",1);
        Man man3 = new Man("XYZ",3);
        set2.add(man1);
        set2.add(man2);
        set2.add(man3);

        System.out.println(set2);
        System.out.println("=================================");
        System.out.println(Arrays.toString(arr));
        Employee [] arrEmp = new Employee[4];
        arrEmp[0] = new Employee(3,"Jack");
        arrEmp[1] = new Employee(1,"Jackson");
        arrEmp[2] = new Employee(5,"Janet");
        arrEmp[3] = new Employee(2,"Ericson");
        Arrays.sort(arrEmp);
        System.out.println("=================================");
        System.out.println(Arrays.toString(arrEmp));




    }

}

class Man {
    private String name;
    private Integer number;

    public Man(String name, Integer number) {
        this.name = name;
        this.number = number;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getNumber() {
        return number;
    }

    public void setNumber(Integer number) {
        this.number = number;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Man man = (Man) o;
        return Objects.equals(name, man.name) && Objects.equals(number, man.number);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, number);
    }

    @Override
    public String toString() {
        return "Man{" +
                "name='" + name + '\'' +
                ", number=" + number +
                '}';
    }
}
class Employee implements Comparable<Employee>{
    private int number;
    private String name;

    public Employee(int number, String name) {
        this.number = number;
        this.name = name;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "number=" + number +
                ", name='" + name + '\'' +
                '}';
    }

    @Override
    public int compareTo(Employee o) {
        return this.number - o.number;
    }
}
