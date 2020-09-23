package HW.Lesson02;

import java.util.Scanner;

public class Task11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите размерность ромба:");
        int size = sc.nextInt();
        int temp =size-1;
        for (int i = 1; i <= size; i++) {
            //Рисуем пробелы
            for (int p = size-i; p >0 ; p--) {
                System.out.print(" ");
            }
            //рисуем цифры до заданной размерности
            for (int j = 1; j <= i; j++) {
                System.out.print(j);
            }
            //рисуем цифры после заданной последовательности
            for (int q= i-1; q >= 1; q--) {
                System.out.print(q);
            }
            System.out.println();
        }
        for (int k = size-1; k > 0; k--) {
            //Рисуем пробелы
            for (int p = size-k; p >0 ; p--) {
                System.out.print(" ");
            }
            for (int l = 1; l <= k; l++) {
                System.out.print(l);
            }
            for (int m= k-1; m >= 1; m--) {
                System.out.print(m);
            }
            System.out.println();
        }

    }
}
