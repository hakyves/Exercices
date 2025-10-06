package exercise1;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Test5 {
    public static void main(String []args){
//        Animal animal1 = new Dog();
//        Animal animal2 = new Cat();
//        Animal animal3 = new Animal();
//        Dog dog = (Dog) animal3;
//        animal1.eat();
//        animal2.eat();
//        animal3.eat();
//        LocalDate date = LocalDate.of(2020, 9, 31);
//        System.out.println(date);
        /*INSERT*/
        //short arr [] = new short[2];
       //  byte [] arr = new byte[10]; this works
       // short [] arr; arr = new short[3]; this works
       // short [3] arr;
       // int [] arr = new int[]{100, 100};
       // int [] arr = new int[]{0,0,0,0}; //this works
        //short [] arr = {};
//        short [] arr = new short[2]{5, 10};
//
//        arr[1] = 5;
//        arr[2] = 10;
//        System.out.println("["+arr[0]+", " + arr[1] + ", " + arr[2] + "]"); //Line n1
//        int x = 1;
//        while(checkAndIncrement(x)) {
//            System.out.println(x);
//        }
//    }
//
//    private static boolean checkAndIncrement(int x) {
//        if(x < 5) {
//            x++;
//            return true;
//        } else {
//            return false;
//        }
//        String str1 = "Core";
//        String str2 = "COrE";
//        System.out.println(str1=str2);
        String[] names = { "Smith", "Brown", "Thomas", "Taylor", "Jones" };
        List<String> list = new ArrayList<>();
        for (int x = 0; x < names.length; x++) {
            list.add(names[x]);
            switch (x) {
                case 2:
                    continue;
            }
            break;
        }
        System.out.println(list);

    }
}
