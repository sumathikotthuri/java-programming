package practice.java.fundamentals.interfaceexamples;

public class Intern implements DataProvider{

    int marksSecured;
    int graceMarks;

    Intern(int marksSecured, int graceMarks){
        this.marksSecured = marksSecured;
        this.graceMarks = graceMarks;
    }

    public void calcPercentage(){
        if(marksSecured<=internMaximumMarks){
            int totalMarks = (marksSecured+graceMarks); 
            float totalPercentage = (totalMarks*100)/totalMaximumMarks;
            System.out.println("Total Marks :"+totalMarks);
            System.out.println("Total Marks Percentage :"+totalPercentage);
    
        }else{
            System.out.println("Please enter correct Marks");
        }
        
    }
}
