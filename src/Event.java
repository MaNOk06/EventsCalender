import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;

public class Event implements infoEvent, timelinesEvent {
    // Attributes
    private String eventName;
    private String eventType;
    private String eventDescription;
    private String eventLocation;
    private LocalDate eventDate;
    private LocalTime eventTime;
    private String eventOrganisers;
    private int duration; // In minutes

    // Internal inner class to handle timeline data locally
    private class Activity {
        String name;
        LocalTime start;
        int duration;
        LocalTime end;

        Activity(String name, LocalTime start, int duration, LocalTime end) {
            this.name = name;
            this.start = start;
            this.duration = duration;
            this.end = end;
        }

        @Override
        public String toString() {
            return start + " - " + end + ": " + name + duration + " mins.";
        }
    }

    // List to store timeline of the event
    private List<Activity> timeline;

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
        this.timeline = new ArrayList<>();
    }

    // Interface Implementation: timelinesEvent 
    @Override
    public void addActivity(String activity, LocalTime startTime, int duration, LocalTime endTime){
        timeline.add(new Activity(activity, startTime, duration, endTime));
    }

    @Override
    public String getTimeline(){
        StringBuilder sb = new StringBuilder();
        for (Activity a : timeline){
            sb.append(a.toString() + "\n");
        }
        return sb.toString();
    }

    // Interface Implementation: infoEvent
    @Override public String getEventName() { return eventName; }
    @Override public String getEventType() { return eventType; }   
    @Override public String getEventDescription() { return eventDescription; }
    @Override public String getEventLocation() { return eventLocation; }
    @Override public String getOrganisers() { return eventOrganisers; }

    // Class Specific Methods and Getters/Setters
    public void displayEventDetails(){
        System.out.println();
        System.out.println("Event: " + eventName);
        System.out.println("Event Type: " + eventType);
        System.out.println("Description: " + eventDescription);
        System.out.println("Location of event: " + eventLocation);
        System.out.println(" Date: " + eventDate);
        System.out.println("Time: " + eventTime);
        System.out.println("Duration of event: " + duration + " minutes.");
        System.out.println(" Organised by: " + eventOrganisers);
    }

    public void updateEventDetails(){
        System.out.println("Event details updated for " + eventName);
    }

    public LocalDate getEventDate(){ return eventDate; }
    public LocalTime getEventTime(){ return eventTime; }
    public int getDuration(){ return duration; }

    public void setEventName(String name){ this.eventName = name; }
    public void setEventType(String type){ this.eventType = type; }    
    public void setEventDescription(String description){ this.eventDescription = description; }
    public void setEventLocation(String location){ this.eventLocation = location; }    
    public void setEventDate(LocalDate date){ this.eventDate = date; } 
    public void setEventTime(LocalTime time){ this.eventTime = time; }
    public void setDuration(int duration){ this.duration = duration; }
    public void setOranisers(String org){ this.eventOrganisers = org; }

    @Override
    public String toString(){
        return eventName + " at " + eventLocation + " on " + eventDate;
    }
}