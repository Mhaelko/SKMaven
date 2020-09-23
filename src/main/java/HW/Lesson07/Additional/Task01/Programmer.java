package HW.Lesson07.Additional.Task01;
import LESS.Lesson07.Person;

public class Programmer extends Person implements QA{

    public Programmer(String name) {
        super(name);
    }
    @Override
    public void info () {
        super.info();
        System.out.println("I'm a programmer");
    }
    @Override
    public void coding() {
        System.out.println("I'm a QA");
    }
}
