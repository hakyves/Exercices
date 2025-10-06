package exercise1;

public class AmstrongNumber {
    public static void main(String [] args){
        int n= 407;
        System.out.println(amst(n));
    }
    static boolean amst(Integer n){
        double sum = 0;
        boolean flag = false;
        String str = n.toString();
        for(int i=0;i<str.length();i++){
            double number =  Integer.parseInt(String.valueOf(str.charAt(i)));
            double numCube = Math.pow(number ,3.0);
             sum = sum + numCube;
        }
        int newSum = (int)sum;
        if(newSum==n){
            flag = true;
        }else{
            flag= false;
        }
        return flag;
    }

}
