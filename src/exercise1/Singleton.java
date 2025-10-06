package exercise1;

public class Singleton {
    public static void main(String[] args){
        Abc obj1 = Abc.getInstance();
      //  Abc obj2 = new Abc();

    }
}
class Abc{
    // Creating first a static obj
    static Abc obj = new Abc();
    //Second create a private constructor
    private Abc()
    {

    }
    //third create a static method that return instance
    public static Abc getInstance()
    {
        return obj;
    }

}
