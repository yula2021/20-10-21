package org.itstep;


import java.text.SimpleDateFormat;
import java.time.DateTimeException;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.TimeZone;

public class Dates {
    public static void main(String[] args) {
        LocalDate date = LocalDate.now();
        System.out.println(date);
        LocalTime time = LocalTime.now();
        System.out.println(time);
        LocalDateTime dateTime = LocalDateTime.now();
        System.out.println(dateTime);
        DateTimeFormatter dateTimeFormatter =
                DateTimeFormatter.ofPattern("dd:MM:yy HH:mm");
        String sDateTime = dateTimeFormatter.format(dateTime);
        System.out.println("After formatting: " + sDateTime);

        Calendar calendar = new GregorianCalendar();
        System.out.println(calendar);

        Date dateNow = new Date();
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd/MM/yyy");
        String sDate = simpleDateFormat.format(dateNow);

        calendar.add(Calendar.MONTH,1);
        System.out.println();
        Date date2 = calendar.getTime();
        sDate = simpleDateFormat.format(date2);
        System.out.println(sDate);

        calendar = new GregorianCalendar(2020,Calendar.DECEMBER,31);
        Date specDate= calendar.getTime();
        sDate = simpleDateFormat.format(specDate);
        System.out.println(sDate);

        TimeZone timeZone = TimeZone.getDefault();
        int rawOffset = timeZone.getRawOffset();
        System.out.println("TimeZone : " + timeZone.getID() + " ("
                + timeZone.getDisplayName() + ")\n");

    }
}
