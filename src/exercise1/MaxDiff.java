package exercise1;

public class MaxDiff{


    public static void main(String []args) {
        int arr[] = {1, 2, 90, 10, 110};
        System.out.println(maxDiff(arr));

    }
        public static int maxDiff(int []arr){

         //   int max = arr[1] - arr[0];
            int max = 0;
            int i = 0;
            int j = i + 1;
            for (i = 0; i < arr.length; i++) {
                for (j = 1; j < arr.length; j++) {
                    int diff = arr[j] - arr[i];

                    if (diff > max) {
                        max = diff;
                    }
                }

            }
            return max;


    }

}
