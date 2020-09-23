package HW.Lesson08;

import HW.Lesson04.Abonent;
import LESS.Lesson05.Date;
import HW.Lesson05.DateTime;
import LESS.Lesson08.WrongDateException;

public class TestExceptions {
    public static void main (String[] args) {
        try {
            Date date = new Date(29,02,2001);
            System.out.println(date);
        } catch (IllegalDateException e) {
            System.out.println(e.getWrongDate());;
        }
        try {
            DateTime dateTime = new DateTime(29,02,2001,61,0,0);
            System.out.println(dateTime);
        } catch (IllegalTimeException e) {
            System.out.println(e.getWrongTime());;
        }
    }
}
