package HW.Lesson06;

public class MainClass {
    public static void main(String[] args) {
        DaysOfWeek d = DaysOfWeek.MONDAY;
        d.get2DaysForward();
        d.get2DaysAgo();
        Seasons s = Seasons.WINTER;
        s.getNextSeason();
        s.getPreviousSeason();
        Months m = Months.JANUARY;
        m.getSeason();
        m.getPreviousMonth();
        m.getNextMonth();
        System.out.println(m);
    }
}
