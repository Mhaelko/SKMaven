package LESS.Lesson03;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class ArrHw {
    public static void main(String[] args) {
        System.out.println("Введите размерность массива: ");
        Scanner sc = new Scanner(System.in);
        int arrsize = sc.nextInt();
        int [] ar = createArr(arrsize);
        printArray(ar);
        flipArr(ar);
        System.out.println("*********************************");
        printArray(ar);
        sortArr(ar);
        System.out.println("*********************************");
        printArray(ar);
    }

    public static int[] createArr(int size){
        int[] arr = new int[size];
        Random random = new Random();
        for (int i = 0; i < size; i++) {
            arr [i] = random.nextInt(20);
        }
        return arr;
    }
    public static void printArray(int [] array){
            System.out.println(Arrays.toString(array));
    }
    public static int[] flipArr(int [] array){
        for (int i = 0, j=array.length-1; i < j; i++, j--) {
            int temp = array[i];
            array[i]=array[j];
            array[j]=temp;
        }
        return array;
    }
    public static int[] sortArr(int [] array){
        for (int i = 0; i<array.length; i++) {
            for (int j = i; j < array.length; j++) {
                if(array[i]>array[j]) {
                    int temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }
            }
        }
        return array;
    }
}
