package Others;

import java.util.Arrays;
import java.util.Random;

public class SelectionSort {
    public static int[] selectionSort(int[] arr){
        for (int i = 0; i < arr.length-1; i++) {
            int min =i;
            for (int j = i+1; j <arr.length ; j++) {
                if (arr[min]>arr[j]){
                    min = j;
                }
            }
            if (min!=i){
                int temp = arr[min];
                arr[min] = arr[i];
                arr[i] = temp;
            }
        }
        return arr;
    }
    public static void main(String[] args) {
        Random random = new Random();
        int[] array = new int[10];
        for (int i=0;i<array.length;i++){
            array[i] = random.nextInt(100);
        }
        System.out.println(Arrays.toString(array));
        System.out.println(Arrays.toString(selectionSort(array)));
    }
}