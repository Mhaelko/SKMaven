package HW.Lesson02;

import java.util.Scanner;

public class Task6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите натуральное число: ");
        int n = sc.nextInt();
        System.out.println("Исходное число = " + n);
        //int length = String.valueOf(n).length();
        //System.out.println("Разрядность = "+length);
        int r=0, sum=0;
        while (n!=0) {
            /*-----работает правильно------
            sum += n/Math.pow(10, length-1);
            n %= Math.pow(10, length-1);
            length--;
            */
            sum +=n%10;
            n /= 10;
            r++;
        }
        System.out.println("Разрядность = "+r);
        System.out.println("Сумма = " + sum);
    }
}
