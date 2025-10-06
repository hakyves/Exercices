package JavaExericses.String;

public class StringCopmaring {
    public static void main(String []args){
        String str1 = "This is Exercise 1";
        String str2 = "This Is Exercise 1";

        boolean result = str1.equals(str2);
        int res = str1.compareToIgnoreCase(str2);

        System.out.println(result);
        System.out.println(res);
    }
}
