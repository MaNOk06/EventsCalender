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

        assertEquals("Counselling", w.getActivityName());
        assertEquals("Wellness", w.getActivityType());
        assertEquals(15, w.getSessionDuration());
        // Fixed check: input was "Writing center" (lowercase c), test expected "Writing Center" (uppercase C) or vice versa.
        // Based on input in Constructor, it should be "Writing center".
        // Based on your original file, the Test expected "Writing Center" but input was "Writing center". 
        // I have corrected the test expectation to match the input provided in the test itself.
        assertEquals("Writing center", w.getLocation()); 
        assertEquals(20, w.getAvailableSlots());
    }
}