package Others;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class BinarySearch {
    public static void main(String[] args) {
        int element;
        int[] arr = new int[15];
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(200);
        }
        for (int i = 0; i < arr.length-1; i++) {
            for (int j = 0; j < arr.length-i-1; j++) {
                if (arr[j]>arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
        System.out.println("Sorted array is");
        System.out.println(Arrays.toString(arr));
        System.out.println("Enter the element");
        element = scanner.nextInt();
        int index = binarySearch(arr,element);
        if (index==-1){
            System.out.println("Element not found");
        }else {
            System.out.println("Element found at index "+index);
        }
    }
    public static int binarySearch(int[] arr,int element){
        int left = 0;
        int mid;
        int right = arr.length-1;
        while (left<=right){
            mid = (left+right)/2;
            if (element==arr[mid]){
                return mid;
            }else if(element<arr[mid]){
                right = mid-1;
            }else {
                left = mid +1;
            }
        }
        return -1;
    }
}