package exam03;

import java.time.LocalDate;
import java.time.temporal.ChronoField;

public class Ex01 {
    public static void main(String[] args) {
        LocalDate today = LocalDate.now(); // 현재 날짜
        LocalDate date = LocalDate.of(2025, 4, 2);

        System.out.printf("today=%s, date=%s%n", today, date);

        //int year = today.get(ChronoField.YEAR);
        int year = today.getYear();
        //int month = today.get(ChronoField.MONTH_OF_YEAR);
        int month = today.getMonthValue();

        //int day = today.get(ChronoField.DAY_OF_MONTH);
        int day = today.getDayOfMonth();
        System.out.printf("year=%d, month=%d, day=%d%n", year, month, day);
    }
}
