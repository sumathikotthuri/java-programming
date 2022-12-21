package practice.java.fundamentals;

public class Constructors {
    public static void main(String[] args) {


        Bank b = new Bank();


        Chocolate1 choc = new Chocolate1();

        System.out.println("Barcode :"+choc.getBarCode());
        System.out.println("Name :"+choc.getName());
        System.out.println("Weight :"+choc.getWeight());
        System.out.println("Cost :"+choc.getCost());

        choc.setBarCode(102);
        choc.setName("Hershely\'s");
        choc.setWeight(24);
        choc.setCost(50);

        System.out.println("Barcode :"+choc.getBarCode());
        System.out.println("Name :"+choc.getName());
        System.out.println("Weight :"+choc.getWeight());
        System.out.println("Cost :"+choc.getCost());


    }
}

class Bank{
    void Bank(){
        System.out.println("null");
    }
}

class Chocolate1{

    private int barCode;
    private String name;
    private int weight;
    private int cost;

    Chocolate1(){
        System.out.println("Initializing....");
        barCode = 101;
        name = "Cadbury";
        weight = 12;
        cost = 10;
    }



    public int getBarCode() {
        return barCode;
    }
    public void setBarCode(int barCode) {
        this.barCode = barCode;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getWeight() {
        return weight;
    }
    public void setWeight(int weight) {
        this.weight = weight;
    }
    public int getCost() {
        return cost;
    }
    public void setCost(int cost) {
        this.cost = cost;
    }

    
}