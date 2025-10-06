package JavaExericses.String;

public class StringEndsWith {
    public static void main(String []args){
        String str1 ="Python Exercises";

        String testStr ="es";
        boolean tst = str1.endsWith(testStr);

        System.out.println(tst);

        String str2 ="Test1";
        String str3 ="Test1";
        boolean tst1 = str2.contentEquals(str3);
        System.out.println(tst1);
    }
}
