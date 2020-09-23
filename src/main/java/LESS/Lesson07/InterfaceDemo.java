package LESS.Lesson07;

import LESS.Lesson06.Components.*;

public class InterfaceDemo {
    public static void main (String[] args) {
        Person person = new Person("Vasya");
        person.info();//не статический метод, для вызова нужен экземпляр класса
        Person.about();//статический метод, можно візвать не создавая экземпляр класса(объект)
        Profile p = new Person("Tanya");
        p.info();
        if(p instanceof Person)
            ((Person) p).description();
        Programmer programmer = new Programmer("Sasha");
        Boxer boxer = new Boxer("Borya");
        programmer.info();
        boxer.info();
        System.out.println("***************************");
        Profile[] persons = {
                new Person("Person1"),
                new Boxer("Box1"),
                new Programmer("Programmer1"),
                new Programmer("Programmer2"),
                new Boxer("Box2"),
                new Person("Person2"),
                new Person("Person3"),
                new Boxer("Box3")
        };
        for (Profile profile : persons) {
            profile.info();
            if (profile instanceof Programmer)
                ((Programmer) profile).coding();
            if (profile instanceof Boxer)
                ((Boxer) profile).boxing();
        }
        System.out.println("***********Only Boxers***************");
        for (Profile profile : persons) {
            if (profile instanceof Boxer)
                profile.info();

        }

    }
}
