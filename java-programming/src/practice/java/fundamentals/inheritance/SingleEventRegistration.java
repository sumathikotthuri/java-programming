package practice.java.fundamentals.inheritance;

public class SingleEventRegistration extends EventRegistration{

    private int participantNo;   

    SingleEventRegistration(String name, String nameOfEvent,int participantNo){
        super(name, nameOfEvent);
        this.participantNo = participantNo;
    }

    public int getParticipantNo() {
        return participantNo;
    }

    public void setParticipantNo(int participantNo) {
        this.participantNo = participantNo;
    }

    void registerEvent(){
        switch(getNameOfEvent()){
            case "ShakeALeg":
                setRegistrationFee(100);
                break;
            case "Sing&Win":
                setRegistrationFee(150);
                break;             
            case "PlayAway":
                setRegistrationFee(130);
                break;  
            default:    
                setRegistrationFee(0);                           
        }        
        if(getRegistrationFee()!=0){
            System.out.println("Thank You "+ getName() +" for your participation."
            +"Your registration fee is : "+getRegistrationFee());
            System.out.println("You are participant no: "+getParticipantNo());
        }else{
            System.out.println("Please choose a valid event");
        }
        
    }
    
}
