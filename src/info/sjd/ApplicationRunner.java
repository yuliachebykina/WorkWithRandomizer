package info.sjd;

import info.sjd.model.Numbers;
import info.sjd.service.TransformService;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.logging.Logger;

public class ApplicationRunner {

    private static Logger logger = Logger.getLogger(ApplicationRunner.class.getName());

    public static void main(String[] args) {


        Long currentTime = new Date().getTime();
        logger.info("Start at " + new Date() + " it equals " + currentTime + " milliseconds");

        //Можем ли мы Randomizer.getRandomInteger(1, 100); тут писать в скобках?

        Numbers one = new Numbers(5,34, "1,1");


        List<Numbers> newnumbers = new ArrayList<>();

        newnumbers.add(one);

        String numbersASText = TransformService.getNumbersList(newnumbers);

        logger.info(numbersASText);

        //Есть ли легче способ выведения логов? Я смотрю мы должны cоздать ArrayList тут, брать всю инфу в TransformService.
    }
}
