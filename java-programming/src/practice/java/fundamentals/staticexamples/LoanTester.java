package practice.java.fundamentals.staticexamples;

public class LoanTester {

    public static void main(String[] args) {
        Loan l1 = new Loan();
        System.out.println(l1.getLoanCounter());

        Loan l2 = new Loan(0, 0, 0, 0, 0);
        System.out.println(l2.getLoanCounter());
        
    }
    
}
