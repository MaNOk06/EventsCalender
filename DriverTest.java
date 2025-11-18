import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;

public class DriverTest {
    public static void main(String[] agrs){

        // A MegawellnessEvent
        Event megawellnessEvent = new Event(
            "Mega Wellness day",
            "Wellness",
            "An event with games and wellness sessions",
            "Ashesi campus",
            LocalDate.of(2025, 3, 14),
            LocalTime.of(10,0),
            360,
            "SLE"
        );

        MegaWellnessActivityEvent megaEvent = new MegaWellnessActivityEvent(megawellnessEvent, true);

        // Adding wellness activities
        WellnessActivity massage = new WellnessActivity("Massage session", "Massage", 30, "Greene Lougue", 25);

        megaEvent.addActivity(massage);

        // Adding Games
        Games foosball = new Games("Foosball", "Table Game", 4, "Akorno", 20, "Voucher");

        megaEvent.addGame(foosball);

        megaEvent.displayMegaWellnessDetails();

        // Add events to list
        ArrayList<MegaWellnessActivityEvent> events= new ArrayList<>();
        events.add(megaEvent);

        for (MegaWellnessActivityEvent e: events){
            e.displayMegaWellnessDetails();
        }
    }
    
}