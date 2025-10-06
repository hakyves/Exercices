package Feb2023Exercise;

public class CheckVowel {
    public static void main(String []args){
        String str = "knfmhd";
        System.out.println(checkVowel(str));
    }
    public static Boolean checkVowel(String str){
        boolean flag =false;

        for(int i=0;i<str.length();i++){
            char c = str.charAt(i);
            if(c=='i'||c=='u'||c=='o'||c=='a'||c=='e'){
                flag = true;
                break;//
            }
        }
        return flag;

    }
}
