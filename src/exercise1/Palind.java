package exercise1;

public class Palind {

    public static void main(String []args){
        String str = "ana";
        System.out.println(paliCheck(str));
    }

    static Boolean paliCheck(String str){

        int j = str.length()-1;
        int i =0;

        String newStr2="";
       // Boolean flag = false;

        for(j=str.length()-1;j>=0;j--){
            char c2 = str.charAt(j);
            newStr2= newStr2+c2;
        }
         return  str.equals(newStr2);


    }
}
