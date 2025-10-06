package exercise1;

public class Singleton2{
    public static void main(String [] args){
        Abcd obj = Abcd.getInstance();

    }
}
class Abcd{
    static Abcd obj = new Abcd();
    private Abcd(){

    }
    static Abcd getInstance(){
        return obj;
    }

}
