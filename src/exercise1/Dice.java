package exercise1;

import javax.swing.*;
import java.util.*;

public class Dice {


    public static void main(String [] args) {

        int totalOfFaceRolled = 0;

       JFrame frame = new JFrame();

        Scanner in = new Scanner(System.in);
        System.out.println("Enter number of Dice :");
        int numberOfDice = in.nextInt();

        System.out.println("Enter number of Faces :");
        int numberOfFace = in.nextInt();


        int range = numberOfFace;


        for (int i = 1; i <= numberOfDice; i++) {
            int rand = (int) (Math.random() * range) + 1;
            //  System.out.println(rand);
            System.out.println("Face dice "+i+" : "+rand);
            totalOfFaceRolled += rand;

        }
        System.out.println("Total of Face : "+totalOfFaceRolled);
        int count = 0;
        List<Integer> ls = new ArrayList<>();
        for (int i = 0; i < 100; i++) {

                int rand = (int) (Math.random() * range) + 1;
                ls.add(rand);
        }

        Set<Integer> distinct = new HashSet<>(ls);
        for (Integer t : distinct){
            System.out.println(t+ " : "+Collections.frequency(ls, t));
        }
    }
}
