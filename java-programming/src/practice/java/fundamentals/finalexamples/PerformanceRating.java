package practice.java.fundamentals.finalexamples;

public class PerformanceRating {

    private static int Outstanding = 5;
    private static int Good = 4;
    private static int Average = 3;
    private static int Poor = 2;

    static int calculatePerformance(Employee employee){
        int rating = 0;
        if(employee.getPoint() >= 80 && employee.getPoint() <= 100){
            rating = Outstanding;           
        }else if(employee.getPoint() >=60 && employee.getPoint() <= 79){            
            rating =  Good;
        }else if(employee.getPoint() >= 50 && employee.getPoint() <= 59){            
            rating =  Average;
        }else if(employee.getPoint() >= 1 && employee.getPoint() <= 49){            
            rating =  Poor;
        }       
        return rating;
    }
    
}
