package java8.dateTimeApi;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.Month;

public class LocalDateTimeSample {

    public static void main(String[] args) {

        java.time.LocalDateTime currentTime = java.time.LocalDateTime.now();
        System.out.println("Current DateTime: " + currentTime);

        LocalDate date1 = currentTime.toLocalDate();
        System.out.println("date1: " + date1);

        Month month = currentTime.getMonth();
        int day = currentTime.getDayOfMonth();
        int seconds = currentTime.getSecond();

        System.out.println("Month: " + month + " Day: " + day + " Seconds: " + seconds);

        java.time.LocalDateTime date2 = currentTime.withDayOfMonth(10).withYear(2012);
        System.out.println("date2: " + date2);

        // 10 july 2011
        LocalDate date3 = LocalDate.of(2011, Month.JULY, 10);
        System.out.println("10 july 2011 : " + date3 );

        // 20 hour 32 minutes
        LocalTime date4 = LocalTime.of(20, 32);
        System.out.println("20 hour 32 minutes: " + date4);

        // parse a string
        LocalTime date5 = LocalTime.parse("10:25:37");
        System.out.println("Parsed string: " + date5);

    }

}
