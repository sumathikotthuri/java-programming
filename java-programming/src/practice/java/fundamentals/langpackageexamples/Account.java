package practice.java.fundamentals.langpackageexamples;

public class Account {


    public static void main(String[] args) {
        
        Object[] o = new Object[3];
        o[0] = 12;
        //int i = o[0];   // This line will give compile time error
        int i = (int)o[0];
        System.out.println(1);


        Integer iw = new Integer(2);
        Integer iw2 = new Integer(2);

        System.out.println(iw * iw);
        System.out.println(iw.floatValue());









    }
    
}
