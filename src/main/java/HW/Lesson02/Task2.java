package HW.Lesson02;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        System.out.print("Введите вес на Земле: ");
        Scanner sc = new Scanner(System.in);
        double weight = sc.nextDouble();
        System.out.println("Масса на Земле: " + weight + " кг");
        System.out.println("Вес на Земле : " + weight*9.8 + " Н");
        System.out.println("Масса на Луне: " + weight*0.17+ " кг");
        System.out.println("Вес на Луне : " + weight*1.6 + " Н");
    }
}
