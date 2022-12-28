package practice.java.fundamentals.inheritance;

public class ContractEmployee extends Employee{

    private double wages;
    private int hours;

    public double getWages() {
        return wages;
    }
    public void setWages(double wages) {
        this.wages = wages;
    }
    public int getHours() {
        return hours;
    }
    public void setHours(int hours) {
        this.hours = hours;
    }
    
    void calculateSalary(){
        double salary = hours*wages;
        System.out.println("Contract Employee: Your Salary is :"+salary);
    }
    
}
