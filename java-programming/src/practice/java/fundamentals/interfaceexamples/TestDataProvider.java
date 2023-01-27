package practice.java.fundamentals.interfaceexamples;

public class TestDataProvider {

    public static void main(String[] args) {

        DataProvider intern = new Intern(5000, 500);
        intern.calcPercentage();

        DataProvider trainee = new Trainee(6000);
        trainee.calcPercentage();

        DataProvider intern1 = new Intern(8000, 500);
        intern1.calcPercentage();

    }
    
}
