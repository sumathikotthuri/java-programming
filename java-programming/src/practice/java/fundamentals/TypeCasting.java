package practice.java.fundamentals;

public class TypeCasting {
	public static void main(String[] args) {	
		
		long x = 888432222; //This line will give compile time error
		//long x = (long)88843.78;
		float y = x;
		double z = x+y;
		System.out.println(z);
		
		
		double price = 30.0f;		
		System.out.print(price);
		
		byte b = 50;
		//b = b*50;  This line will give compile time error
		b = (byte) ((byte)b*50);
		System.out.println(b);
	}
	
	double meth(byte b, double y) {
		return (short)b/y*2;
	}
	
}
