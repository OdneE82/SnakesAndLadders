package Test;

import main.Dice;
import org.junit.Test;
import static org.junit.Assert.assertTrue;

public class DiceTest {

    @Test
    public void rollDice() {
        Dice terning = new Dice(6);
        for(int i = 0; i < 100; i++) {
            int trill = terning.rollDice();
            assertTrue(trill >= 1 && trill <= 6);
        }
    }
}
