package ru.dudeandrey;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class DateTime {
    public String getDateTime() {
        DateFormat dateFormat = new SimpleDateFormat("dd.MM.yyyy HH:mm:ss");
        Calendar cal = Calendar.getInstance();
        //System.out.println(dateFormat.format(cal.getTime()));   // 23.03.2022 15:13:40
        String datetime = dateFormat.format(cal.getTime());
        return datetime;
    }
}
