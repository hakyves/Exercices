package JavaExericses.String;

public class StringConcat {
    public static void main(String []args){
        String str1 = "Learning Java ";
        String str2 =" and Python";
        String strFinal = str1.concat(str2);
        System.out.println("Concat String : "+strFinal);

        System.out.println("==================");

        char[] ch = {'b','o','o','k','0'};
        int [] arr = {1,44,2,3};
        String newString ="";
        for(int i =0;i<ch.length;i++){

            newString =newString + ch[i];
        }
        System.out.println(ch.getClass());
        System.out.println("From Char Array to String : "+newString);


    }
}
