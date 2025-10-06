package Exercices2;

class Student {
    String name;
    int age;

    void Student(){
        Student("Gas",12);
    }
    void Student(String name,int age){
        this.name = name;
        this.age = age;
    }

}
public class Test2{
    public static void main(String []args){
        Student st = new Student();
        System.out.println(st.name+ ": "+st.age);
    }

}
