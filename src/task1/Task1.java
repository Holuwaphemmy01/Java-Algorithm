package task1;

import java.util.Arrays;

public class Task1 {

    public String getDateAndEvent(String dateAndEvent) {
        String []date = dateAndEvent.split(" ");
        System.out.println(Arrays.toString(date));
        String []eventDate = date[0].split("-");
        System.out.println(Arrays.toString(eventDate));
        int day = Integer.parseInt(eventDate[0]);
        int month = Integer.parseInt(eventDate[1]);
        int year = Integer.parseInt(eventDate[2]);
        if(year < 1990) return "invalid year";
        if(month < 1 || month > 12) return "invalid month";
        if(day < 1 || day > 31) return "invalid day";
        int finalYear = year -1900;
        int finalMonth = month -1;
        int finalDay = day -1;
        return finalDay +"days, " + finalMonth+"months, " + finalYear+"years, " +date[1];

    }

    public static void main(String[] args) {
        Task1 task1 = new Task1();
        System.out.println(task1.getDateAndEvent("41-12-2022 Christmas"));
    }
}
