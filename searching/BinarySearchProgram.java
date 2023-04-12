package searching;

public class BinarySearchProgram {
    public static void main(String[] args) 
    {
        
        int arr[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 0 };
        int key = 3;
        boolean Result = BinarySearch(arr, key);
        if (Result) {
            System.out.println("Element Found");

        } else {
            System.out.println("Element Not found");
        }

    }

    public static boolean BinarySearch(int arr[], int key) {
        int start = 0;
        int end = arr.length - 1;
        int mid = start + (end - start) / 2;

        while (start <= end) {

            if (key < arr[mid]) {
                end = mid - 1;
            } else if (key > arr[mid]) {
                start = mid + 1;
            } else {
                start = mid + 1;
            }
        }
        return false;
    }
}
