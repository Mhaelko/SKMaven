package LESS.Lesson05;

public class DateTime extends Date {
    private int hour;
    private int minute;
    private int second;

    public DateTime () {

    }

    public DateTime (int day, int month, int year, int hour, int minute, int second) {
        super.day = day;
        super.month = month;
        super.year = year;
        this.hour = hour;
        this.minute = minute;
        this.second = second;
    }

    public void setHour (int hour) {
        this.hour = hour;
    }

    public void setMinute (int minute) {
        this.minute = minute;
    }

    public void setSecond (int second) {
        this.second = second;
    }

    public String toString(){
        return String.format("%02d.%02d.%d %02d:%02d:%02d", day, month, year, hour, minute, second);
    }

}
