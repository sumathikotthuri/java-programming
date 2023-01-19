package practice.java.fundamentals.polymorphism;

public class PlayerRating {

    int playerPosition;
    String playerName;
    float criticOneRating;
    float criticTwoRating;
    float criticThreeRating;
    float averageRating;
    char category;

    public int getPlayerPosition() {
        return playerPosition;
    }

    public void setPlayerPosition(int playerPosition) {
        this.playerPosition = playerPosition;
    }

    public String getPlayerName() {
        return playerName;
    }

    public void setPlayerName(String playerName) {
        this.playerName = playerName;
    }

    public float getCriticOneRating() {
        return criticOneRating;
    }

    public void setCriticOneRating(float criticOneRating) {
        this.criticOneRating = criticOneRating;
    }

    public float getCriticTwoRating() {
        return criticTwoRating;
    }

    public void setCriticTwoRating(float criticTwoRating) {
        this.criticTwoRating = criticTwoRating;
    }

    public float getCriticThreeRating() {
        return criticThreeRating;
    }

    public void setCriticThreeRating(float criticThreeRating) {
        this.criticThreeRating = criticThreeRating;
    }

    public float getAverageRating() {
        return averageRating;
    }

    public void setAverageRating(float averageRating) {
        this.averageRating = averageRating;
    }

    public char getCategory() {
        return category;
    }

    public void setCategory(char category) {
        this.category = category;
    }

    PlayerRating(int playerPosition,String playerName){
        this.playerPosition = playerPosition;
        this.playerName = playerName;
    }

    void calculateAverageRating(float criticOneRating,float criticTwoRating){
        setAverageRating((criticOneRating+criticTwoRating)/2);
        calculateCategory();
        display();
    } 

    void calculateAverageRating(float criticOneRating,float criticTwoRating
        ,float criticThreeRating){
        setAverageRating((criticOneRating+criticTwoRating+criticThreeRating)/3);
        calculateCategory();
        display();
    } 
    
    
    void calculateCategory(){
        float avgRating = getAverageRating();
        if(avgRating>8){
            setCategory('A');
        }else if (avgRating > 5 && avgRating <= 8){
            setCategory('B');
        }else if (avgRating > 0 && avgRating <= 5){
            setCategory('C');
        }
    }

    void display(){
        System.out.println("the player name is "+ getPlayerName());
        System.out.println("the player position is "+ getPlayerPosition());
        System.out.println("the average rating is "+ getAverageRating());
        System.out.println("the category is "+ getCategory());
    }

    public static void main(String[] args) {
        PlayerRating pr1 = new PlayerRating(1, "Beckham");
        pr1.calculateAverageRating(9, 9.9f);

        PlayerRating pr2 = new PlayerRating(1, "Oscar");
        pr2.calculateAverageRating(1, 1,1);

    }
    
    
}
