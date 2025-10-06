package Exercices2;

import java.util.ArrayList;
import java.util.List;


class SpecialString1 {
    String str;
    SpecialString1(String str) {
        this.str = str;
    }
}

public class Test {
    public static void main(String[] args) {
        Object [] arr = new Object[4];
        for(int i = 1; i <=3; i++) {
            switch(i) {
                case 1:
                    arr[i] = new String("Java1");
                    break;
                case 2:
                    arr[i] = new StringBuilder("Java2");
                    break;
                case 3:
                    arr[i] = new SpecialString1("Java3");
                    break;
            }
        }
        for(Object obj : arr) {
            System.out.println(": "+obj);
        }
    }
}