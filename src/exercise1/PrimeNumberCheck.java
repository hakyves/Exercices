package exercise1;

public class PrimeNumberCheck {
    public static void main(String [] args){
        int num = 16;
        System.out.println(checkPrime(num));

    }
    static boolean checkPrime(int num){
        boolean flag = false;
        int i;
        for(i=2;i<num;i++){
            if(num %i == 0){
                flag = false;
                break;
            }else{
                flag = true;
            }
        }
        return flag;
    }
}
