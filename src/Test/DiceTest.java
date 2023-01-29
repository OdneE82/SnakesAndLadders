package Test;

import main.Dice;
import org.junit.Test;
import static org.junit.Assert.assertTrue;

/**
 * Test klasse som tester terningens funksjonalitet. om et trill hadde gitt et tall utenfor det terningen skal vise (1-6) vil testen feile.
 */

public class TerningTest {

    @Test
    public void testTrill() {
        Dice terning = new Dice(6);
        for(int i = 0; i < 100; i++) {
            int trill = terning.trillTerning();
            assertTrue(trill >= 1 && trill <= 6);
        }
    }
}
