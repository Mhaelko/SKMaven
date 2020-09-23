package HW.Lesson03;

import java.util.Scanner;

public class Strings {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите строку: ");
        String inp = sc.nextLine();
        System.out.println("Исходная строка: " + inp);
       // countD(inp);
       // countED(inp);
        //getSubStr(inp);
        //delNumbers(inp);
        rotate(inp);
    }
    //Задача 1
    public static void countD (String str){
        int cnt = 0;
        for(String temp : str.split(" "))
            if(temp.startsWith("d")){
                System.out.println(temp);
                cnt++;
            }
        System.out.println(cnt);
    }
    //Задача 2
    public static void countED (String str){
        int cnt = 0;
        for(String temp : str.split(" "))
            if(temp.endsWith("ED")){
                System.out.println(temp);
                cnt++;
            }
        System.out.println(cnt);
    }
    //Задача 3
    public static void getSubStr (String str){
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите подстроку: ");
        String inp = sc.nextLine();
        System.out.println("Подстрока: " + inp);
        int cnt = 0;
        for (int i = 0; i <= str.length()-inp.length(); i++) {
            if(str.substring(i,i+inp.length()).contains(inp))
                cnt++;
        }
        System.out.println(cnt);
    }
    //Задача 4
    public static void delNumbers(String str) {
        String newstr=str;
        String numbers="";
        for (int i = 0; i < str.length(); i++) {
            for (int j = 0; j < 10; j++) {
                if (str.charAt(i) == Character.forDigit(j,10)) {
                    newstr = newstr.replace(str.charAt(i), (char) 0);
                    numbers=numbers.concat(String.valueOf(str.charAt(i)));
                }

            }

        }
        System.out.println("Строка без цифр: " + newstr);
        System.out.println("Удаленные цифры: " + numbers);

    }
    //Задача 5
    public static void rotate(String str){
        char tmp = (char) 0;
        String newstr=str;
        for (int i = 0, j = str.length()-1; i < j; i++,j--) {
                tmp = str.charAt(i);
                newstr = newstr.replace(str.charAt(i), str.charAt(j));
                str = newstr.replace(str.charAt(j), tmp);

        }
        System.out.println("Новая строка: " + newstr);
    }
}
