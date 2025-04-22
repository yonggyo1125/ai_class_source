package exam02;

public class Schedule2 {
    private int year;
    private int month;
    private int day;

    public Schedule2() {
        //year = 2024;
        this(2025, 4, 22);
    }

    public Schedule2(int year, int month, int day) {
        this.year = year;
        this.month = month;
        this.day = day;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getMonth() {

        return month;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        this.day = day;
    }

    public void showDate() {
        System.out.printf("year=%d, month=%d, day=%d%n", this.year, this.month, day);
    }

    public Schedule2 getThis() {
        //this.showDate();
        showDate();
        return this;
    }
}
