package practice.java.fundamentals.interfaceexamples;

public class Trainee implements DataProvider{

    int marksSecured;

    Trainee(int marksSecured){
        this.marksSecured = marksSecured;
    }

    @Override
    public void calcPercentage() {
        if(marksSecured<=totalMaximumMarks){
            int totalMarks = marksSecured; 
            float totalPercentage = (totalMarks*100)/totalMaximumMarks;
            System.out.println("Total Marks :"+totalMarks);
            System.out.println("Total Marks Percentage :"+totalPercentage); 
        }else{
            System.out.println("Please enter correct Marks");
        }
    }
    
}
