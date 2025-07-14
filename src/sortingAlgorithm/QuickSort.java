package sortingAlgorithm;

import java.util.Arrays;

public class QuickSort {
    public static void quickSort(int[] array,int low,int heigh){
        if (low<heigh){
            int pivot = partition(array,low,heigh);
            quickSort(array,low,pivot-1);
            quickSort(array,pivot+1,heigh);
        }
    }
    public static int partition(int[] array,int low,int heigh){
        int i = low-1;
        int pivot = array[heigh];
        for (int j = low;j<heigh;j++){
            if (array[j]<pivot){
                i++;
                swap(array,i,j);
            }
        }
        swap(array,i+1,heigh);
        return i+1;
    }

    public static void swap(int[] array,int i,int j){
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }
    public static void main(String[] args) {
        int[] array = {2,3,5,4,3,5,3,6,8,5};
        quickSort(array,0,array.length-1);
        System.out.println(Arrays.toString(array));
    }
}