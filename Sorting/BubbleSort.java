package Sorting;

import java.lang.reflect.Array;
import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        int arr[] = { 3, 4, 5, 6, 1, 3, 2 };
        bubble(arr);

        System.out.println(Arrays.toString(arr));

    }

    static void bubble(int arr[]) {
        boolean swapped;

        // run the step n-1 times
        for (int i = 0; i < arr.length; i++) {
            swapped = false;
            // for the each step last element come to the last respective element
            for (int j = 1; j < arr.length - i; j++) {
                // swap if the item is samller then the previus one
                if (arr[j] < arr[j - 1]) {
                    // swap
                    int temp = arr[j];
                    arr[j] = arr[j - 1];
                    arr[j - 1] = temp;
                    swapped = true;
                }
            }

            // if you do not swap the perticuler value of i it means the array is sorted
            // hence stop the loop
            if (!swapped) {
                break;
            }
        }
    }

}
