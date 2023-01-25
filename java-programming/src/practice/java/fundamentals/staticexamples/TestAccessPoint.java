package practice.java.fundamentals.staticexamples;

public class TestAccessPoint {

    static int f1(){
        return 0;  
        // if there is return type to the block, and we don't write return statement,
        // we will get compile time error   
    }

    

    public static void main(String[] args) {

        AccessPoint obj1 = new AccessPoint();
        AccessPoint obj2 = new AccessPoint();
        
        obj1.x1= 0;
        obj1.y1 = 0;
        obj1.calculates(1, 2);

        obj2.x1 = 0;
        obj2.calculates(2,3);

        System.out.println(obj1.x1 + " " + obj2.y1);



    }
}
