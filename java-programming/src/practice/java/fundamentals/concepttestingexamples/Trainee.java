package practice.java.fundamentals.concepttestingexamples;

public class Trainee extends Employee{
    
    public static void display() {
        System.out.print("Trainee");
    }

    public static void main(String[] args) {
        Employee e = new Trainee();
        e.display();
    }

}
