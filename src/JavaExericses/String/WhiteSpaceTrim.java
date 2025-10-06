package JavaExericses.String;

public class WhiteSpaceTrim {
    public static void main(String []args){
        String str = "My vows are true and firm";
        String newstr ="";
        for(int i=0;i<str.length();i++){
            if(str.charAt(i)==' '){
                continue;
            }else {
                char c = str.charAt(i);
                newstr = newstr + c;
            }

        }
        System.out.println(newstr);
    }
}
