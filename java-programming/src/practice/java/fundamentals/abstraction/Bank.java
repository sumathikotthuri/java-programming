package practice.java.fundamentals.abstraction;

public abstract class Bank {

    private String bankName;

    Bank(String bankName){
        this.bankName = bankName;
    }


    public String getBankName(){
        return bankName;
    }

    //private abstract void withdraw();   
    /*  The above line will give compile time error as private modifier is not applicable 
    to abstract methods, The applicable modifiers are public and protected */ 
    abstract void deposit();
    public void balance(){

    }
    
}
