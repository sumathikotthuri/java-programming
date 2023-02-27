package practice.java.fundamentals.modularityexamples;

public class Tester {

    public static void main(String[] args) {
        
        RoomDetails rm1 = new RoomDetails("Mahesh", "Standard",
                             0, 1);

        System.out.println("BillId: "+rm1.getBillId());  
        System.out.println("Customer Name: "+rm1.getCustomerName()); 
        System.out.println("No. of days of Stay: "+rm1.getNoOfDaysOfStay());
        System.out.println("Total Bill: "+rm1.calculateBill());                              
    }
    
}
