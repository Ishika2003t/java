import java.util.Arrays;

public class BinarySearch {
    public static void main(String[] args) {
        int[] array = {15, 8, 24, 36, 2, 12, 9, 30, 4, 27, 14, 1, 21, 18, 33, 7, 29, 5, 10, 19};
        
        // Sort the array for binary search
        Arrays.sort(array);
        System.out.println("Sorted Array: " + Arrays.toString(array));
        
        int target = 18;
        
        int result = binarySearch(array, target);
        if(result != -1) {
            System.out.println("Element found at index (Binary Search): " + result);
        } else {
            System.out.println("Element not found (Binary Search).");
        }
    }

    public static int binarySearch(int[] arr, int target) {
        int left = 0, right = arr.length - 1;
        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (arr[mid] == target) {
                return mid;
            }

            if (arr[mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return -1;
    }
}
