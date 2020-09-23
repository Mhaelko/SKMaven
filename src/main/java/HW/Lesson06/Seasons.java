package HW.Lesson06;

public enum Seasons {
    WINTER,
    SPRING,
    SUMMER,
    AUTUMN;

    public void getNextSeason(){
        System.out.println("Next season is: " + values()[this.ordinal()+1]);
    }
    public void getPreviousSeason(){
        int seasN = this.ordinal()-1;
        if(seasN < 0)
            System.out.println("Day before yesterday was: " + values()[seasN+4]);
        else System.out.println("Day before yesterday was: " +values()[seasN]);
    }
}
