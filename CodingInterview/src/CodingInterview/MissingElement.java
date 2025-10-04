package CodingInterview;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MissingElement {


    public List<Integer>  solution(List<Integer> lst){
        List<Integer> rep = new ArrayList<>();
        List<Integer> missing = new ArrayList<>();
        Collections.sort(lst);
        for(int i=0;i<lst.size();i++){
            if(!(lst.get(i)==(lst.get(i+1)-1))){
              //  re.add(lst.get(i+1));

            }
        }
        return rep;
    }
}
