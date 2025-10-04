package CodingInterview;

public class LongestIncreasingSubsq {
    public static void main(String []arg){
        int [] arr ={3,1,8,2,5};
        System.out.println(solution(arr));
    }


    public static int solution(int []arr){
        int n = arr.length;
        int count =0;
        for(int i=0;i<n-1;i++){
            int j=i+1;
            for(j=1;j<n-1;j++){
                if(arr[i]<arr[j]){
                    count++;
                }
            }
        }
        return count;
    }
}
