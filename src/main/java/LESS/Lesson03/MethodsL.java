package LESS.Lesson03;

public class MethodsL {
    public static void main(String[] args) {
        int[] array = {2,56,21,-76,3,0};
        printArray(array);
        System.out.println("Min: " + findMin(array));
        System.out.println("Max: " + findMax(array));
    }
    public static void printArray(int [] array){
        for (int i = 0; i < array.length; i++)
            System.out.println(array[i]);
    }
    public static int findMin(int [] array){
        int min=array[0];
        for (int i = 1; i < array.length; i++) {
            if(array[i]<=min)
                min = array[i];
        }
        return min;
    }
    public static int findMax(int [] array){
        int max=array[0];
        for (int i = 1; i < array.length; i++) {
            if(array[i]>max)
                max = array[i];
        }
        return max;
    }
}
