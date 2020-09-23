package LESS.Lesson07;

public class AnonymousDemo {
    public static void main (String[] args) {
        Profile musician = new Profile(){
            @Override
            public void info () {
                System.out.println("I'm musician");
            }
        };
        musician.info();

        Profile footballer = () -> System.out.println("I'm footballer");
        footballer.info();
    }
}
