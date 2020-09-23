package HW.Lesson06;

public enum DaysOfWeek {
    MONDAY,
    TUESDAY,
    WEDNESDAY,
    THURSDAY,
    FRIDAY,
    SATURDAY,
    SUNDAY;

    public void get2DaysForward(){
        System.out.println("Day after tomorrow is: " + values()[(this.ordinal()+2)%values().length]);
    }
    public void get2DaysAgo(){
        //System.out.println("Day after tomorrow is: " + values()[(this.ordinal()-2)%values().length]);
        int dayN = this.ordinal()-2;
        if(dayN < 0)
            System.out.println("Day before yesterday was: " + values()[dayN+7]);
        else System.out.println("Day before yesterday was: " +values()[dayN]);
    }
}
