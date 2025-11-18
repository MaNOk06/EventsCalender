public class WellnessActivity {
    //  Attributes
    private String activityName;
    private String activityType;
    private int sessionDuration;
    private String location;
    private int availableSlots;
    
    // Constructor
    public WellnessActivity(String activityName, String activityType, int sessionDuration, String location, int availableSlots){
        this.activityName = activityName;
        this.activityType = activityType;
        this.sessionDuration = sessionDuration;
        this.location = location;
        this.availableSlots = availableSlots;
    }

    //
    public void displayEventDetails(){

    }

    // Getters
    public String getActivityName(){
        return activityName;
    }
    public String getActivityType(){
        return activityType;
    }
    public int getSessionDuration(){
        return sessionDuration;
    }
    public String getLocation(){
        return location;
    }
    public int getAvailableSlots(){
        return availableSlots;
    }

    // Setters
    public void setActivityName(String name){
        this.activityName = name;
    }
    public void setAactivityType(String type){
        this.activityType = type;
    }
    public void setSessionDuration(int duration){
        this.sessionDuration = duration;
    }
    public void setLocation( String locationActivity){
        this.location = locationActivity;
    }
    public void setAvailableSlots(int slots){
        this.availableSlots = slots;
    }
}