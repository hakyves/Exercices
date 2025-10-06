package JavaExericses.String;

public class CharAtIndex {
    public static void main(String []args){
        String str = "Iaana";


         char c = str.charAt(0);
         int val0 = str.codePointAt(0);
        int val1 = str.codePointAt(1);
        int val2 = str.codePointAt(2);
        int val3 = str.codePointAt(3);
        int val4 = str.codePointAt(4);
        int val5 = str.codePointBefore(3);

        System.out.println("Char at index is : "+c);
        System.out.println("Code point 0 : "+val0);
        System.out.println("Code point 1 : "+val1);
        System.out.println("Code point 2 : "+val2);
        System.out.println("Code point before 3 : "+val5);
        System.out.println("Code point 3 : "+val3);
        System.out.println("Code point 4 : "+val4);
    }
}
