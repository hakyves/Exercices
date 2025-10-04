package CodingInterview;

public class MagnetLetter {
    public static void main(String []args){
        String s1 = "SAM";
        String s2 = "JOHN";
        String r = "SMJOHN";
        System.out.println(solution(s1,s2,r));
    }

    public static boolean solution(String s1,String s2,String r){
        boolean flag = false;
        String merged = s1+s2;
        if(merged.equals(r)){
            flag = true;
        }else{
            flag = false;
        }
        return flag;
    }
}
