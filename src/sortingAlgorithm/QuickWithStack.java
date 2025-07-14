package sortingAlgorithm;

import java.util.Arrays;
import java.util.Stack;

public class QuickWithStack {
    public static void quickSort(int[] array){
        Stack<int[]> stack = new Stack<>();
        stack.push(new int[]{0,array.length-1});
        while (!stack.isEmpty()){
            int[] bound = stack.pop();
            int start = bound[0],end = bound[1];
            if (start>=end)continue;
            int pivotIndex = partition(array,start,end);
            stack.push(new int[]{start,pivotIndex-1});
            stack.push(new int[]{pivotIndex+1,end});
        }

    }
    public static int partition(int[] array,int low,int heigh){
        int i = low - 1;
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
        int item = array[i];
        array[i] = array[j];
        array[j] = item;
    }

    public static void main(String[] args) {
        int[] array = {2,3,5,2,3,9,3,22,5,4,0};
        quickSort(array);
        System.out.println(Arrays.toString(array));
    }

}
