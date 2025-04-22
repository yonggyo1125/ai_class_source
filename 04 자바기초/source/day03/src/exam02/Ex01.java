package exam02;

public class Ex01 {
    public static void main(String[] args) {
        Schedule s1 = new Schedule();
        //s1.year = 2025;
        //s1.month = 2;
        //s1.day = 31; // 통제 불가
        s1.setYear(2025);
        s1.setMonth(2);
        s1.setDay(31);
        System.out.println(s1.getMonth()); // 월만 조회
        s1.showDate();
    }
}
