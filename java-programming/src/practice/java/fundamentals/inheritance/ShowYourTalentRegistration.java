package practice.java.fundamentals.inheritance;

public class ShowYourTalentRegistration {

    public static void main(String[] args) {
        EventRegistration participant1 = 
        new SingleEventRegistration("Jenny", "Sing&Win", 1);
        participant1.registerEvent();

        EventRegistration team1 =
        new TeamEventRegistration("Aura", "ShakeALeg",
         5, 1);
         team1.registerEvent();

        EventRegistration participant2 = 
        new SingleEventRegistration("Hudson", "PlayAway", 2);
        participant2.registerEvent();
        
        
    }
    
}
