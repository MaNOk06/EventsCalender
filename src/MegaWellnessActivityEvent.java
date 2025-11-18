import java.util.ArrayList;
import java.util.List;

public class MegaWellnessActivityEvent{
    
    // Attributes
    private Event eventDetails; //Composition of event;
    private List<WellnessActivity> activities;
    private List<Games> games;
    private boolean refreshmentsAvailable;

    // Constructor
    public MegaWellnessActivityEvent(Event eventDetails, boolean refreshmentsAvailable){
        this.eventDetails = eventDetails;
        this.activities = new ArrayList<>();
        this.games = new ArrayList<>();
        this.refreshmentsAvailable = refreshmentsAvailable;
    }

    //
    public void displayMegaWellnessDetails(){
        eventDetails.displayEventDetails();
        System.out.println("Number of Games: " + games.size());
        System.out.println("Refreshment Available: " + refreshmentsAvailable());
        System.out.println("Number of Activities: " + activities.size());
    }

    public void addActivity(WellnessActivity activity){
        activities.add(activity);
    }

    public void addGame(Games game){
        games.add(game);
    }

    // Getters
    public Event getEventDetails(){
        return eventDetails;
    }

    public List<WellnessActivity> getActivities(){
        return activities;
    }

    public List<Games> getGames(){
        return games;
    }

    public boolean refreshmentsAvailable(){
        return refreshmentsAvailable;
    }

    // Setters
    public void setRefreshmentsAvailable(boolean confirm){
        this.refreshmentsAvailable = confirm;
    }
}