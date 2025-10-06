package exercise1;

public class Loan {
    public double calculateEMI(double principal){
        double simpleInterest = (principal*8.5*5)/100;
        double emi =(simpleInterest+principal)/5;
        return emi;
    }
}
 class HomeLoan extends Loan{
    public double calculateEMI(double principal){
        int additionaltax  = 10;
        double emi = super.calculateEMI(principal);
        return emi +additionaltax;
    }
 }
 class CarLoan extends Loan{
    public double calculateEMI(double principal){
        int additionaltax1 = 400;
        double emi1 = super.calculateEMI(principal);
        return emi1 + additionaltax1;
    }
 }
 class ExecuteLoan {
    public static void main(String[] args){
        Loan loan = null;
        loan = new HomeLoan();
        Loan loan1 = new CarLoan();
        double hloan = loan.calculateEMI(200000);
        System.out.println("Home Loan Emi per year .. "+hloan);
        double cloan = loan1.calculateEMI(200000);
        System.out.println("Car Loan Emi per year .. "+cloan);
    }
 }
