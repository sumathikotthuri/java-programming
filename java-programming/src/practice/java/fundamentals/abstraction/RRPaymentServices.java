package practice.java.fundamentals.abstraction;

public abstract class RRPaymentServices {

    double balance;
    int customerID;

    RRPaymentServices(double balance, int customerID){
        this.balance = balance;
        this.customerID = customerID;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public int getCustomerID() {
        return customerID;
    }

    abstract void payBill(double amount);
    
}
