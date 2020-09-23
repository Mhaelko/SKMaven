package HW.Lesson09.Task02;

import java.util.*;

public class IntList {
    public static void main(String[] args) {
        List<Integer> intlist = new ArrayList<>();
        Random random = new Random();
        Scanner sc = new Scanner(System.in);
        System.out.println("Задайте размер массива");
        int arrsize = sc.nextInt();
        for (int i = 0; i < arrsize; i++) {
            intlist.add(random.nextInt(5)+1);
        }
        System.out.println(intlist);
        int min = intlist.get(0);
        int max = intlist.get(0);
        int summ = intlist.get(0);
        int maxcounter = intlist.size();
        int tmpcounter = 1;
        int repnum = intlist.get(0);
        for (int i = 1; i < intlist.size(); i++) {
            if(min>intlist.get(i))
                min = intlist.get(i);
            if(max<intlist.get(i))
                max = intlist.get(i);
            summ += intlist.get(i);
        }
        System.out.println("Минимум: " + min + " Максимум: " + max + " Сумма: " + summ);
        //--------------------ПОКа не работает------------------
        for (int i = 0; i < intlist.size()-1; i++) {
            for (int j = i + 1; j < intlist.size(); j++) {
                if (intlist.get(i).equals(intlist.get(j))) {
                    tmpcounter++;
                    intlist.remove(j);
                    j++;
                }
            }
            if (tmpcounter == maxcounter) {
                if (repnum > intlist.get(i)) {
                    repnum = intlist.get(i);
                    tmpcounter = 1;
                }
            }
            if (tmpcounter > maxcounter) {
                    repnum = intlist.get(i);
                    maxcounter = tmpcounter;
                    tmpcounter = 1;
            }

        }
        System.out.println("Максимальное количество повторений: "+maxcounter + " у числа: " + repnum);

    }
}
