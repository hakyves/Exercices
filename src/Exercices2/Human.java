package Exercices2;

public class Human {
    private String name;
    private int age;

    public Human(String name) {
        this.name = name;
    }

    public void mydisplay(){

        System.out.println("");

    }
    public static void main(String []args){
        Human hum = new Human("Yves");
        System.out.println(hum.name);
        //hum.mydisplay();

    }
}
