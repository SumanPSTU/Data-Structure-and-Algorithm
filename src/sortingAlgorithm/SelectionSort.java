package sortingAlgorithm;



import java.util.Arrays;

public class SelectionSort {
    public int[] secectionSort(int[] array){
        //selection sort start over here
        for (int i = 0;i<array.length-1;i++){
            int min = i;
            for (int j = i+1;j<array.length;j++){
                if (array[i]>array[j]){
                    min = j;
                }
            }
            if (min!=i){
                int temp = array[i];
                array[i] = array[min];
                array[min] = temp;
            }
        }

        return array;
    }
    public static void main(String[] args){
        int[] array = {1,3,4,6,3,2,7,1,9,1,4};

        //test the program

        SelectionSort selectionSort = new SelectionSort();
        System.out.println(Arrays.toString(selectionSort.secectionSort(array)));


    }
}
