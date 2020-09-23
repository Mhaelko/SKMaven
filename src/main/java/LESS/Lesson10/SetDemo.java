package LESS.Lesson10;

import java.util.*;

public class SetDemo {
    public static void main(String[] args) {
        String[] maleNames = {"Архип", "Болеслав", "Марат", "Семён", "Марат", "Семён", "Юлиан", "Сергей", "Нифонт", "Максим", "Евгений", "Геннадий", "Володар", "Ждан", "Марк", "Григорий", "Леонид", "Олег"};
        List<String> namesList = new ArrayList<>(Arrays.asList(maleNames));
        Collections.sort(namesList);
        Set<String> nameSet = new HashSet<>(namesList);
//        nameSet.add("Вася");
//        nameSet.add("Болеслав");
//        nameSet.add("Семён");
        System.out.println(nameSet);
    }
}
