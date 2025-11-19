import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import java.time.LocalDate;
import java.time.LocalTime;

public class EventTest {
    @Test
    public void testEvents(){
        Event e = new Event(
            "Massage Session", 
            "Wellness", 
            "To relieve stress during the semester", 
            "Ashesi Campus", 
            LocalDate.now(), 
            LocalTime.now(), 
            140, 
            "SLE"
            );

        MegaWellnessActivityEvent event = new MegaWellnessActivityEvent(e, true);

        assertEquals("Massage Session", event.getEventDetails().getEventName());
        assertEquals("Wellness", event.getEventDetails().getEventType());
        assertEquals("To relieve stress during the semester", event.getEventDetails().getEventDescription());
        assertEquals("Ashesi Campus", event.getEventDetails().getEventLocation());
        assertEquals(140, event.getEventDetails().getDuration());

        assertEquals("SLE", event.getEventDetails().getOrganisers());
    }
}