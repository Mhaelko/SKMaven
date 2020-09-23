package HW.Lesson07;

import HW.Lesson05.DateTime;
import HW.Lesson08.IllegalTimeException;

public class LambdaCall {
    public static void main(String[] args) throws IllegalTimeException {
        //Задача 1
        СheckNum cn;
        cn = num -> {if(num>=10 && num<=20) return true; else return false;};
        boolean res = cn.check(19);
        System.out.println(res);
        System.out.println("************************");
        //Задача 2
        Fact fact;
        fact = f -> {
            int r = 1;
            for (int i = 1; i <= f; i++) {
                r*=i;
            }
            return r;
        };
        int factorial = fact.factorial(1);
        System.out.println(factorial);
        System.out.println("************************");
        //Задача 3
        StrL strL;
        strL = str -> str.toUpperCase();
        System.out.println(strL.toUp("привет"));
        System.out.println("************************");
        //Задача 4
        PrintTr pr;
        pr = trimStr -> {
            System.out.println(trimStr.replace(" ",""));
        };
        pr.prTr("Helen Abdel Leon abc array var jMeter Selenium Yaguar");
        System.out.println("************************");
        //Задача 5
        ClearTime clt;
        clt = d -> {d.setHour(0);d.setMinute(0);d.setSecond(0);return d;};
        DateTime dt = new DateTime(1,11,2020,15,23,22);
        System.out.println(clt.clearT(dt));

    }
}
