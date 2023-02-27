package practice.java.fundamentals.modularityexamples;

public class RoomDetails implements RoomBillComponent{

    int billId;
    String customerName;
    String typeOfRoom;
    int noOfExtraPersons;
    int noOfDaysOfStay;
    static int counter = 0;    


    public RoomDetails(String customerName, String typeOfRoom, int noOfExtraPersons, int noOfDaysOfStay) {
        this.customerName = customerName;
        this.typeOfRoom = typeOfRoom;
        this.noOfExtraPersons = noOfExtraPersons;
        this.noOfDaysOfStay = noOfDaysOfStay;
    }


    public int getBillId() {
        counter++;
        int billId = 100 + counter;
        return billId;
    }


    public String getCustomerName() {
        return customerName;
    }


    public String getTypeOfRoom() {
        return typeOfRoom;
    }


    public int getNoOfExtraPersons() {
        return noOfExtraPersons;
    }


    public int getNoOfDaysOfStay() {
        return noOfDaysOfStay;
    }


    public boolean validateTypeOfRoom() {
        if(typeOfRoom == RoomType.Standard.getTypeName()) return true;
        if(typeOfRoom == RoomType.Deluxe.getTypeName()) return true;
        if(typeOfRoom == RoomType.Cottage.getTypeName()) return true;
        return false;
    }


    public boolean validateNoOfExtraPersons() {
        if(noOfExtraPersons >= 0 && noOfExtraPersons <= 2 ) return true;        
        return false;
    }


    public boolean validateNoOfDaysOfStay() {
        if(noOfDaysOfStay >= 1 && noOfDaysOfStay <=15) return true;
        return false;
    }


    @Override
    public double calculateBill() {
        if(validateTypeOfRoom()){
            if(validateNoOfDaysOfStay()){
                if(validateNoOfExtraPersons()){
                    double baseFare = (RoomType.valueOf(typeOfRoom)).getPrice();

                    double totalBill = (noOfDaysOfStay*baseFare) 
                                        + (noOfDaysOfStay * FOOD_CHARGE)
                                        + (EXTRA_PERSON_CHARGE*noOfExtraPersons);

                    totalBill = totalBill + (TAX*totalBill) ;
                    
                    return totalBill;
                }
            }
        }        
        
        return 0;
    }

    
}
