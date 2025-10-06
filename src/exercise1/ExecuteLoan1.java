package exercise1;
class Loan1{
    private int amount;
    Loan1( int amount){
        this.amount = amount;
    }
}
class CarLoan1 extends Loan1 {
    private int interest;

    CarLoan1(int amount ) {
        super(amount);

    }

//    public int finalPayment(int interest,int amount) {
//
//        int finalPayment = super(amount) * interest;
//        return finalPayment;
//    }

}

    class HomeLoan1 extends Loan1 {
        private int interest;

        HomeLoan1(  int amount) {
            super(amount);

        }

        public int finalPayment(int amount) {
            int finalPayment = amount * interest;
            return finalPayment;

        }

    }


    public class ExecuteLoan1 {

        public static void main(String[] args) {


            CarLoan1 carloan1 = new CarLoan1(100000);
            HomeLoan1 homeloan1 = new HomeLoan1(10000);
        //    System.out.println( carloan1.finalPayment(5000));

        }


    }

