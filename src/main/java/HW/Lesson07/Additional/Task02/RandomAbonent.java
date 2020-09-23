package HW.Lesson07.Additional.Task02;

import HW.Lesson04.Abonent;

import java.util.Random;

public class RandomAbonent {
    public static void main(String[] args) {
        Random random = new Random();
        String[] maleSurnames = {"Смирнов", "Иванов", "Кузнецов", "Попов", "Соколов", "Лебедев", "Козлов", "Новиков", "Морозов", "Петров", "Волков", "Соловьёв", "Васильев", "Зайцев", "Павлов"};
        String[] maleNames = {"Архип", "Болеслав", "Марат", "Семён", "Юлиан", "Сергей", "Нифонт", "Максим", "Евгений", "Геннадий", "Володар", "Ждан", "Марк", "Григорий", "Леонид", "Олег"};
        String[] femaleSurnames = {"Ковалёва", "Ильина", "Гусева", "Титова", "Кузьмина", "Кудрявцева", "Баранова", "Куликова", "Алексеева", "Степанова", "Яковалева", "Сорокина", "Сергеева", "Романова", "Захарова", "Борисова"};
        String[] femaleNames = {"Виктория", "Дария", "Арина", "Зоя", "Лиза", "Мария", "Надя", "Раиса", "Тамара", "Октябрина", "Рая", "Роза", "Нелли", "Милана", "Любовь", "Леся", "Каролина", "Зинаида", "Карина", "Клавдия"};
        Abonent[] abonentsArray = new Abonent[100];
        char[] genderArr = {'m', 'f'};
        for (int i = 0; i < abonentsArray.length; i++) {
            char tmpC = genderArr[random.nextInt(genderArr.length)];
            if (tmpC == 'm')
                abonentsArray[i] = new Abonent(maleNames[random.nextInt(maleNames.length)], maleSurnames[random.nextInt(maleSurnames.length)], random.nextInt(87) + 4, tmpC);
            else
                abonentsArray[i] = new Abonent(femaleNames[random.nextInt(femaleNames.length)], femaleSurnames[random.nextInt(femaleSurnames.length)], random.nextInt(86) + 4, tmpC);
        }
        System.out.println(abonentsArray.length);
        //int maxAge = abonentsArray[0].getAge();
        for(Abonent a: abonentsArray) {
           // if(maxAge < a.getAge())
           //     maxAge = a.getAge();
            System.out.println(a);

        }
       // System.out.println(maxAge);
    }
}
