package HW.Lesson05;

import HW.Lesson06.DateFormat;
import HW.Lesson07.ClearTime;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.temporal.WeekFields;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Locale;
import java.util.Objects;

public class Date {
    protected int day;
    protected int month;
    protected int year;

    public Date(){
        this.day = 1;
        this.month = 1;
        this.year = 1970;
    }
    public Date (int day, int month, int year) {
        this.day = day;
        this.month = month;
        this.year = year;
    }
    public Date (Date date) {
        this.day = date.day;
        this.month = date.month;
        this.year = date.year;
    }

    //ClearTime ct = d ->

    public int getDay () {
        return day;
    }

    public int getMonth () {
        return month;
    }

    public int getYear () {
        return year;
    }

    public String toString(){
        return String.format("%02d/%02d/%d",day,month,year);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Date date = (Date) o;
        return day == date.day &&
                month == date.month &&
                year == date.year;
    }

    @Override
    public int hashCode() {
        return Objects.hash(day, month, year);
    }

   public void print(){
       System.out.println(String.format("%02d/%02d/%d",day,month,year));
   }

   public void print(DateFormat format) throws ParseException {
        SimpleDateFormat f = new SimpleDateFormat(format.getDateFormat());
        java.util.Date date = new GregorianCalendar(year,month-1,day).getTime();
        System.out.println(f.format(date));
   }
    public String getDayOfWeek(){
        LocalDate dt = LocalDate.parse(String.format("%d-%02d-%02d",year,month,day));
        return dt.getDayOfWeek().toString();
    }
    public int getWeekOfYear(){
        Locale l = new Locale("ru");
        LocalDate date = LocalDate.of(this.year,this.month,this.day);
        return date.get(WeekFields.of(l).weekOfYear());

    };
}
