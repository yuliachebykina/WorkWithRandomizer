package info.sjd.service;

import info.sjd.model.Numbers;
import java.util.ArrayList;
import java.util.List;

public class TransformService {

    public static List<Numbers> getNumbersFromText(String Numbers) {
        List<Numbers> numbersList = new ArrayList<>();

        String[] lines = Numbers.split("\n");

        for (String line : lines) {

            String[] words = line.split(" ");
            return new numbersList(words[0], words[1], words[2]);

        }
    }

}

                                        // Напишите где у меня тут ошибка




