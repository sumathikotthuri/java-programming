package practice.java.fundamentals;

public class Operators {
    public static void main(String[] args) {

        int x = 100;
        int y = x;
        x++;
        int z = y;
        z++;
        System.out.println(y);
        System.out.println(z);


        int m = 1;
        int n = ++m + m++ + --m;
        System.out.println(n);


        boolean a = true;
        boolean b = !true;
        boolean c = a|b;
        boolean d = a&b;
        boolean e = d?b:c;
        System.out.println(d+" "+e);


        boolean p = true;
        boolean q = false;
        System.out.println(!(p && q));
        System.out.println(p&&q);
        System.out.println(p||q);

        int res = 1 + 2;
        System.out.println(res);

        res -=  1; //res = res - 1;
        System.out.println(res);

        res *= 2;  //res = res*2;
        System.out.println(res);

        res /= 2; //res = res/2;
        System.out.println(res);

        res  += 8; //res = res+8;
        System.out.println(res);
        
        res %= 7; //res = res%7;
        System.out.println(res);

        








    }    
}
