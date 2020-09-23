package LESS.Lesson06.Components;

import java.util.Random;

public class ComponentsExecute {
    public static void main (String[] args) {
        Component[] array = {
                new Button(),
                new CheckBox(),
                new Label(),
                new RoundButton(),
                new Button(),
                new CheckBox(),
                new Label(),
                new RoundButton()
        };
        Component [] testElements = {
                new Button(),
                new Label(),
                new CheckBox(),
                new RoundButton()
        };

        Component [] arrayRandom = new Component[100];
        Random random = new Random();
        //random.nextInt(3);
        //Генерация случайного типа 2
        for (int j = 0; j < arrayRandom.length; j++) {
            arrayRandom[j] = testElements[random.nextInt(4)];
        }
        //Генерация случайного типа длинная
        int cntBtn=0, cntLbl=0, cntChb=0, cntRB=0;
        for (int i = 0; i < arrayRandom.length; i++) {
            int j = random.nextInt(4);
            if(j==0) {
                arrayRandom[i] = new Button();
                cntBtn++;
            }
            if(j==1) {
                arrayRandom[i] = new Label();
                cntLbl++;
            }
            if(j==2) {
                arrayRandom[i] = new CheckBox();
                cntChb++;
            }
            if (j==3){
                arrayRandom[i] = new RoundButton();
                cntRB++;
            }
        }
        for (Component component : arrayRandom) {
            component.draw();
            component.draw3D();
        }
        System.out.println("Количество Button: "+cntBtn + " Количество Label: "+ cntLbl + " Количество CheckBox: " + cntChb + " Количество RoundButton: "+ cntRB);
        System.out.println("*****************");
        for (Component component : arrayRandom) {
            if(component instanceof Button)
                component.draw();
        }
    }
}
