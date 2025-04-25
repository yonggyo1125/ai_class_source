package exam05;

import java.time.LocalDate;

public class Ex06 {
    public static void main(String[] args) {
        LocalDate date1 = LocalDate.now();
        LocalDate date2 = LocalDate.now();
        System.out.println(date1 == date2);  // 동일성
        System.out.println(date1.equals(date2)); // 동등성
    }
}
