package practice.java.fundamentals.stringexamples;

public class LocationChanger {

    String location;;
    String name;

    public String getLocation() {
        return location;
    }
    public void setLocation(String location) {
        this.location = location;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }



    void checkCity(){
        if(location.contains("Delhi")){
            System.out.println("Welcome to Infy Mysore Delhites!");
        }else if(location.contains("Trivandrum")){
            System.out.println("Welcome to MyDC people of Trinfy!");
        }else if(location.contains("Bhubaneshwar")){
            System.out.println("You came a long way down south! We welcome you!");
        }else{
            System.out.println("Oops your city name is not listed!");
        }
    }
    

    void editAddress(){
        if(location.contains("STP")){
            System.out.println("Your location has been changed from STP to SEZ");
        }
        if(location.contains("SEZ")){
            System.out.println("Your location remains the same!");
        }
    }


    void welcomeEmployee(){
        String[] nameWords = name.split(" ");
        System.out.println("Hello "+nameWords[0]);
    }
    
}
