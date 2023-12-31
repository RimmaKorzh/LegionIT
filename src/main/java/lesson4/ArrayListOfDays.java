package lesson4;

import java.util.ArrayList;

public class ArrayListOfDays {

    public String getDay(Integer dayNumber) {

        ArrayList<String> daysList = new ArrayList<String>();
        daysList.add("Sunday");
        daysList.add("Monday");
        daysList.add("Tuesday");
        daysList.add("Wednesday");
        daysList.add("Thursday");
        daysList.add("Friday");
        daysList.add("Saturday");

        if (dayNumber== null) {
            throw new NullPointerException();
        }

           if (dayNumber < 1) {
                return "the number should be equal or larger than 1";
            } else if (dayNumber > 7) {
                return "the number should be equal or smaller than 7";
            } else {
                return daysList.get(dayNumber - 1);
            }
        }

        }

