package CodingInterview;

public class FizzBuzzFinal {

    /*
      Print numbers from 1 to n.

       Numbers divisible by 3 → print "Fizz".

      Numbers divisible by 5 → print "Buzz".

      Numbers divisible by both 3 and 5 → print "FizzBuzz".

        Otherwise, just print the number.
     */
    public static void main(String []arg){
        int n = 16;
        fizzBuzz(n);
    }

    public static void fizzBuzz(int n) {
        // Write your code here
        for(int i=0;i<n;i++){
            if(i%3==0 && i%5==0){
                System.out.println("FizzBuzz");
            }
            else if (i%3==0 && i%5!=0) {
                System.out.println("Fizz");
            }
            else if (i%3!=0 && i%5==0) {
                System.out.println("Buzz");
            }
            else if (i%3!=0 || i%5!=0) {
                System.out.println(i);
            }    else {
                System.out.println(i);
            }
        }

    }

}
/*
1
2
Fizz
4
Buzz
Fizz
7
8
Fizz
Buzz
11
Fizz
13
14
FizzBuzz
 */
