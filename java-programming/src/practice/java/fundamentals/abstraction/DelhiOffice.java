package practice.java.fundamentals.abstraction;

public class DelhiOffice extends Bank{

    DelhiOffice(){
        super("Axis Bank");
    }

    public static void main(String[] args) {
        Bank bank = new DelhiOffice();
        System.out.println(bank.getBankName());
    }

    void deposit(){

    }
}
