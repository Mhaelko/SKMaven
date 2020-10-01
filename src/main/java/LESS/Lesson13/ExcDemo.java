package LESS.Lesson13;

import java.util.*;

public class ExcDemo {
    public static void main (String[] args) {
        List<String> names1 = new ArrayList<>(Arrays.asList("name1", "name2", "name3"));
        List<String> names2 = new ArrayList<>(Arrays.asList("name2", "name3", "name1"));
        System.out.println(names1.equals(names2));//плохо

        //1 способ - сортировка и сравнение
//        Collections.sort(names1);
//        Collections.sort(names2);
//        System.out.println(names1.equals(names2));

        names1.sort((s1,s2) -> s1.compareTo(s2));
        names2.sort((s1,s2) -> s1.compareTo(s2));
        System.out.println(names1.equals(names2));

        //2 способ (только без дубликатов)
        System.out.println(names1.containsAll(names2) && names2.containsAll(names1));

        //3 способ (только без дубликатов)
        System.out.println(new HashSet<>(names1).equals(new HashSet<>(names2)));

        //String str = 1;

    }
}
