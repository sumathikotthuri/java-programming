package practice.java.fundamentals;

public class Inheritance {

    public static void main(String[] args) {
       /*Student1 stu = new Student1();
        stu.name = "abc";
        stu.id = 123; */ 

        Customer c = new Customer(20000);
        c.displayDetails();
    }
    
}


class Person2{
    String name;
    Person2(){
        name = "John";
    }
}

class Employee extends Person2{
    int age;
    Employee(){
        age = 34;
    }    
}

class Customer extends Person2{
    int salary;
    Customer(int salary){
        this.salary = salary;
        name = "Maddy";
    }

    public void displayDetails(){
        //System.out.println(name+age+salary); This will give compilation error
        System.out.println(name+salary);
    }
}

class Person1{
    String name;
    Person1(){
        System.out.println("In Person Class");        
    }
}

class Student1 extends Person1{
    int id;
    Student1(){
        System.out.print("In Student1 Class");
    }
}