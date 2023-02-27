package practice.java.fundamentals.garbagecollectionexamples;

public class Tester {

    public static void main(String[] args) {
        
        House citizen1 = new House(1);
        House citizen2 = new House(2);
        House citizen3 = new House(3);
        House citizen4 = new House(4);

        citizen1 = citizen3;
        citizen2  = citizen4;
        citizen3 = null;

        //System.out.println("citizen3 house No: "+citizen3.getHouseNuber());
        System.out.println("citizen1 house No: "+citizen1.getHouseNuber());

        citizen1 = citizen4;

        System.out.println("citizen1 house No: "+citizen1.getHouseNuber());
        System.out.println("citizen2 house No: "+citizen2.getHouseNuber());
        //System.out.println("citizen3 house No: "+citizen3.getHouseNuber());
        System.out.println("citizen4 house No: "+citizen4.getHouseNuber());


    }
    
}
