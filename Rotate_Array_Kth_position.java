package ArrayQuestion;
import java.util.Arrays;

public class Rotate_Array_Kth_position {

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7};
        int k = 3; // Number of positions to rotate

        // Normalize k to avoid extra rotations
        k = k % arr.length;

        // Step 1: Reverse the entire array
        reverse(arr, 0, arr.length - 1);

        // Step 2: Reverse the first k elements
        reverse(arr, 0, k - 1);

        // Step 3: Reverse the remaining elements
        reverse(arr, k, arr.length - 1);

        // Output the result
        System.out.println("Rotated Array: " + Arrays.toString(arr));
    }

    // Helper function to reverse a portion of the array
    public static void reverse(int[] arr, int start, int end) {
        while (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }
}


