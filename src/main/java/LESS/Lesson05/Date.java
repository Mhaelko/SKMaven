package LESS.Lesson05;

import HW.Lesson08.IllegalDateException;

public class Date {
    protected int day;
    protected int month;
    protected int year;

    public Date(){


    }
    public Date (int day, int month, int year) throws IllegalDateException {
        if(validate(day,month,year)) {
            this.day = day;
            this.month = month;
            this.year = year;
        }
        else
            throw new IllegalDateException(day,month,year);
    }
    public Date (Date date) {
        this.day = date.day;
        this.month = date.month;
        this.year = date.year;
    }


    public int getDay () {
        return day;
    }

    public int getMonth () {
        return month;
    }

    public int getYear () {
        return year;
    }
    public void print(){
        //логика
    }

    public String toString(){
        return String.format("%02d.%02d.%d",day,month,year);
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
            else if(month == 4 || month == 6 || month == 9 || month == 11)
                return false;
        return true;
    }
}
