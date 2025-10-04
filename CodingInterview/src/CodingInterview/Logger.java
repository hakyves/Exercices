package CodingInterview;

public class Logger {
    private static Logger logger;
    private Logger(){};

    public static Logger getLogger(){
        if(logger == null){
            logger = new Logger();
        }
        return logger;
    }


}
class Main{
    public static void main(String []args){
        Logger logger1 = Logger.getLogger();
        Logger logger2 = Logger.getLogger();
        System.out.println(logger1.equals(logger2));

    }
}

