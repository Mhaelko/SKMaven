package HW.Lesson07.Additional.Task01;
import LESS.Lesson07.Person;

public class Dancer extends Person implements Dance{

    public Dancer(String name) {
        super(name);
    }
    @Override
    public void info () {
        super.info();
        System.out.println("I'm a dancer");
    }
    @Override
    public void dance() {
        System.out.println("I'm a super dancer");
    }
}
