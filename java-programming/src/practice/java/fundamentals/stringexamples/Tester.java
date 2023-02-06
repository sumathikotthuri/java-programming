package practice.java.fundamentals.stringexamples;

public class Tester {

    public static void main(String[] args) {


        LocationChanger lc1 = new LocationChanger();
        lc1.setName("Annabelle Miheal");
        lc1.setLocation("BL003,Delhi,STP");

        lc1.welcomeEmployee();
        lc1.checkCity();
        lc1.editAddress();



        LocationChanger lc2 = new LocationChanger();
        lc2.setName("Jissele James");
        lc2.setLocation("FL091,Pune,SEZ");

        lc2.welcomeEmployee();
        lc2.checkCity();
        lc2.editAddress();




        
    }
    
}
