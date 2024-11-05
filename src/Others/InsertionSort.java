package Others;

import java.util.Arrays;
import java.util.Random;
public class InsertionSort {
    public static int[] insertionSort(int[] arr){
        for (int i = 1; i < arr.length; i++) {
            int j = i-1;
            int current = arr[i];
            while (j>=0 && arr[j]>current){
                arr[j+1] = arr[j];
                j--;

            }
            arr[j+1] = current;
        }
        return arr;
    }
    public static void main(String[] args) {
        Random random = new Random();
        int[] array = new int[8];
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(100);
        }



    }


}
