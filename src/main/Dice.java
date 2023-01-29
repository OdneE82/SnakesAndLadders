package main;

import java.util.Random;

/**
 * A class to represent a dice
 *
 * @author odne
 * @since 1.0
 */

public class Dice {
    /**
     * The number of sides in the dice
     */
    private final int sides = 6;

    /**
     * The random number generator for rolling the dice
     */
    private Random random;

    /**
     * Constructs a Dice with the specified number of sides
     *
     * @param sides The number of sides for the dice
     */

    public Dice(int sides) {
        this.random = new Random();
    }

    /**
     * Rolls the dice and returns the result.
     *
     * @return A random integer between 1 and the number of sides in the dice
     */

    public int rollDice(){
        return random.nextInt(sides) + 1;
    }
}
