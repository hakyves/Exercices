package CodingInterview;

public class ReverseInteger {
    public static void main(String []arg){
        ReverseInteger rvs = new ReverseInteger();
        Integer x =-123;
        System.out.println(rvs.reverse(x));


    }
    public int reverse(Integer x){
        int res = 0;
        boolean isNegative = x<0;
        String strX = String.valueOf(Math.abs(x));
      //  String strX = String.valueOf(x);
        System.out.println(strX);
        StringBuilder sb = new StringBuilder(strX).reverse();
        res = Integer.parseInt(sb.toString());

        return isNegative? -res:res;
    }
}
