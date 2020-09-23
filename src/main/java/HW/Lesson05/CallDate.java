package HW.Lesson05;

import HW.Lesson06.DateFormat;
import HW.Lesson08.IllegalTimeException;

import java.text.ParseException;

public class CallDate {
    public static void main (String[] args) throws ParseException, IllegalTimeException {
        Date date = new Date(1,1,2020);
        System.out.println(date);
        date.print();
        date.print(DateFormat.CUSTOM);
        System.out.println("День недели: " + date.getDayOfWeek() + "  Номер недели: " + date.getWeekOfYear());
        DateTime dt = new DateTime(1,8,2020,1,1,1);
        System.out.println(dt);
        //assert date.toString().equals("02.08.2020");
    }
}
