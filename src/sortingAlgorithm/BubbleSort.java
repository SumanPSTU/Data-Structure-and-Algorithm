package sortingAlgorithm;

import java.util.Arrays;

public class BubbleSort {
    public int[] bubbleSort(int[] array){
        for (int i =0;i<array.length;i++){
            for (int j = i+1; j <array.length ; j++) {
                if (array[i]>array[j]){
                    int temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }
            }
        }
        return array;
    }
    public static void main(String[] args){
        int[] array = {1,3,4,6,3,2,7,1,9,1,4};
        BubbleSort bubbleSort = new BubbleSort();
        System.out.println(Arrays.toString(bubbleSort.bubbleSort(array)));
    }
}