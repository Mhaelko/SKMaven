package LESS.Lesson05;

public class DateDemo {
    public static void main (String[] args) throws Exception {
        Date date = new Date(1,8,2020);
        Date date2 = new Date(11,12,1020);
        Date date3 = new Date(21,4,2000);
        Date [] dateArr = {date,date2,date3};
        System.out.println(date);
        DateTime dt = new DateTime(1,8,2020,1,1,1);
        System.out.println(dt);


        //assert date.toString().equals("02.08.2020");
        for (int i = 0; i<dateArr.length;i++ ){
            System.out.println(dateArr[i]);
        }
        /*for(Date d : dateArr){
            System.out.println(d);
        }*/

    }
}
