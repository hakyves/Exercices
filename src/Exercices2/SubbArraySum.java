package Exercices2;

public class SubbArraySum {

    public static void main(String []args){
        int []arr = {1,3,7};
        System.out.println(subArraySum(arr));

    }
     static int subArraySum(int []arr){
//         int result =0;
//        for(int i=0;i<arr.length;i++){
//            int sum=0;
//            for(int j=i;j<arr.length;i++){
//                sum += arr[j];
//                 result += sum;
//            }
//        }
//         return result;
//         int result = 0;
//         for (int i = 0; i < arr.length; i++) {
//             int sum = 0;
//             for (int j = i; j < arr.length; i++) {
//                 sum += arr[j];
//                 result += sum;
//             }
//         }
//         return result;
         int result = 0;
         for (int i = 0; i < arr.length; i++) {
             for (int j = i; j < arr.length; i++) {
                 for (int k = i; k <= j; k++) {
                     result += arr[k];
                 }
             }
         }
         return result;
     }
}
