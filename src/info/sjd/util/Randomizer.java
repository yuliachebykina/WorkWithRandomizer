package info.sjd.util;

import java.util.Random;

public class Randomizer {

    public static Integer getRandomInteger(int min, int max) {
        if (min >= max) {
            return null;
        }
        return min + new Random().nextInt(max - min);
    }
}
