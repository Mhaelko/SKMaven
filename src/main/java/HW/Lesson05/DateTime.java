package HW.Lesson05;

import HW.Lesson08.IllegalDateException;
import HW.Lesson08.IllegalTimeException;

public class DateTime extends Date {
    private int hour;
    private int minute;
    private int second;

    public DateTime (int day, int month, int year, int hour, int minute, int second) throws IllegalTimeException {
        super.day = day;
        super.month = month;
        super.year = year;
        if((hour>=0 && hour<60) && (minute>=0 && minute<60) && (second>=0 && second<60)){
            this.hour = hour;
            this.minute = minute;
            this.second = second;
        }
        else
            throw new IllegalTimeException(day,month,year,hour,minute,second);
    }

    public int getHour() {
        return hour;
    }

    public void setHour(int hour) {
        this.hour = hour;
    }

    public int getMinute() {
        return minute;
    }

    public void setMinute(int minute) {
        this.minute = minute;
    }

    public int getSecond() {
        return second;
    }

    public void setSecond(int second) {
        this.second = second;
    }

    public String toString(){
        return String.format("%02d.%02d.%d %02d:%02d:%02d", day, month, year, hour, minute, second);
    }

}
