package LESS.Lesson06;

public enum Gender {
    MALE,
    FEMALE;

    @Override
    public String toString () {
        if(this == MALE)
            return "мужской";
        else
            return "женский";
    }
}
