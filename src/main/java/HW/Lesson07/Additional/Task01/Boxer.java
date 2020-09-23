package HW.Lesson07.Additional.Task01;
import LESS.Lesson07.Person;

public class Boxer extends Person implements Fighter{

    public Boxer (String name) {
        super(name);
    }
    @Override
    public void info () {
        super.info();
        System.out.println("I'm a boxer");
    }
    @Override
    public void fight() {
        System.out.println("I'm a fighter");
    }
}
