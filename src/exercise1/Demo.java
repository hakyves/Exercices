package exercise1;

import java.util.List;

public class Demo {
    String bankName;
    String area;
    String phoneNo;

    public Demo(String bankName,String area,String phoneNo) {
        this.bankName = bankName;
        this.area = area;
    }

    public static void main(String[] args){
//        Demo demo2 = new Demo("abc","xyz","pqr");
//        System.out.println(demo2.bankName);
//        System.out.println(demo2.area);
        List<School> sc = null;
        School s1= new School(1,"Mweya");
        School s2= new School(2,"LDK");
        sc.add(s1);
        sc.add(s2);
        
    }
}
