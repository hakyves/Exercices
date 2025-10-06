package exercise1;

public class Person {
    String name;
    Person(){
        System.out.println("In Person Class");
    }
}
class Student extends Person{
    Student(){
        System.out.println("In student class");
    }
    int id;
    public static void main(String []args){
        School ob = new School();
//        ob.name ="abc";
//        ob.id=123;
    }
}
