import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;

public class Games implements timelinesEvent, infoEvent {

    // Attributes
    private String gameName;
    private String gameType;
    private int maxPlayers;
    private String location;
    private int duration; // in minutes
    private String prize;

    // Internal inner class for Games timeline (Fixes "Event.Activity" error)
    private class GameRound {
        String activity;
        LocalTime start;
        int duration;
        LocalTime end;

        GameRound(String activity, LocalTime start, int duration, LocalTime end) {
            this.activity = activity;
            this.start = start;
            this.duration = duration;
            this.end = end;
        }

        @Override
        public String toString() {
            return start + "-" + end + ": " + activity + duration;
        }
    }

    // Timeline attributes
    private List<GameRound> timeline = new ArrayList<>();

    // Constructor
    public Games(String gameName, String gameType, int maxPlayers, String location, int duration, String prize){
        this.gameName = gameName;
        this.gameType = gameType;
        this.maxPlayers = maxPlayers;
        this.location = location;
        this.duration = duration;
        this.prize = prize;
    }

    // --- Interface Implementation: timelinesEvent ---
    @Override
    public void addActivity(String activity, LocalTime startTime, int duration, LocalTime endTime){
        timeline.add(new GameRound(activity, startTime, duration, endTime));
    }

    @Override
    public String getTimeline(){
        StringBuilder sb = new StringBuilder();
        for (GameRound a : timeline){
            sb.append(a.toString() + "\n");
        }
        return sb.toString();
    }
    
    // --- Interface Implementation: infoEvent ---
    @Override public String getEventName(){ return gameName; }
    @Override public String getEventDescription(){ return gameType + " game for up to " + maxPlayers + " , prize: " + prize; }
    @Override public String getEventType(){ return gameType; }
    @Override public String getEventLocation(){ return location; }
    @Override public String getOrganisers(){ return "There is no Game Host"; }

    // --- Class Specific Methods (Required for GamesTest.java) ---
    public void displayGameDetails(){
        System.out.println("Game Name: " + gameName);
        System.out.println("Game Type: " + gameType);
        System.out.println("Maximum Number of Players: " + maxPlayers);
        System.out.println("Location: " + location);
        System.out.println("Duration: " + duration + " minutes.");
        System.out.println("Prize for winner: " + prize);
    }

    // These specific getters are required by your GamesTest.java
    public String getGameName() { return gameName; }
    public String getGameType() { return gameType; }
    public int getMaxPlayers() { return maxPlayers; }
    public String getLocation() { return location; }
    public int getDuration() { return duration; }
    public String getPrize() { return prize; }
}