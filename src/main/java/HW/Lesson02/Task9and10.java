package HW.Lesson02;

import java.util.Scanner;

public class Task9and10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите размерность треугольника:");
        int size = sc.nextInt();
        System.out.println("Первый треугольник:");
        for (int i = 0; i < size; i++) {
            int j=0;
            while(j<=i) {
                System.out.print("*");
                j++;
            }
            System.out.println();
        }
        System.out.println("Второй треугольник:");
        for (int i = size; i >0; i--) {
            int j=0;
            while(j<=i-2) {
                System.out.print(" ");
                j++;
            }
            int k=size;
            while(k>=i) {
                System.out.print("*");
                k--;
            }
            System.out.println();
        }
    }
}
