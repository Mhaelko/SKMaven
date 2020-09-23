package LESS.Lesson08;

import HW.Lesson04.Abonent;
import LESS.Lesson05.Date;


public class ExceptionDemo {
    public static void main (String[] args) {
        Abonent abonent = new Abonent();
        abonent.setFirstName("Vasya");

        try {
            abonent.setAge(10);
            System.out.println("-----------------");
        } catch (Exception e) {
            System.out.println("Unknown exception: "+e.getMessage());
        } finally {
            System.out.println("Complete");
        }

        System.out.println(abonent);
        System.out.println("***************************************");
//        try {
//            Date date = new Date(29,02,2001);
//            System.out.println(date);
//        } catch (WrongDateException e) {
//            System.out.println(e.getWrongDate());;
//        }
    }
}
