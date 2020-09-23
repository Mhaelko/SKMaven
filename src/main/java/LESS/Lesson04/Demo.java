package LESS.Lesson04;

public class Demo {
    public static void main (String[] args) {
        Button btn = new Button();
        //System.out.println(btn);
        //btn.width=56;
        btn.setWidth(4);
        btn.incWider();
        btn.setText("Login");
        System.out.println(btn.getText());
        System.out.println(btn.getWidth());
    }
}
