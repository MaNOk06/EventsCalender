public class WellnessActivity implements infoEvent {
    // Attributes
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

    public void displayEventDetails(){
        System.out.println("Activity Name: " + activityName);
        System.out.println("Activity Type: " + activityType);
        System.out.println("Duration: " + sessionDuration);
        System.out.println("Location: " + location);
        System.out.println("Available Slots: " + availableSlots);
    }

    // 
    @Override
    public String getEventName(){ return activityName; }

    @Override
    public String getEventType(){ return activityType; }

    @Override
    public String getEventLocation(){ return location; }

    @Override
    public String getEventDescription(){ return "Wellness Session (" + sessionDuration + " mins) with " + availableSlots + " slots."; }

    @Override
    public String getOrganisers(){ return "Wellness Team"; }
    
    // Getters
    public String getActivityName(){ return activityName; }
    public String getActivityType(){ return activityType; }
    public int getSessionDuration(){ return sessionDuration; }
    public String getLocation(){ return location; }
    public int getAvailableSlots(){ return availableSlots; }

    // Setters
    public void setActivityName(String name){ this.activityName = name; }
    public void setAactivityType(String type){ this.activityType = type; }
    public void setSessionDuration(int duration){ this.sessionDuration = duration; }
    public void setLocation(String locationActivity){ this.location = locationActivity; }
    public void setAvailableSlots(int slots){ this.availableSlots = slots; }

    @Override
    public String toString(){
        return activityName + " at " + location;
    }
}