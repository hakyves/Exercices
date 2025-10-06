package JavaExericses.Arrays;

public class ArraySumValue {
    public static void main(String []args){
        int [] arr ={1,3,4,5,2};
        System.out.println("Sum = "+sumvalue(arr));
        System.out.println("Average = "+avgValue(arr));

    }

    public static int sumvalue(int []num){
        int sum =0;
        for(int i=0;i<num.length;i++){
             sum += num[i];
        }
        return sum;
    }
    public static int avgValue(int []num){
        int sum =0;
        int avg =0;
        for(int i=0;i<num.length;i++){
            sum += num[i];
            avg = sum/num.length;
        }
        return avg;
    }

}
