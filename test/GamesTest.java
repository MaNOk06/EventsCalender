import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class GamesTest {
    @Test
    public void testGames(){
        Games g = new Games("Foosball", "Table Game", 4, "Akorno",  20, "Hallmark Voucher");

        assertEquals("Foosball", g.getGameName());
        assertEquals("Table Game", g.getGameType());
        assertEquals(4, g.getMaxPlayers());
        assertEquals("Akorno", g.getLocation());
        assertEquals(20, g.getDuration());
        assertEquals("Hallmark Voucher", g.getPrize());
    }
    
}