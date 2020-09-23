package LESS.Lesson07;

public class Programmer extends Person {
    public Programmer (String name) {
        super(name);
    }

    @Override
    public void info () {
        super.info();
        System.out.println("I'm a programmer");
    }
    public void coding(){
        System.out.println("I can create programms");
    }
}
