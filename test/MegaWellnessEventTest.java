import org.junit.Test;
import static org.junit.Assert.*;
import java.time.LocalDate;
import java.time.LocalTime;


public class MegaWellnessEventTest {
    @Test
    public void addActivity(){
        Event e = new Event(
            "Massage Session",           
            "Wellness",                  
            "To relieve stress during the semester",  
            "Ashesi Campus",              
            LocalDate.now(),              
            LocalTime.now(),              
            120,                         
            "SLE"                  
        );

        MegaWellnessActivityEvent megaevents = new MegaWellnessActivityEvent(e, true);

        megaevents.addActivity(new WellnessActivity("Spa", "Wellnes session", 10, "Greene Lounge", 20));
        megaevents.addGame(new Games("Pool", "Board game", 3, "Akorno", 15, "Hallmark Voucher"));

        assertEquals(1, megaevents.getActivities().size());
        assertEquals(1, megaevents.getGames().size());
    }
}