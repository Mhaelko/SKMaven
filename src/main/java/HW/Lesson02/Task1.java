package HW.Lesson02;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        //------------------1 часть----------------------------
        if (a>=b && a>=c)
                System.out.println("Максимальное число = " + a);
        else if(b>=c) {
            System.out.println("Максимальное число = " + b);
            //System.out.println("Минимальное число = " + c);
        }
        else {
            System.out.println("Максимальное число = " + c);
        }
        //------------------2 часть----------------------------
        if (a<=b && a<=c)
            System.out.println("Минимальное число = " + a);
        else if(b<=c) {
            System.out.println("Минимальное число = " + b);
        }
        else {
            System.out.println("Минимальное число = " + c);
        }
        //------------------3 часть----------------------------
        System.out.println("Среднее значение = " + (a+b+c)/3);
    }
}
