package practice.java.fundamentals.polymorphism;

public class Student extends Person1{
    void Print(){
        System.out.println("student name"+name);
    }

    Student(){
        System.out.println("In Student class");
    }

    int id;

    public static void main(String[] args) {
        Person1 person = null;
        person = new Student();
        person.name = "abc";
        person.Print();
    }
}
