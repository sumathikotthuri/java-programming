package practice.java.fundamentals;

public class ControlStructures {

    public static void main(String[] args) {
        int i = 1, j =-1;
        switch(i){
            case 0,1:
                j=1;
            case 2:
                j=2;
            default:
                j = 0;

        }
        System.out.println("j="+j);


        float f = 12;
        //switch(f){  // This line will give compile time error
        switch((int)f){
            case 10+1:
                System.out.println("Twelve");
            case 0:
                System.out.println("Zero");
            case (int)12.0:
                System.out.println("Decimal");
            default:
                System.out.println("Default");

        }


        int x = 1, y = 10;
        do{
            if(x>y){
                break;
            }
            y--;//6
        }while(++x < 5);//5
        System.out.println("x = "+x+" and y = "+y);


        int sum = 0;
        for(int p=0,q=0;p<5&q<5;++p,q=p+1)
            sum+=p; 
         
        System.out.println("sum = "+sum);            
            
        ControlStructures cs = new ControlStructures();
        int num = 201231417;
        System.out.println("reverse of the number "+num+" using while is : "
            +cs.reverseNumberWithWhile(num));
        System.out.println("reverse of the number "+num+" using for is : "
            +cs.reverseNumberWithFor(num));
        System.out.println("reverse of the number "+num+" using doWhile is : "
            +cs.reverseNumberWithDoWhile(num));
        
        cs.isArmstrongNumber(153);
        cs.isArmstrongNumber(123);

        cs.isLuckyNumber(1623);
        cs.isLuckyNumber(1236);

        
        
    }


    String reverseNumberWithWhile(int number){        
        String reversedString = "";
        // My logic
        /*char[] digits = Integer.toString(number).toCharArray();        
        int index = digits.length;
        while(index > 0){ 
            reversedString+=Character.toString(digits[--index]);                      
        }*/

        // Efficient standard algorithm
        while(number>0){
            reversedString += number % 10;
            number = number / 10;            
        }
        return reversedString;
    }
    
    
    String reverseNumberWithFor(int number){        
        String reversedString = "";        

        // Efficient standard algorithm
        for(;number>0;){
            reversedString += number % 10;
            number = number / 10;            
        }
        return reversedString;
    }


    String reverseNumberWithDoWhile(int number){        
        String reversedString = "";        

        // Efficient standard algorithm
        do{
            reversedString += number % 10;
            number = number / 10; 
        }while(number>0);
        return reversedString;
    }
    
    void isArmstrongNumber(int number){

        String numString = Integer.toString(number);
        int sumOfCubes = 0;
        for(int i=0;i<numString.length();i++){
            int digit =  Character.getNumericValue(numString.charAt(i)); 
            sumOfCubes += Math.pow(digit,3);
        }
        if(sumOfCubes == number)
            System.out.println("The number "+number+" is Armstrong number");
        else
            System.out.println("The number "+number+" is not Armstrong number");
        
    }

    void isLuckyNumber(int number){
        String numString = Integer.toString(number);       

        boolean luckyNumber = true;
        for(int i = 1;i<numString.length();i=i+2){            
            if(!(Character.getNumericValue(numString.charAt(i))%3==0)){
                luckyNumber = false;
                break;
            }
        }

        if(luckyNumber)
            System.out.println("The number "+number+" is a lucky Number");
        else
            System.out.println("The number "+number+" is not a lucky Number");        

    }
}
