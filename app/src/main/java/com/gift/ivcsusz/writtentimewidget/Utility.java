package com.gift.ivcsusz.writtentimewidget;

import com.gift.ivcsusz.writtentimewidget.NumberToStringConverter.NumberToHungarianWordConverter;

import java.text.Format;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Utility {
    static NumberToHungarianWordConverter converter = new NumberToHungarianWordConverter();
    static Format hoursFormatter = new SimpleDateFormat("hh");
    static Format minutesFormatter = new SimpleDateFormat("mm");


    public static String getCurrentTime(String timeformat){
        Format formatter = new SimpleDateFormat(timeformat);
        return formatter.format(new Date());
    }

    private static String getCurrentHoursInHungarian(){
        return converter.convert(Integer.parseInt(hoursFormatter.format(new Date())));
    }

    private static String getCurrentMinutesInHungarian(){
        return converter.convert(Integer.parseInt(minutesFormatter.format(new Date())));
    }

    public static String getCurrentTimeInHungarian(){
        StringBuilder builder = new StringBuilder(getCurrentHoursInHungarian());
        builder.append(" óra ").append(getCurrentMinutesInHungarian()).append(" perc.");
        return builder.toString();
    }
}
