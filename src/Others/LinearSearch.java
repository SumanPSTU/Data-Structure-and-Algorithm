package Others;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class LinearSearch {
    public static void main(String[] args) {
        int[] array = new int[15];
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);

        // Populate the array with random integers
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(300);
        }

        // Selection sort
        for (int i = 0; i < array.length - 1; i++) {
            int min = i;
            for (int j = i + 1; j < array.length; j++) {
                if (array[j] < array[min]) {
                    min = j;
                }
            }
            if (min != i) {
                int temp = array[min];
                array[min] = array[i];
                array[i] = temp;
            }
        }

        // Print the sorted array
        System.out.println("Sorted array:");
        System.out.println(Arrays.toString(array));

        // Get the element to search from the user
        System.out.println("Enter the element to search:");
        int element = scanner.nextInt();
        scanner.close();

        // Perform linear search
        int index = linearSearch(array, element);
        if (index == -1) {
            System.out.println("Element not found.");
        } else {
            System.out.println("Element found at index " + index + ".");
        }
    }

    public static int linearSearch(int[] array, int element) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == element) {
                return i;
            }
        }
        return -1; // Element not found
    }
}
