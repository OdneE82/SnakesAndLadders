package Test;

import main.Player;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PlayerTest {

    @Test
    public void testGetPlayerName() {
        Player player = new Player("Player 1", 1);
        assertEquals("Player 1", player.getPlayerName());
    }

    @Test
    public void testGetPlayerId() {
        Player player = new Player("Player 1", 1);
        assertEquals(1, player.getPlayerId());
    }

    @Test
    public void testToString() {
        Player player = new Player("Player 1", 1);
        assertEquals("Player name: Player 1 | Player ID: 1", player.toString());
    }
}
