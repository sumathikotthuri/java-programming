package practice.java.fundamentals.staticexamples;

public class Person {

    private String name;
    private static int age;

    static{
        
        //name="John";  
        
        /* The above line will give error as we cannot use non- static variables
          in static block  */ 
    }

    Person(){
        age = 20;
    }

    public int getAge(){
        return age;
    }

}
