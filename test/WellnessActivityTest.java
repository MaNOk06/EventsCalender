import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class WellnessActivityTest {
    @Test
    public void testwellnessevent(){
        WellnessActivity w = new WellnessActivity(
            "Counselling",
            "Wellness",
            15,
            "Writing center",
            20
        );

        assertEquals("Couselling", w.getActivityName());
        assertEquals("Wellness", w.getActivityType());
        assertEquals(15, w.getSessionDuration());
        assertEquals("Writing Center", w.getLocation());
        assertEquals(20, w.getAvailableSlots());
    }
    
}