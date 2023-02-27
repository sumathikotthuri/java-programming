package practice.java.fundamentals.concepttestingexamples;

public class Tester {

    public static void main(String[] args) {
        //float f1 = 1234.0;
        float f2 = 1234;
        double d3 = 1234.0;
        long num = 1234;

        int x,y,z;

        //System.out.println(x+y+z);


        String s1 = "Infosys";
        String s2 = "Infosys";

        if(s1==s2){
            System.out.println("Equal");
        } else {
            System.out.println("Unequal");
        }

        if(s1.equals(s2)){
            System.out.println("Equal");
        } else {
            System.out.println("Unequal");
        }


        String value1 = "Hello";
        String value2 = new String("Hello");
        System.out.println(value1==value2);
        String value3 = value2.intern();
        System.out.println(value1==value3);


    }
    
}
