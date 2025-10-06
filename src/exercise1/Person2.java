package exercise1;

public class Person2 {
    String name;
    Person2(){
        name="John";
    }
}
class Employee extends Person2{
    int age;
    Employee(){
        age = 34;
    }
}
class Customer2 extends Person2{
    int salary;
    Customer2(int salary){
        this.salary=salary;
        name = "Meddy";
    }
    public void displayDetails(){
        //System.out.println(name+age+salary);
    }

}
