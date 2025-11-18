public class Games {

    // Attributes
    private String gameName;
    private String gameType;
    private int maxPlayers;
    private String location;
    private int duration; // in minutes
    private String prize;


    // Constructor
    public Games(String gameName, String gameType, int maxPlayers, String location, int duration, String prize){
        this.gameName = gameName;
        this.gameType = gameType;
        this.maxPlayers = maxPlayers;
        this.location = location;
        this.duration = duration;
        this.prize = prize;
    }
    
    // 
    public void displayGameDetails(){

    }

    // Getters
    public String getGameName(){
        return gameName;
    }

    public String getGameType(){
        return gameType;
    }

    public int getMaxPlayers(){
        return maxPlayers;
    }

    public String getLocation(){
        return location;
    }

    public String getPrize(){
        return prize;
    }

    public int getDuration(){
        return duration;
    }

    // Setters
    public void setGameName(String name){
        this.gameName = name;
    }

    public void setGameType(String type){
        this.gameType = type;
    }

    public void setMaxPlayers(int max){
        this.maxPlayers = max;
    }

    public void setLocation(String loc){
        this.location = loc;
    }

    public void setDuration(int mins){
        this.duration = mins;
    }

    public void setPrize(String reward){
        this.prize = reward;
    }


    @Override
    public String toString(){
        return gameName + "at" + location;
    }
}