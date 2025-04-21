package sortingAlgorithm;

import java.util.Arrays;

public class InsertionSort {
    public int[] insertionSort(int[] array){
        for (int i =1 ;i<array.length;i++){
            int val = array[i];
            int j = i-1;
            while (j>=0 && array[j]>val){
                array[j+1] = array[j];
                j = j-1;
            }
            array[j+1] = val;
        }
        return array;
    }
    public static void main(String[] args){
        int[] array = {1,3,4,6,3,2,7,1,9,1,4};
        System.out.println(Arrays.toString(new InsertionSort().insertionSort(array)));
    }
}
