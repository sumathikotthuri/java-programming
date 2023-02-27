package practice.java.fundamentals.concepttestingexamples;

abstract class Person1 {

    public final void display(){
        System.out.println("Display method in a Person");
    }

    public static void main(String[] args){
        Person1 person = new Student1();
        person.display();
    }
    
}
