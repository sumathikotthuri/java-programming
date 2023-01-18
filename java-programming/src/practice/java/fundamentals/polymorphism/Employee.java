package practice.java.fundamentals.polymorphism;

public class Employee extends Person{
    int age;

    Employee(){
        age = 34;
    }

    public void getDetails(){
        System.out.println(name);
    }
}
