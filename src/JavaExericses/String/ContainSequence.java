package JavaExericses.String;

public class ContainSequence {
    public static void main(String []args){
        String str ="PHP Exercises and Python Exercises ";
        String ctrstr ="andx";
        boolean res = str.contains(ctrstr);
        System.out.println(res);
        char[] arr = new char[]{'1','2','3','4'};
        String str2 = String.copyValueOf(arr,0,4);
        System.out.println(str2);
    }

}
