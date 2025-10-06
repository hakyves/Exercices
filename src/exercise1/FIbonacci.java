package exercise1;

public class FIbonacci {
    public static void main(String []args){
        int num = 10;
        System.out.println( fib(num));
    }
    static int fib(int num){
//        int num1 =0,num2=1;
//        int count =0;
//
//        while(count<num){
//            //Print out
//            System.out.print(num1+" ");
//            //Swap
//            int num3 = num1+num2;
//            num1=num2;
//            num2=num3;
//            count = count +1;
//        }
        int num1 =1,num2=1;
        int count =0;
        if(num==0||num==1){
            return 1;
        }
        for(int i=0;i<num;i++){
            int num3 = num1 + num2;
                num1 = num2;
                num2 = num3;
        }
       return num1;

    }
}
