package HW.Lesson04;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.util.Locale;
import java.util.concurrent.TimeUnit;

public class Date {
    private int day;
    private int month;
    private int year;

    public Date (int day, int month, int year) {
        this.day = day;
        this.month = month;
        this.year = year;
    }

    public Date () {

    }

    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        if(validate(day,1,1900)==true)
            this.day = day;
        else System.out.println("Ошибка добавления дня");
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        if(validate(1,month,1900)==true)
            this.month = month;
        else System.out.println("Ошибка добавления месяца");
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        if(validate(1,1,year)==true)
            this.year = year;
        else System.out.println("Ошибка добавления года");
    }

    public void getFormattedDate() throws ParseException {
        SimpleDateFormat format = new SimpleDateFormat("dd.MM.yyyy");
        java.util.Date pDate = format.parse(this.day+"."+this.month+"."+this.year);
        System.out.println(format.format(pDate));
    }
    public boolean validate(int day, int month, int year)
    {
        //проверка высокосного года
        int yearType;//0 - обычный, 1 - высокосный
        if(year%4 != 0)
            yearType = 0;
        else
            if(year%100 == 0)
                if(year%400 == 0)
                    yearType = 1;
                else yearType = 0;
            else yearType = 1;
        if (month < 1 || month > 12)
            return false;
        if (year < 1900 || year>2100)
            return false;
        if(day == 29 && month == 2 && yearType == 0)
            return false;
        if(day<1)
            return false;
        if (day>30)
            if(day > 31)
                return false;
            else if(month == 4 && month == 6 && month == 9 && month == 11)
                return false;
        return true;
    }

    public long differenceIdDays (int day, int month, int year) throws ParseException {
        SimpleDateFormat format = new SimpleDateFormat("dd.MM.yyyy");
        java.util.Date inDate = format.parse(day+"."+month+"."+year);
        java.util.Date compDate = format.parse(this.day+"."+this.month+"."+this.year);
        long days = TimeUnit.DAYS.convert(inDate.getTime()-compDate.getTime(),TimeUnit.MILLISECONDS);
        return days;
    }
}
