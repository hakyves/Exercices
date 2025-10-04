package CodingInterview;

public class Singleton {
    // create an private static instance of the class
    private static Singleton instance;
    // create a private constractor
    private Singleton(){

    }
    // create a method that return the instance of the class
    public static Singleton getInstance(){
        if(instance == null){
            instance = new Singleton();//
        }
        return instance;
    }

}
