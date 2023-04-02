package searching;

public class LinearSearchCode {
    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, 4, 5 };

        boolean isFound = LinearSearch(arr, 0);

        if (isFound) {
            System.out.println("key found");

        } else {
            System.out.println("key not found");
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
