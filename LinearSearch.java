
public class LinearSearch {
    
    public static void main(String[] args) {
        int[] array = {15, 8, 24, 36, 2, 12, 9, 30, 4, 27, 14, 1, 21, 18, 33, 7, 29, 5, 10, 19};

        
        // Element to search for
        int target = 18;
        
        // Perform linear search
        int Result = LinearSearch(array, target);
        if(Result != -1) {
            System.out.println("Element found at index (Linear Search): " + Result);
        } else {
            System.out.println("Element not found (Linear Search).");
        }
        
    }
    // Linear Search
    public static int LinearSearch(int[] arr, int target) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                return i;
            }
        }
        return -1;
    }

}
