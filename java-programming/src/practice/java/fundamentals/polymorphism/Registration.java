package practice.java.fundamentals.polymorphism;

public class Registration {

    String customerName;
    String panCardNo;
    int voterId;
    String passportNo;
    int licenseNo;
    long[] telephoneNo;


    Registration(String customerName,String passportNo,long[] telephoneNo){
        this.customerName = customerName;
        this.passportNo = passportNo;
        this.telephoneNo = telephoneNo;

        System.out.println("Congragulations "+customerName
            + "!!! you have been successfully registered to our"
             +" services with the following details:");
        System.out.println("Passport Number:"+passportNo);
        System.out.println("Phone Numbers:"+telephoneNo[0]
            +","+telephoneNo[1]);
    }

    Registration(String customerName,int licenseNo,String panCardNo, long[] telephoneNo){
        this.customerName = customerName;
        this.licenseNo = licenseNo;
        this.panCardNo = panCardNo;
        this.telephoneNo = telephoneNo;

        System.out.println("Congragulations "+customerName
        + "!!! you have been successfully registered to our"
         +" services with the following details:");
        System.out.println("License Number:"+licenseNo);
        System.out.println("Pancard Number:"+panCardNo);
        System.out.println("Phone Numbers:"+telephoneNo[0]
            +","+telephoneNo[1]);
    }

    Registration(String customerName, int voterId, int licenseNo, long[] telephoneNo){
        this.customerName = customerName;
        this.voterId = voterId;
        this.licenseNo = licenseNo;
        this.telephoneNo = telephoneNo;

        System.out.println("Congragulations "+customerName
        + "!!! you have been successfully registered to our"
         +" services with the following details:");
        System.out.println("Voter Id:"+voterId);
        System.out.println("License Number:"+licenseNo);
        System.out.println("Phone Numbers:"+telephoneNo[0]
        +","+telephoneNo[1]);
    }

    Registration(String customerName, String panCardNo, int voterId, long[] telephoneNo){
        this.customerName = customerName;
        this.panCardNo = panCardNo;
        this.voterId = voterId;
        this.telephoneNo = telephoneNo;

        System.out.println("Congragulations "+customerName
        + "!!! you have been successfully registered to our"
         +" services with the following details:");
        System.out.println("Pancard Number:"+panCardNo);
        System.out.println("Voter Id:"+voterId);        
        System.out.println("Phone Numbers:"+telephoneNo[0]
        +","+telephoneNo[1]);
    }

    public static void main(String[] args) {

        new Registration("Kevin", "MN9891N"
        ,new long[]{9452425421l, 7676765252l});

        new Registration("Julias", 123
        , "PN7878", new long[]{9452425421l, 7676765252l});

        new Registration("Jammy", 45453
        , 765, new long[]{9452425421l, 7676765252l});  
        
        new Registration("Rose", "PN8934"
        , 34356, new long[]{9452425421l, 7676765252l});   

    }
}
