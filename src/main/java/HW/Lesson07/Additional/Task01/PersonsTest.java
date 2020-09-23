package HW.Lesson07.Additional.Task01;
import LESS.Lesson07.Person;
import java.util.Random;

public class PersonsTest {
    public static void main(String[] args) {
        Person[] arrayRandom = new Person[1000];
        Random random = new Random();
        Person[] elements = {
                new Boxer("Boris"),
                new Dancer("Denis"),
                new Genius("Gosha"),
                new Programmer("Petya")
        };
        for (int i = 0; i < arrayRandom.length; i++) {
            arrayRandom[i] = elements[random.nextInt(4)];
        }
        int cntBoxers=0, cntDancers = 0, cntGeniuses = 0, cntProgrammers = 0;
        for (Person p: arrayRandom){
            if(p instanceof Boxer)
                cntBoxers++;
            if(p instanceof Dancer)
                cntDancers++;
            if(p instanceof Genius)
                cntGeniuses++;
            if(p instanceof Programmer)
                cntProgrammers++;
        }
        System.out.println("Количество Boxers: "+cntBoxers + " Количество Dancers: "+ cntDancers + " Количество Geniuses: " + cntGeniuses + " Количество Programmers: "+ cntProgrammers);
    }
}
