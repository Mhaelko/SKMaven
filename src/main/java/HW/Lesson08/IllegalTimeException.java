package HW.Lesson08;

public class IllegalTimeException extends IllegalDateException {
    private int hours;
    private int minutes;
    private int seconds;
    public IllegalTimeException (int day, int month, int year, int hours, int minutes, int seconds) {
        super(day,month,year);
        this.hours=hours;
        this.minutes=minutes;
        this.seconds=seconds;
    }

    public String getWrongTime () {
        return String.format("Wrong time: %02d.%02d.%02d",hours,minutes,seconds);
    }
}
