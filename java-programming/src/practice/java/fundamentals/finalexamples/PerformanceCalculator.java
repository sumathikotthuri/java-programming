package practice.java.fundamentals.finalexamples;

public class PerformanceCalculator {

    public static void main(String[] args) {
        
        Employee e1 = new Employee();
        e1.setPoint(1);
        PerformanceRating pr1 = new PerformanceRating();
        int rating = pr1.calculatePerformance(e1);
        System.out.println("Rating:"+rating);
    }
   
    
}
