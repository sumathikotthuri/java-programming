package practice.java.fundamentals.langpackageexamples;

public class StudentRegistration {

    String studentName;
    double age;
    int admissionNumber;
    int rollNumber;
    static int counter = 1000;    

    public StudentRegistration(String studentName, double age, int admissionNumber) {
        this.studentName = studentName;
        this.age = age;
        this.admissionNumber = admissionNumber;
    }

    public String getStudentName() {
        return studentName;
    }
    public double getAge() {
        return age;
    }
    public int getAdmissionNumber() {
        return admissionNumber;
    }
    public int getRollNumber() {
        return rollNumber;
    }
    public int getCounter() {
        return counter;
    }

    void generateRollNumber(){        
        counter++;
        rollNumber = counter;
    }

    public int hashCode(){
        return this.rollNumber;
    }

    public boolean equals(Object obj){      

        StudentRegistration student = ((StudentRegistration)obj);
        boolean status = (this.admissionNumber ==  student.getAdmissionNumber());

        if(status) System.out.println("Roll Number already generated for the student!");
        else{
            System.out.println("      Student Details      ");
            System.out.println("****************************");
            System.out.println("Student Name\t:"+student.getStudentName());
            System.out.println("Admission Number\t:"+student.getAdmissionNumber());
            System.out.println("Roll Number\t:"+student.getRollNumber());
        }
        return status;

    }


    


    
}
