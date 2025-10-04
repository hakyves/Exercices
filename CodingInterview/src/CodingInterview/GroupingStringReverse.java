package CodingInterview;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class GroupingStringReverse {

    public static void main(String []args){
        GroupingStringReverse gsr = new GroupingStringReverse();
        String str = "cat,ant,bat,tac,tar,rat";
       System.out.println(gsr.myfunc(str));

    }


    public List<String> myfunc(String s){
        List<String> ls = new ArrayList<>();

        s=s.trim();
        String [] arr = s.split(",");
        for(int i=0;i< arr.length;i++){
            if(arr[i].startsWith("ta")||arr[i].endsWith("at")){
                ls.add(arr[i]);

            }
        }
       ///////////////////////



        return ls;

    }
}
