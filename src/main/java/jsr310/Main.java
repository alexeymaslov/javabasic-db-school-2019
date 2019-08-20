package jsr310;

import java.sql.Date;
import java.time.LocalDate;
import java.time.ZoneId;
import java.time.format.TextStyle;
import java.time.temporal.ChronoUnit;
import java.util.Locale;

/**
 * @author Evgeny Borisov
 */
public class Main {
    public static void main(String[] args) {
        LocalDate now = LocalDate.now();
//        LocalDate.of()
        LocalDate date = now.minusYears(2);
        long between = ChronoUnit.DAYS.between(date, now);
        System.out.println("between = " + between);
        java.util.Date date2 = Date.from(date.atStartOfDay().atZone(ZoneId.systemDefault()).toInstant());
        System.out.println("date2 = " + date2);
        Date date1 = Date.valueOf(date);
        System.out.println("date1 = " + date1);
        System.out.println(now.getDayOfWeek().getDisplayName(TextStyle.SHORT, Locale.JAPAN));
        System.out.println(now.getDayOfWeek().getDisplayName(TextStyle.FULL, Locale.JAPAN));
        System.out.println(now.getDayOfWeek().getDisplayName(TextStyle.FULL, Locale.ENGLISH));
    }
}
