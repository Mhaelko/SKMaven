package HW.Lesson10.Task1;

import HW.Lesson05.Date;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class DateList {
    public static void main(String[] args) {
        Random rand = new Random();
        List<Date> dateList = new ArrayList<>();
        for (int i = 0; i < rand.nextInt(200)+100; i++) {
            dateList.add(i, new Date(rand.nextInt(29)+1, rand.nextInt(11)+1, rand.nextInt(200)+1900));
        }
        System.out.println("---------------------Task 1------------------");
        dateList.sort(DateList::sortDates);
        System.out.println(dateList);
        System.out.println("---------------------Task 2------------------");
        dateList.stream()
                .filter(m -> m.getMonth() == 1 || m.getMonth() == 2 || m.getMonth() == 3)
                .forEach(System.out::println);
        System.out.println("---------------------Task 3------------------");
        dateList.stream()
                .sorted(DateList::sortDates)
                .forEach(System.out::println);
    }

    private static int sortDates (Date d1, Date d2){
        if(d1.getYear()== d2.getYear()){
            if(d1.getMonth() == d2.getMonth())
            {
                if(d2.getDay() > d1.getDay())
                    return -1;
            }
            if(d2.getMonth() > d1.getMonth())
                return -1;
        }
        if(d1.getYear() > d2.getYear())
            return -1;
        else return 1;
    }
}
