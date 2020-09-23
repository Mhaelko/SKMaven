package HW.Lesson07.Additional.Task01;
import LESS.Lesson07.Person;

public class Genius extends Person implements Fighter, QA, Dance{

    public Genius(String name) {
        super(name);
    }
    @Override
    public void info () {
        super.info();
        System.out.println("I'm a genius");
    }
    @Override
    public void dance() {
        System.out.println("I'm a genius dancer");
    }

    @Override
    public void fight() {
        System.out.println("I'm a genius boxer");
    }

    @Override
    public void coding() {
        System.out.println("I'm a genius programmer");
    }
}
