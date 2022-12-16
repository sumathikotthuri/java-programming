package practice.java.fundamentals;

public class ClassAndObjects {
    /*private static void main(String[] args) {
        System.out.println("Hello World");
    }*/

    // The above code will compile and generates the .class file but at runtime
    // we get 
    // Error: Could not find or load main class ClassAndObjects
    //Caused by: java.lang.NoClassDefFoundError: 
    // practice/java/fundamentals/ClassAndObjects (wrong name: ClassAndObjects)

    public static void main(String[] args) {

        Student s1 = new Student();
        s1.setStudentId(1001);
        s1.setName("Jacob");
        s1.setQualifyingExamMarks(80);
        s1.setResidentialStatus('H');
        s1.setYearOfEngg(3);

        System.out.println("Student Name\t\t:"+s1.getName());
        System.out.println("Student Id\t\t:"+s1.getStudentId());
        System.out.println("Qualifying Marks\t:"+s1.getQualifyingExamMarks());
        System.out.println("Year of Engineering\t:"+s1.getYearOfEngg());
        System.out.println("Residential Status\t:"+s1.getResidentialStatus());


        Chocolate c = new Chocolate(101,"Cadbury",12,10);
        System.out.println("Barcode :"+c.getBarCode());
        System.out.println("Name :"+c.getName());
        System.out.println("Weight :"+c.getWeight());
        System.out.println("Cost :"+c.getCost());

        c.setBarCode(102);
        c.setName("Hershey's");
        c.setWeight(24);
        c.setCost(50);
        System.out.println("Barcode :"+c.getBarCode());
        System.out.println("Name :"+c.getName());
        System.out.println("Weight :"+c.getWeight());
        System.out.println("Cost :"+c.getCost());

    }

}
class Student{
    private int studentId;
    private String name;
    private float qualifyingExamMarks;
    private char residentialStatus;
    private int yearOfEngg;



    public int getStudentId() {
        return studentId;
    }
    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public float getQualifyingExamMarks() {
        return qualifyingExamMarks;
    }
    public void setQualifyingExamMarks(float qualifyingExamMarks) {
        this.qualifyingExamMarks = qualifyingExamMarks;
    }
    public char getResidentialStatus() {
        return residentialStatus;
    }
    public void setResidentialStatus(char residentialStatus) {
        this.residentialStatus = residentialStatus;
    }
    public int getYearOfEngg() {
        return yearOfEngg;
    }
    public void setYearOfEngg(int yearOfEngg) {
        this.yearOfEngg = yearOfEngg;
    }

}


class Chocolate{

    private int barCode;
    private String name;
    private double weight;
    private double cost;

    public int getBarCode() {
        return barCode;
    }

    public void setBarCode(int barCode) {
        this.barCode = barCode;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public double getCost() {
        return cost;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }

    Chocolate(){
        System.out.println("Default Constructor");
    }

    Chocolate(int barCode,String name,double weight,double cost){
        this.barCode = barCode;
        this.name = name;
        this.weight = weight;
        this.cost = cost;
    }
    
}

