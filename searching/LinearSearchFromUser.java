package searching;

import java.util.Scanner;

public class LinearSearchFromUser {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Array size: ");
        int size = sc.nextInt();

        int[] arr = new int[size];

        for (int i = 0; i <= size; i++) {
            arr[i] = sc.nextInt();

        }
        System.out.println("Enter key ..");
        int key = sc.nextInt();

        System.out.println("Enter array Elements");

        boolean isFound = LinearSearch(arr, key);

        if (isFound) {
            System.out.println("key found");
        } else {
            System.out.println("key Not found");
        }

    }

    public static boolean LinearSearch(int arr[], int key) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == key) {
                return true;
            }

        }

        return false;
    }

}
