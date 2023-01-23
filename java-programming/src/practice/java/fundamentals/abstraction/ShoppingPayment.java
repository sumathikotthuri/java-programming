package practice.java.fundamentals.abstraction;

public class ShoppingPayment extends RRPaymentServices{

    static int counter = 1000;
    String paymentID;

    public String getPaymentID() {
        paymentID = "S"+(++counter);
        return paymentID;
    }   

    ShoppingPayment(double balance, int customerID) {
        super(balance, customerID);        
    }

    @Override
    void payBill(double amount) {
        
       
        if(amount > balance){
            System.out.println("Excess amount entered !! "
            + " Please try again");  
        }else if(balance > amount){
            System.out.println("Insufficient amount entered !! "
            + " Please try again");            
         }if (balance==amount){
            System.out.println("Congratulations!! Your payment of "
            + amount + " is successful with payment id " + getPaymentID());           
        }
        
    }
    
}
