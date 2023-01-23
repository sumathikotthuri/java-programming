package practice.java.fundamentals.abstraction;

public class TestRRPayments {
    public static void main(String[] args) {


        RRPaymentServices rrpc1 = new CreditCardPayment(10000.23, 5001);
        rrpc1.payBill(15000.0);

        RRPaymentServices rrpc2 = new CreditCardPayment(10000.23, 5001);
        rrpc2.payBill(0);

        RRPaymentServices rrpc3 = new CreditCardPayment(10000.23, 5001);
        rrpc3.payBill(5000);

        RRPaymentServices rrps1 = new ShoppingPayment(5000.0, 561328);
        rrps1.payBill(5000);

        RRPaymentServices rrps2 = new ShoppingPayment(5000.0, 561328);
        rrps2.payBill(6000);

        RRPaymentServices rrps3 = new ShoppingPayment(5000.0, 561328);
        rrps3.payBill(4000);

    }
}
