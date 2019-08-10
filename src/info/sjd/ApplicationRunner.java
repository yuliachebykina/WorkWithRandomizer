package info.sjd;

import info.sjd.model.Numbers;
import info.sjd.service.TransformService;
import info.sjd.util.Randomizer;

import java.util.ArrayList;
import java.util.List;
import java.util.logging.Logger;

public class ApplicationRunner {

    private static Logger logger = Logger.getLogger(ApplicationRunner.class.getName());

    public static void main(String[] args) {

        List<Numbers> numbersList = new ArrayList<>();
        for (int i=0; i < 10; i++) {
            newString = Randomizer.getRandomLong(30, 20) + Randomizer.getRandomInteger(0, 10) + Randomizer.getRandomString();
        }

        numbersList.add(newString);

        String numbersASText = TransformService.getNumbersFromText(numbersList);

        logger.info(numbersASText);

    }
}

//Есть ли легче способ выведения логов? Я смотрю мы должны cоздать ArrayList тут, брать всю инфу в TransformService.
//Было бы замечательно если эту домашнюю мы разобрали бы в классе и вы подробненько объяснили почему так нужно делать, а не по другому.
