package practice.java.fundamentals.inheritance;

public class PermanentEmployee extends Employee{
    
    private double basicPay;
    private double hra;
    private int experience;

    public double getBasicPay() {
        return basicPay;
    }
    public void setBasicPay(double basicPay) {
        this.basicPay = basicPay;
    }
    public double getHra() {
        return hra;
    }
    public void setHra(double hra) {
        this.hra = hra;
    }
    public int getExperience() {
        return experience;
    }
    public void setExperience(int experience) {
        this.experience = experience;
    }

    void calculateSalary(){
        double salary = 0;
        double vCompPercent= 0;
        double vComponent= 0;
        if(experience < 3){
            vCompPercent = 0;
        }else if (experience >= 3 && experience < 5){
            vCompPercent = 5;
        }else if (experience >= 5 && experience < 10){
            vCompPercent = 7;
        }else if (experience >= 10){
            vCompPercent = 12;
        }
        vComponent = (basicPay*vCompPercent)/100;
        salary = vComponent + basicPay + hra;
        System.out.println("Permanent Employee: Your Salary is :"+salary);
    }
}
