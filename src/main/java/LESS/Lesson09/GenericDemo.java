package LESS.Lesson09;

import HW.Lesson04.Abonent;

import java.util.List;

public class GenericDemo {
    public static void main (String[] args) {
        List<String> list;
        List<Integer> listInt;
        List<Abonent> listAb;

//        Object universal = "Hello";
//        universal = 1;
//        universal = new Abonent();
//        universal = "Ivam";
//        ((String) universal).toUpperCase();
//        System.out.println(universal);

        GenericPair<String,Integer> p = getPair();
        String val1 = p.getValue1();
        Integer val2 = p.getValue2();
        System.out.println(val1);
        System.out.println(val2);

        GenericPair<Integer,Integer> pair2 = new GenericPair<Integer, Integer>();
        pair2.setValue2(111);
        pair2.setValue1(222);

    }

    public static GenericPair<String, Integer> getPair(){
        GenericPair<String, Integer> pair = new GenericPair<String, Integer>();
        pair.setValue1("Helen");
        pair.setValue2(11);
        return pair;
    }
}
