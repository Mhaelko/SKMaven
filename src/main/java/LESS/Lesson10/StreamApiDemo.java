package LESS.Lesson10;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class StreamApiDemo {
    public static void main(String[] args) {
        String[] maleNames = {"Архип", "Болеслав", "Марат", "Семён", "Юлиан", "Сергей", "Нифонт", "Максим", "Евгений", "Геннадий", "Володар", "Ждан", "Марк", "Григорий", "Леонид", "Олег"};
        List<String> namesList = new ArrayList<>(Arrays.asList(maleNames));
        System.out.println(namesList);
        namesList.stream()
                .filter(s -> s.charAt(0) == 'С')
                .forEach(System.out::println);
        //иссключить дубликаты
        System.out.println("**************");
        namesList.stream()
                .distinct()
                .sorted(Comparator.reverseOrder())
                .forEach(System.out::println);

        String[] numbers = {"1", "3", "4", "Вася"};
        int summ = 0;
        summ = Arrays.stream(numbers)
                .filter(StreamApiDemo::isNumber)
                .mapToInt(Integer::parseInt)
                .sum();
        System.out.println(summ);


    }
    private static boolean isNumber (String str){
        for (int i = 0; i < str.length(); i++) {
            if(!Character.isDigit(str.charAt(i)))
                return false;

        }
        return true;
    }
}
