package exercise1;

public class Bank1 {
    String bankName,area,phoneNo;
    Bank1(){
        System.out.println("Inside constructor");
    }
    public static void main(String []args){
        Bank1 bank = new Bank1();
        System.out.println(bank.bankName);
    }
}
