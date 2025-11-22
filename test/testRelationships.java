import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;
import java.time.LocalTime;

public class testRelationships {
    @Test
    public void testrelationships() {
        Games game = new Games("Chess", "Board Game", 2, "Library", 30, "Gift Card");

        assertTrue(game instanceof infoEvent);
        assertTrue(game instanceof timelinesEvent);

        Event event = new Event(
            "Chess Tournament",
            "Competitive",
            "A tournament for chess enthusiasts",
            "Library",
            LocalDate.of(2024, 7, 15),
            LocalTime.of(14, 0),
            120,
            "Chess Club"
        );

        assertTrue(event instanceof infoEvent);
        assertTrue(event instanceof timelinesEvent);

        WellnessActivity wellnessActivity = new WellnessActivity(
            "Yoga Session",
            "Fitness",
            60,
            "Community Center",
            20
        );

        assertTrue(wellnessActivity instanceof infoEvent);
    }

    
}
