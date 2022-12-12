package practice.java.fundamentals;

public class RealTimeScenarios {
    public static void main(String[] args) {
        RealTimeScenarios rts = new RealTimeScenarios();
        rts.printDiscountedBillAmount(1001, 101, 2, 
            199.99);
        rts.printDiscountedBillAmount(1002, 102, 4, 
            210.5);
        
    }

    double calculateIntDiscount(double billAmount,int discount){       
        double discountedAmount = (billAmount - ( billAmount*(discount/100)));        
        return discountedAmount;
    }

    double calculateDoubleDiscount(double billAmount,double discount){       
        double discountedAmount = (billAmount - ( billAmount*(discount/100)));        
        return discountedAmount;
    }

    void printDiscountedBillAmount(int billId, int customerId, int discount, double billAmount){
        System.out.println("Discounted Amount of billAmount = "+billAmount+" of billId = "+billId +", customerId = "
        +customerId +" int discount is : "+ calculateIntDiscount(billAmount,discount));
        System.out.println("Discounted Amount of billAmount = "+billAmount+" of billId = "+billId +", customerId = "
        +customerId +" double discount is : "+ calculateDoubleDiscount(billAmount,discount));
    }
}
