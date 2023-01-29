package Test;

import main.Game;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.assertNotEquals;

public class GameTest {
    private Game game;

    @Before
    public void setUp() {
        game = new Game(100,4);
    }

    @Test
    public void testPlay() {
        game.play();
        int winnerId = game.getWinnerId();
        assertNotEquals(-1, winnerId);
    }

    @Test
    public void testGetWinnerId() {
        game.play();
        int winnerId = game.getWinnerId();
        assertNotEquals(-1, winnerId);
    }


}
