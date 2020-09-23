package LESS.Lesson09;

import HW.Lesson04.Abonent;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ListDemo {
    public static void main (String[] args) {
        List<Integer>list = new ArrayList<>();
        list.add(222);
        list.add(3333);
        list.add(-1);
        list.add(43);
        list.add(0,100);
        System.out.println(list.size());
        System.out.println(list.get(0));
        Collections.sort(list);
        //Comparator<Integer> sortRule = new ComparatorImpl();
        Comparator<Integer> sortRule = new Comparator<>(){
            @Override
            public int compare (Integer o1, Integer o2) {
                if(o1 == o2)
                    return 0;
                if(o1 < o2)
                    return 1;
                return -1;
            }
        };
        Comparator<Integer> sortRuleLambda = (o1,o2)->{
            if(o1 == o2)
                return 0;
            if(o1 < o2)
                return 1;
            return -1;
        };
        list.sort(sortRuleLambda);
        list.sort(Comparator.reverseOrder());
        System.out.println(list);

       // list.sort();

        List<String> listStr = new ArrayList<>();
        listStr.add("Hello");
        listStr.add("Ivan");
        listStr.add("Solo");
        listStr.add("Deloo");
        listStr.add("Hell");
        Collections.sort(listStr);
        System.out.println(listStr);

        Abonent abonent1 = new Abonent();
        abonent1.setFirstName("Ivan");
        abonent1.setAge(23);
        abonent1.setGender('m');

        Abonent abonent2 = new Abonent();
        abonent2.setFirstName("Kolya");
        abonent2.setAge(18);
        abonent2.setGender('m');

        Abonent abonent3 = new Abonent();
        abonent3.setFirstName("Helen");
        abonent3.setAge(18);
        abonent3.setGender('f');

        List<Abonent> abonents = new ArrayList<>();
        abonents.add(abonent1);
        abonents.add(abonent2);
        abonents.add(abonent3);

//        Collections.sort(abonents);
        abonents.sort((a1, a2) -> {
                if (a1.getAge() == a2.getAge())
                    return a1.getFirstName().compareTo(a2.getFirstName());

                if (a1.getAge() < a2.getAge())
                    return 1;

                return -1;
            } );
           // return a2.getFirstName().compareTo(a1.getFirstName());
//            if (a1.getFirstName().equals(a2.getFirstName()))
//                return 0;
//
//            if (a1.getFirstName().compareTo(a2.getFirstName())>0)
//                return 1;
//
//            return -1;
        //} );

        //abonents.sort(Comparator.comparingInt(Abonent::getAge));
        System.out.println(abonents);
    }
}
