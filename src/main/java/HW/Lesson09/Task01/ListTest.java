package HW.Lesson09.Task01;

import java.util.*;

public class ListTest {
    public static void main(String[] args) {
        //-------a----------
        List<String> nameslist = new ArrayList<>(Arrays.asList("Peter", "helen", "Andry", "abdel", "Kate", "Veronica", "Leonid", "Alex", "max"));
        System.out.println(nameslist);
        //-------b----------
        nameslist.add("Philip");
        nameslist.add("Joseph");
        nameslist.add("Leon");
        System.out.println(nameslist);
        //-------c----------
        nameslist.remove("Veronica");
        nameslist.remove("Leonid");
        System.out.println(nameslist);
        //-------d----------
        ListIterator<String> iterator = nameslist.listIterator();
        while (iterator.hasNext()) {
            String next = iterator.next();
            if (next.equals("Helen")) {
                //Replace element
                iterator.set("Elizabet");
            }
        }
        System.out.println(nameslist);
        //-------e----------
        Collections.sort(nameslist);
        System.out.println(nameslist);
        //-------f----------
        nameslist.sort(Comparator.reverseOrder());
        System.out.println(nameslist);
        //-------g----------
        ListIterator<String> iterator2 = nameslist.listIterator();
        while (iterator2.hasNext()) {
            String next = iterator2.next();
            iterator2.set(next.substring(0,1).toUpperCase()+next.substring(1,next.length()));
        }
        System.out.println(nameslist);
        //-------h----------
        ListIterator<String> iterator3 = nameslist.listIterator();
        while (iterator3.hasNext()) {
            String next = iterator3.next();
            if(next.charAt(0)=='A')
                System.out.println(next);
        }
        //-------i----------
        if(nameslist.contains("Andry"))
        {
            System.out.println("Содержит");
        } else System.out.println("Не содержит");
        //-------j----------
        ListIterator<String> iterator4 = nameslist.listIterator();
        while (iterator4.hasNext()) {
            String next = iterator4.next();
            if(!next.equals("Kate") && !next.equals("Helen"))
                iterator4.remove();
        }
        System.out.println(nameslist);
    }



}
