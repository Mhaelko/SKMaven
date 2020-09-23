package LESS.Lesson10;

import java.util.*;

public class ListDemo {
    public static void main(String[] args) {
        String[] maleNames = {"Архип", "Болеслав", "Марат", "Семён", "Юлиан", "Сергей", "Нифонт", "Максим", "Евгений", "Геннадий", "Володар", "Ждан", "Марк", "Григорий", "Леонид", "Олег"};
        List<String> namesList = new ArrayList<>(Arrays.asList(maleNames));
        namesList.remove(2);
       // namesList.sort(String::compareTo);
        namesList.sort((s1,s2) -> s1.compareTo(s2));
        System.out.println(namesList);
        ListIterator<String> iterator = namesList.listIterator();
//        while (iterator.hasNext()) {
//            String next = iterator.next();
//            if(next.charAt(0)=='С')
//                System.out.println(next);
//        }
        namesList.removeIf(el -> el.charAt(0) != 'С');
        System.out.println(namesList);
    }
}
