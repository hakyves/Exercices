package exercise1;

public interface CarInterface {
    public void speed();
    public void calculation();
    public void minuss();
    default void plusMeth(){
        System.out.println("This is a Default Method");
    }
}
