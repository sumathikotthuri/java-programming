package practice.java.fundamentals.finalexamples;

//public final class Demo {
/* If I use the final keyword to the class , 
I will get compile time error in Demo2.java as I am extending this class
Compiler will not allow me to extend a final class */    
public class Demo {    

    final int tenure = 0;
    double principal;
    float interestRate;
    String accountNumber;
    final double calculateEMI(){
        return 2000;
    }
    
}
