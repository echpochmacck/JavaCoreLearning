package datesAPi.practice;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

public class practice {
    public static void main(String[] args) {
        LocalDate birthday = LocalDate.of(2006, 6, 22);
        LocalDate birthday2 = LocalDate.of(2012, 11, 16);
        System.out.println(birthday.format(DateTimeFormatter.ofPattern("dd-MM-yyyy")));
        System.out.println(ChronoUnit.DAYS.between(birthday, birthday2));
        System.out.println(ChronoUnit.YEARS.between(birthday, birthday2));
        System.out.println(ChronoUnit.HOURS.between(birthday, birthday2));
    }
}
