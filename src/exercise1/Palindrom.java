package exercise1;

public class Palindrom {
    public Boolean myFunct(String str){

     char ch;
     char ch2;
     String nstr ="";
     String nstr2 ="";


        int i=0 ; int j = str.length()-1;
        while(i<j){
            for(i=0;i<str.length();i++){
                ch = str.charAt(i);
               nstr = nstr + ch;
            }
            for(j=str.length()-1;j>=0;j--){
                ch2 = str.charAt(j);
                nstr2 = nstr2 + ch2;
            }

        }
        if(nstr.equals(nstr2)){
            return true;
        } else {

            return false;
        }

    }
    public static void main(String[] args){
        Palindrom pal = new Palindrom();
        String str = "ana";
        System.out.println(" "+pal.myFunct(str));
    }
}
