package CodingInterview;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SmoothedMovingAverage {
    public static void main(String []args){
        List<Integer> lst = Arrays.asList(1,1,1,1,2,1,1);
        int K = 3;
        System.out.println(smoothedMoving(lst,K));
    }

    public static List<Integer> smoothedMoving(List<Integer> lst, int K){
        List<Integer> newlst = new ArrayList<>();
        int sum =0;
        int avg = 0;
        int N = lst.size();
        for(int i=0;i<N-K-1;i++){
            for(int j=i+1;j<K;j++){
                sum+= lst.get(j);
                avg = sum/K;
                newlst.add(avg);
            }

        }

        return newlst;
    }
}
