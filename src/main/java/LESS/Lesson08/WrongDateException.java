package LESS.Lesson08;

public class WrongDateException extends Exception {
    private int day;
    private int month;
    private int year;
    public WrongDateException (int day, int month, int year) {
        this.day=day;
        this.month=month;
        this.year=year;
    }

    public String getWrongDate () {
        return String.format("Wrong date: %02d.%02d.%d",day,month,year);
    }
}
