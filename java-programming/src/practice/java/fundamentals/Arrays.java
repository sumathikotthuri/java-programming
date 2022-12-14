package practice.java.fundamentals;

public class Arrays {

    public static void main(String[] args) {

        int[][] score = new int[2][];
        int[][] score1 = new int[2][2];
        int[][] score2 = new int[2][];
            score[0] = new int[2];
           
        int[] a;
        int[] arr = {12,13,14,44};

        for(float f: arr){
            System.out.println(f);
        }


        Arrays ar = new Arrays();
        ar.printSalaryAnalysis();


        int[] subjectMarks = new int[5];

        ar.storeMarks(subjectMarks);
        ar.printMarks(subjectMarks);

        
    }
    

    void printSalaryAnalysis(){
        double salary[] = {23500.0,25080.0,28760.0,22340.0,19890.0};        
        double sumOfSalaries = 0;
        for(double sal:salary){
            sumOfSalaries += sal;
        }
        double averageSal = sumOfSalaries/salary.length;
        System.out.println("The average salary of the employee is :"
            +averageSal);
        int greaterAvgSalCount=0,lesserAvgSalCount = 0;

        for(double sal:salary){
            if(sal >  averageSal){
                greaterAvgSalCount++;
            }else{
                lesserAvgSalCount++;
            }
        }
        System.out.println("The number of employees having salary greater than "
            +"the average is : "+ greaterAvgSalCount);
        System.out.println("The number of employees having salary lesser than"
            +"the average is : "+ lesserAvgSalCount);
    }

    void storeMarks(int[] marksArr){
        marksArr[0] = 10;
        marksArr[1] = 20;
        marksArr[2] = 30;
        marksArr[3] = 40;
        marksArr[4] = 50;
    }

    void printMarks(int[] marksArr){
        for(int marks :marksArr){
            System.out.println("marks="+marks);
        }
    }

}
