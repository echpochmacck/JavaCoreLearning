package datesAPi;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class LocalDateTest {
//    public static void main(String[] args) {
//        LocalDate localDate = LocalDate.now();
//        System.out.println(localDate);
//        LocalDate specificDate = LocalDate.of(2017, 1, 10);
//        System.out.println(specificDate);
//
//
//        LocalTime localTime = LocalTime.now();
//        System.out.println(localTime);
//
//    }

    public static void main(String[] args) {
        LocalDate localDate = LocalDate.now();
        System.out.println("Стандарт "+localDate);

        System.out.println(localDate.format(DateTimeFormatter.ofPattern("d::MM:uuuu")));
        System.out.println(localDate.format(DateTimeFormatter.ISO_DATE));


    }
}
