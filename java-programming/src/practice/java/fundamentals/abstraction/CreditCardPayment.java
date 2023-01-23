package practice.java.fundamentals.abstraction;

public class CreditCardPayment extends RRPaymentServices {


    static int counter=1000;
    String paymentID;
    double cashBack;
    double balanceDue;
    

    public String getPaymentID() {
        paymentID = "C"+(++counter);
        return paymentID;
    }

    public double getCashBack() {          
        return cashBack;
    }

    public double getBalanceDue() {
        return balanceDue;
    }

    CreditCardPayment(double balance, int customerID) {
        super(balance, customerID);              
    }

    @Override
    void payBill(double amount) {
        
        System.out.println("Congratulations!! You have successfully made a payment of "
        + amount + ". Payment Details are : ");
        System.out.println("***********************************************************"
        + "**********************************");        
        System.out.println("Customer ID\t\t\t:"+getCustomerID());
        System.out.println("Payment ID\t\t\t:"+getPaymentID());
        System.out.println("Previous Due \t\t\t:Rs."+getBalance());
        if(amount > balance){
            System.out.println("Remaining  Due \t\t\t:Rs."+getBalanceDue());
            System.out.println("Cashback wallet Balance \t:Rs."+ (amount - balance));
        }else{
            System.out.println("Remaining  Due \t\t\t:Rs."+balance);
            System.out.println("Cashback wallet Balance \t:Rs."+ amount);
        }
        
        
    }
    
}
