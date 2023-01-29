package main;

import java.util.Random;

public class Terning {
    private final int side = 6;
    private Random random;

    public Terning(int side) {
        this.random = new Random();
    }

    public int trillTerning(){
        return random.nextInt(side) + 1;
    }
}
