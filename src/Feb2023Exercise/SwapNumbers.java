package Feb2023Exercise;

public class SwapNumbers {

    public static void main(String []args){
        int a = 10;
        int b = 20;
        System.out.println("Before A = "+a+ " Before B = "+b);
        a = a+b;
        System.out.println("a = a+b Step1 A "+a+" Step1 B "+b);
        System.out.println("=============================");
        b= a-b;
        System.out.println("b= a-b Step2 A "+a+" Step2 B "+b);
        System.out.println("=============================");
        a=a-b;
        System.out.println("a=a-b Step3 A "+a+" Step3 B "+b);
        System.out.println("=============================");
        System.out.println("After A = "+a+ " After B = "+b);

    }
}
