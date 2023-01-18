package practice.java.fundamentals.polymorphism;

public class Person {
    String name;
    Person(){
        name = "John";
    }
    
    public void getDetails(){
        System.out.println(name);
    }
}
