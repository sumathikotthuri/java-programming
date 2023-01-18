package practice.java.fundamentals.inheritance;

public class TeamEventRegistration extends EventRegistration{

    private int noOfParticipants;
    private int teamNo;
    
    TeamEventRegistration(String name, String nameOfEvent
        ,int noOfParticipants,int teamNo){
        super(name,nameOfEvent);
        this.noOfParticipants = noOfParticipants;
        this.teamNo = teamNo;
    }

    public int getNoOfParticipants() {
        return noOfParticipants;
    }

    public void setNoOfParticipants(int noOfParticipants) {
        this.noOfParticipants = noOfParticipants;
    }

    public int getTeamNo() {
        return teamNo;
    }

    public void setTeamNo(int teamNo) {
        this.teamNo = teamNo;
    }

    void registerEvent(){
        switch(getNameOfEvent()){
            case "ShakeALeg":
                setRegistrationFee(50);
                break;
            case "Sing&Win":
                setRegistrationFee(60);
                break; 
            case "Actathon":
                setRegistrationFee(80);
                break; 
            case "PlayAway":
                setRegistrationFee(100);
                break; 
            default:    
                setRegistrationFee(0);    
                                           
        }  
        if(getRegistrationFee()!=0){      
            setRegistrationFee(getRegistrationFee()*getNoOfParticipants());
            System.out.println("Thank You "+ getName() +" for your participation."
                    +"Your registration fee is : "+getRegistrationFee());
            System.out.println("You are participant no: "+getTeamNo());
        }else{
            System.out.println("Please choose a valid event");
        }
    }

    
}
