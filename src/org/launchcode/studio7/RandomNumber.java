package org.launchcode.studio7;

import java.util.Random;

public class RandomNumber {
    public static double getRandom(){
        Random rand = new Random();
        int upperbound = 200;
        double doubleRandom = rand.nextDouble(upperbound);
        return doubleRandom;
    }

}
