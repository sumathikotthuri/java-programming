package practice.java.fundamentals.modularityexamples;

public enum RoomType {   

    Standard("Standard",2500),
    Deluxe("Deluxe",3500),
    Cottage("Cottage",5500);

    private String typeName;
    private double price;

    RoomType(String typeName,double price){
        this.typeName = typeName;
        this.price = price;
    }

    public String getTypeName() {
        return typeName;
    }

    public double getPrice() {
        return price;
    };

    
    
}
