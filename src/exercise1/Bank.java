package exercise1;

public class Bank {
    public static void main(String[] args){
        Customer[] customer = new Customer[2];
        Customer customer1 = new Customer("Jireh","1234");
        Customer customer2 = new Customer("Yves","3333");
        customer[0] = customer1;
        customer[1] =customer2;
        for(int i=0;i<customer.length;i++){
            Customer custObj = customer[i];
            String name = custObj.displayCustomerName();
            System.out.println("The Customer name is :"+name);
        }

    }
}
class Customer{
    private String name;
    private String customerId;

    public Customer(String uname,String ucustomerId) {
        this.name = uname;
        this.customerId = ucustomerId;
    }
    public String displayCustomerName(){
        return name;
    }
}
