package practice.java.fundamentals.langpackageexamples;

public class RegistrationTester {


    public static void main(String[] args) {
        
        StudentRegistration st1 = 
            new StudentRegistration("Peter", 23, 5001);
        st1.generateRollNumber();               

        StudentRegistration st2 =
            new StudentRegistration("Peter", 24, 5001); 
        st2.generateRollNumber();                          
        st1.equals(st2);
    }
    
}
