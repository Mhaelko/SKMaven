package HW.Lesson06;

import java.text.SimpleDateFormat;

public enum DateFormat {
    RU("dd.MM.yyyy"),
    USA("MM-dd-yyyy"),
    ENG("dd-MM-yyyy"),
    UK("dd/MM/yyyy"),
    CUSTOM("dd MMMM yyyy");

    private String dateF;

    DateFormat (String dateF) {
        this.dateF = dateF;
    }
    public  String getDateFormat(){
        return dateF;
    }
   // public  String getDateFormat(){
    //    return dateF;
    //}
}
