package practice.java.fundamentals.modularityexamples;

public interface RoomBillComponent {

    double TAX = 0.12;
    double EXTRA_PERSON_CHARGE = 500.0;
    double FOOD_CHARGE = 800.0;

    double calculateBill();
    
}
