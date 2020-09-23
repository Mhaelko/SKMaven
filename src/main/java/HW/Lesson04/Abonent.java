package HW.Lesson04;

public class Abonent {
    private long id=-1; // необязательное поле, по умолчанию -1
    private String firstName;
    private String lastName;
    private int age;
    private char gender; // 'm' - male, 'f' - female
    private int errstate = 0;

    public Abonent(String firstName, String lastName, int age, char gender) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        checkGender(gender);
    }

    public Abonent(long id, String firstName, String lastName, int age, char gender) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        checkGender(gender);
    }

    public Abonent() {

    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
           checkGender(gender);
    }

    public void print(){
        if(errstate != 1) {
            System.out.println("Идентификатор абонента: " + id);
            System.out.println("Имя абонента: " + firstName);
            System.out.println("Фамилия абонента: " + lastName);
            System.out.println("Возраст абонента: " + age);
            if (gender == 'm')
                System.out.println("Пол абонента: мужской");
            else
                System.out.println("Пол абонента: женский");
        }
        else
            System.out.println("Введены некорректный входные данные!");
    }
    public boolean isEquals(Abonent abonent){   //не проверяем id
        if(abonent.firstName.equals(this.firstName) && abonent.lastName.equals(this.lastName) && abonent.age==this.age && abonent.gender== this.gender )
            return true;
        else
            return false;
    }
    private void checkGender(char g){
        if(g=='m' || g == 'f'){
            this.gender = g;
            errstate=0;
        }
        else {
            System.out.println("Введено некорректное значение пола для абонента с id: "+this.id+". Введите 'm' - мужской, 'f' - женский");
            errstate = 1;
        }
    }

    @Override
    public String toString () {
        return "Abonent{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", age=" + age +
                ", gender=" + gender +
                '}';
    }
}
