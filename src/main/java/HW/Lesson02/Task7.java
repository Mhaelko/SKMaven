package HW.Lesson02;

public class Task7 {
    public static void main(String[] args) {
        int[] array = {3, 4, 9, 10, 34, 239, 8, 0, -3, 19, 17};
        int size = array.length;
        System.out.print("[");
        int i=0;
        /*----for---------------
        for (i = 0; i < size; i++) {*/
        while(i < size){
            System.out.print(array[i]);
            if (i<size-1)
                System.out.print(" ,");
            i++;
        }
        System.out.print("]");
    }
}
