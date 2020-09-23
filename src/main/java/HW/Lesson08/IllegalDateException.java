package HW.Lesson08;

public class IllegalDateException extends Exception {
    private int day;
    private int month;
    private int year;
    public IllegalDateException (int day, int month, int year) {
        this.day=day;
        this.month=month;
        this.year=year;
    }

    public String getWrongDate () {
        return String.format("Wrong date: %02d.%02d.%d",day,month,year);
    }
}
