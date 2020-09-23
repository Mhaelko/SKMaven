package LESS.Lesson02;

import java.util.Scanner;

public class CheckAge {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int origin = sc.nextInt();
       /* if(age<=0)
            System.out.println("Error");
        else if (age <= 18)
            System.out.println("Несовершеннолетний");
        else if (age <= 89)
            System.out.println("Взрослый");
        else
            System.out.println("Долгожитель");*/
       int d1 = origin/100;
        System.out.println(d1);

        int d2 = origin%100/10;
        System.out.println(d2);
        int d3 = origin%10;
        System.out.println(d3);

    }
}
