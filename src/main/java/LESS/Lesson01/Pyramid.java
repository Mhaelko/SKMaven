package LESS.Lesson01;

public class Pyramid {
    public static void main(String[] args) {
        String star = "*";
        String res = "******";
        while(star.compareTo(res) != 1){
            System.out.println(star);
            star+="*";
        }
    }
}
