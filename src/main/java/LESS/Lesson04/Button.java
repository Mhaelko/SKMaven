package LESS.Lesson04;

public class Button {
    protected int width;
    protected String text;

    public void incWider(){
        width++;
    }
    public void setWidth(int width){
        if(width>0)
            this.width=width;
        else
            System.out.println("Wrong number");
    }

    public void setText (String text) {
        this.text = text;
    }

    public int getWidth () {
        return width;
    }

    public String getText () {
        return text;
    }
}
