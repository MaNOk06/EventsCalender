import java.time.LocalDate;
import java.time.LocalTime;

public class Event {
    // Attributes
    private String eventName;
    private String eventType;
    private String eventDescription;
    private String eventLocation;
    private LocalDate eventDate;
    private LocalTime eventTime;
    private String eventOrganisers;

    // In minutes
    private int duration;

    // Constructors
    public Event(String name, String type, String description, String location, LocalDate date, LocalTime time, int duration, String organisers){
        this.eventName = name;
        this.eventType = type;
        this.eventDescription = description;
        this.eventLocation = location;
        this.eventDate = date;
        this.eventTime = time;
        this.duration = duration;
        this.eventOrganisers = organisers;
    }

    //
    public void displayEventDetails(){}

    public void updateEventDetails(){}

    // Getters
    public String getEventName(){
        return eventName;
    }
    public String getEventType(){
        return eventType;
    }    
    public String getEventDescription(){
        return eventDescription;
    }
    public String getEventLocation(){
        return eventLocation;
    }    
    public LocalDate getEventDate(){
        return eventDate;
    } 
    public LocalTime getEventTime(){
        return eventTime;
    }
    public int getDuration(){
        return duration;
    }
    public String getOrganisers(){
        return eventOrganisers;
    }

    //Setters
    public void setEventName(String name){
        this.eventName = name;
    }
    public void setEventType(String type){
        this.eventType = type;
    }    
    public void setEventDescription(String description){
        this.eventDescription = description;

    }
    public void setEventLocation(String location){
        this.eventLocation = location;

    }    
    public void setEventDate(LocalDate date){
        this.eventDate = date;

    } 
    public void setEventTime(LocalTime time){
        this.eventTime = time;

    }
    public void setDuration(int duration){
        this.duration = duration;
    }
    public void setOranisers(String org){
        this.eventOrganisers = org;

    }    


    //Overriding toString
    @Override
    public String toString(){
        return eventName + "at" + eventLocation + "on" + eventDate;
    }

}
