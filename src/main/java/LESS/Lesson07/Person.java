package LESS.Lesson07;

public class Person implements Profile {
    private String name;

    public Person (String name) {
        this.name = name;
    }

    public void info(){
        System.out.println("I'm "+ name);
    }
    public void description(){
        System.out.println("Some text");
    }
    public static void about(){
        System.out.println("Static method: I'm person");
    }
}
