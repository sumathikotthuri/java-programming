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


