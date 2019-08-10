package info.sjd.service;

import info.sjd.model.Numbers;
import info.sjd.util.Randomizer;
import java.util.List;

public class TransformService {

    // Тут ошибка, объясните как правильно нужно написать и можно ли этот код убрать

    public static String getNumbersList(List<Numbers> newnumbers) {
        String numbersList = "";
        for (Numbers numbers: newnumbers) {
            numbersList += numbers.toString();
        }
        return numbersList;
    }

    // Почему мы тут пишем (Numbers numbers)? Не понимаю

    public static Numbers getNumbers(Numbers numbers){

        // Думаю система тут ругается потому что перевести нужно Long и string в integer.

        Long newtimeMilliseconds = Randomizer.getRandomInteger(1, 100);
        Integer newSessionID = Randomizer.getRandomInteger(1, 100);
        String newclientIP = Randomizer.getRandomInteger(1, 100);

        return new Numbers(numbers.getTimeMilliseconds() + numbers.getSessionID() + numbers.getClientIP()+ newtimeMilliseconds+ newSessionID + newclientIP;
    }
}

