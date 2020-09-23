package LESS.Lesson05;

//import package LESS.Lesson04;

import LESS.Lesson04.Button;

public class CheckBox extends Button {
    private boolean isChecked;
    public CheckBox (){
        isChecked=true;
        text = "some text";
        width=11;
    }

    public boolean isChecked () {
        return isChecked;
    }
}
