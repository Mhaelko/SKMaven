package LESS.Lesson03;

import java.util.Arrays;

public class ArraysL {
    public static void main(String[] args) {
        int[] arr = {2,56,21,-76,3,0};
        int min=arr[0], max = arr[0], summ=arr[0];
        for (int i = 1; i < arr.length; i++) {
            //System.out.println(arr[i]);
            if(arr[i]>=max){
                max = arr[i];
            }
            if(arr[i]<=min)
                min = arr[i];
            summ+=arr[i];
        }
        //System.out.println("Max: "+max + " Min: " + min+ " Summ: " + summ);

        //вложенные массивы
        int [][] array2D = {
                {5,8, 3},
                {6, -11, 11},
                {1,100,25,36,50},
                {0,7}
        };
        //System.out.println(array2D[2][3]);
        //System.out.println(Arrays.deepToString(array2D));
        //-----------------
        int max2d = array2D[0][0];
        int min2d = array2D[0][0];
        int summ2d = 0;
        for (int i = 0; i < array2D.length; i++) {
            //System.out.println(Arrays.toString(array2D[i]));
            for (int j = 0; j < array2D[i].length; j++) {
                //System.out.println(array2D[i][j]);
                if(array2D[i][j]>=max2d){
                    max2d = array2D[i][j];
                }
                if(array2D[i][j]<=min2d)
                    min2d = array2D[i][j];
                summ2d+=array2D[i][j];
            }
        }
        System.out.println(max2d + " "+ min2d + " " + summ2d);
    }
}
