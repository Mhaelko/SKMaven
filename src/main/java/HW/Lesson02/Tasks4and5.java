package HW.Lesson02;

import java.util.Scanner;

public class Tasks4and5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Выберите разрядность (2 или 3):");
        int r = sc.nextInt();
        if (r < 2 || r > 3) {
            System.out.println("Вы ввели некоректную разрядность");
        } else {
            int n;
            if (r == 2) {
                System.out.println("Введите двухзначное число:");
                n = sc.nextInt();
                if (n / 10 == 0 || n / 10 >= 10)
                    System.out.println("Число не двухзначное");
                else System.out.println(n / 10 + n % 10);
            }
            if (r == 3) {
                System.out.println("Введите трехзначное число:");
                n = sc.nextInt();
                if (n / 10 < 10 || n / 10 >= 100)
                    System.out.println("Число не трехзначное");
                else System.out.println(n / 100 + n % 100 / 10 + n % 10);
            }
        }
    }
}
