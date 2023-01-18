package practice.java.fundamentals.inheritance;

public class EventRegistration {
    
    private String name;
    private String nameOfEvent;
    private double registrationFee;
    
    public EventRegistration(String name, String nameOfEvent) {
        this.name = name;
        this.nameOfEvent = nameOfEvent;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNameOfEvent() {
        return nameOfEvent;
    }

    public void setNameOfEvent(String nameOfEvent) {
        this.nameOfEvent = nameOfEvent;
    }

    public double getRegistrationFee() {
        return registrationFee;
    }

    public void setRegistrationFee(double registrationFee) {
        this.registrationFee = registrationFee;
    }

    void registerEvent(){
        switch(nameOfEvent){
            case "ShakeALeg":
                setRegistrationFee(100);
                break;
            case "Sing&Win":
                setRegistrationFee(150);
                break; 
            case "Actathon":
                setRegistrationFee(70);
                break; 
            case "PlayAway":
                setRegistrationFee(130);
                break;                                 
        }        
        System.out.println("Base Fee="+getRegistrationFee());
    }

    
}
