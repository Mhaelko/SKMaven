package HW.Lesson04;

import java.text.ParseException;

public class CallClass {
    public static void main(String[] args) throws ParseException {
        Abonent ab1 = new Abonent("Саша","Иванов",32,'m');
        Abonent ab2 = new Abonent(2,"Саша","Иванова",30,'z');
        Abonent ab3 = new Abonent(1,"Саша","Иванова",30,'z');
        ab3.print();
       // ab2.setGender('v');
       // ab2.print();
        System.out.println(ab1.isEquals(ab1));
        System.out.println(ab1.isEquals(ab2));
        System.out.println(ab2.isEquals(ab3));
        System.out.println("*****************************************************");
        Date d = new Date();
        d.setDay(1);
        d.setMonth(1);
        d.setYear(2000);
        d.getFormattedDate();
        System.out.println("*****************************************************");
        System.out.println(d.validate(31,11,2100));
        System.out.println(d.differenceIdDays(1,1,2001));
    }
}
