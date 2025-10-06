package exercise1;

public class MythreadClass extends Thread{

    public void run(){

        System.out.println("Yves "+Thread.currentThread().getId()+" is running");
    }
}
class MultThreadDemo{
    public static void main(String []args){
        for(int i=0;i<5;i++) {
            MythreadClass thr = new MythreadClass();
            thr.start();
        }
    }
}
