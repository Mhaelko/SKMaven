package HW.Lesson06;

public enum Months {
    JANUARY("Январь",31),
    FEBRUARY("Февраль",28),
    MARCH("Март",31),
    APRIL("Апрель",30),
    MAY("Май",31),
    JUNE("Июнь",30),
    JULY("Июль",31),
    AUGUST("Август",31),
    SEPTEMBER("Сентябрь",30),
    OCTOBER("Октябрь",31),
    NOVEMBER("Ноябрь",30),
    DECEMBER("Декабрь",31);

    private String mName;
    private int num;

    Months (String mName, int num) {
        this.mName=mName;
        this.num = num;
    }
    public  String getmName(){
        return mName;
    }
    public void getSeason(){
        if (this.ordinal()>=2 && this.ordinal()<=4)
            System.out.println("Current season is: " + Seasons.SPRING);
        if (this.ordinal()>=5 && this.ordinal()<=7)
            System.out.println("Current season is: " + Seasons.SUMMER);
        if (this.ordinal()>=8 && this.ordinal()<=10)
            System.out.println("Current season is: " + Seasons.AUTUMN);
        if (this.ordinal()==0 || this.ordinal()==1 || this.ordinal()==11)
            System.out.println("Current season is: " + Seasons.WINTER);

    }
    public void getPreviousMonth(){
        int mnthN = this.ordinal()-1;
        if(mnthN < 0)
            System.out.println("Last month was: " + values()[mnthN+12].name());
        else System.out.println("Last month was: " +values()[mnthN].name());
    }
    public void getNextMonth(){
        int mnthN = this.ordinal()+1;
        if(mnthN == 12)
            System.out.println("Next month is: " + values()[mnthN-12].name());
        else System.out.println("Next month is: " +values()[mnthN].name());
    }

    @Override
    public String toString () {
        return "Месяц: "+ mName + " Количество дней: " + num;
    }
}
