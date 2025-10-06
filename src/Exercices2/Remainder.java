package Exercices2;

public class Remainder {
    public static void main(String []args){

        for(int i=89;i<200;i++){
            int k = i%2;
            if(k==0) {
                System.out.print("A");
            } else{
                System.out.print("M");
            }
        }
    }
}
