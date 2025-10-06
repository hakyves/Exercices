package exercise1;

public class ExceptionH {
    public static void main(String[] args){
        int [] arr = new int[4];
        try
        {
            int i = arr[4];
            System.out.println("Inside try block");
        }
        catch(NullPointerException ex){
            System.out.println("Exception caught in catch block");
        }
        System.out.println("Outside try-catch clause");
    }
}
