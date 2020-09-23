package LESS.Lesson06;

import LESS.Lesson05.Date;
import LESS.Lesson05.DateTime;

public class PolyDemo {
    public static void main (String[] args) throws Exception {
        Date date = new Date(3,12,2000);
        DateTime dateTime = new DateTime(1,8,2020,1,1,1);
        Object date2 = new Date(23,11,2002);
       //DateTime date3 = new Date(3,12,2000);
        Date date4 = new DateTime();
        DateTime origin = (DateTime) date4;
       // ((DateTime)date4).setHour(5);
        origin.setHour(5);
        System.out.println(origin);
        //date2.getMonth();
        DateTime origin2 = null;
        if(date instanceof DateTime){
            origin2 = (DateTime)date;
            origin2.setHour(1);
        }

        System.out.println("*******************");
        Date[] arr = {date, dateTime};
        for (Date d: arr ) {
            System.out.println(d);
        }

        System.out.println("*******************");

        Object[] arr2 = {date, dateTime, "Hello world"};
        for (Object ob: arr2 ) {
            System.out.println(ob);
        }

    }
}
