package LESS.Lesson10;

import HW.Lesson04.Abonent;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapDemo {
    public static void main(String[] args) {
        Abonent abonent1 = new Abonent();
        abonent1.setId(123);
        abonent1.setFirstName("Вася");

        Abonent abonent2 = new Abonent();
        abonent2.setId(4);
        abonent2.setFirstName("Петя");

        Abonent abonent3 = new Abonent();
        abonent3.setId(41);
        abonent3.setFirstName("Толя");

        Abonent abonent4 = new Abonent();
        abonent4.setId(114);
        abonent4.setFirstName("Игорь");

        Map<Integer,Abonent> abonents = new HashMap<>();
        abonents.put((int) abonent1.getId(),abonent1);
        abonents.put((int) abonent2.getId(),abonent2);
        abonents.put((int) abonent3.getId(),abonent3);
        abonents.put((int) abonent4.getId(),abonent4);
        System.out.println(abonents.get(4));
        System.out.println(abonents.get(123));
        System.out.println(abonents.get(1));
        System.out.println(abonents.size());

        Set<Integer> keys = abonents.keySet();
        Collection<Abonent> abonentsMap = abonents.values();
        for(Integer key : keys)
        {
            System.out.println(key);
            Abonent ab = abonents.get(key);
            System.out.println(ab.getFirstName());
        }
    }
}
