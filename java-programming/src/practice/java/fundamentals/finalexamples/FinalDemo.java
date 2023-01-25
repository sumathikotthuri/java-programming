package practice.java.fundamentals.finalexamples;

class FinalDemo{

    public static void main(String[] args) {
        Demo d = new Demo();
        //d.tenure = 1;
        /* The above line will give me compile time error as the tenure is 
         * final variable and I am trying to modify the initialized value
         */
        System.out.println(d.tenure);
        System.out.println(d.calculateEMI());
    }

}

