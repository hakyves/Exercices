package exercise1;

public class CastingEx {
    public static void main(String []args){
//        double d = 234.04;
//        long l =(long)d;
//        int i =(int)l;
        int i =234;
        long l =(int)i;
        double d =(long)l;
        System.out.println("double value :"+d);
        System.out.println("Long value :"+l);
        System.out.println("Integr value :"+i);
    }
}
