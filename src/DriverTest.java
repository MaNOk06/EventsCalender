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

        Event mentalWellnessEvent = new Event(
            "Mental Wellness Talk",
            "Educational",
            "Take care of your mental health",
            "Hive Banquet Hall",
            LocalDate.of(2025, 5, 20),
            LocalTime.of(9, 0),
            240,
            "SLE"
        );

        MegaWellnessActivityEvent mentalEvent = new MegaWellnessActivityEvent(mentalWellnessEvent, true);

        mentalEvent.addActivity(new WellnessActivity("Mental wellness chart", "Mental", 240, "Hive Banquet Hall", 150));
        mentalEvent.addGame(new Games("Riddles", "Puzzle", 4, "Hive Banquet Hall", 15, "Snacks"));


        events.add(mentalEvent);
        for (MegaWellnessActivityEvent e: events){
            e.displayMegaWellnessDetails();
        }
    }
}