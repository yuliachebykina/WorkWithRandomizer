package info.sjd.util;

import java.util.Date;
import java.util.Random;

public class Randomizer {

    // Randomizer for timeMilliseconds

    public static Long getRandomLong(int minTime, int newTime) {
        if (minTime >= newTime) {
            return null;
        }
        return new Date().getTime() - (minTime - newTime);
    }

    // Randomizer for sessionID

    public static Integer getRandomInteger(int min, int max) {
        if (min >= max) {
            return null;
        }
        return min + new Random().nextInt(max - min);
    }

    // Randomizer for clientIP

    public static String getRandomString(int min, int max) {
        if (min >= max) {
            return null;
        }
        new Random();
    }

}
