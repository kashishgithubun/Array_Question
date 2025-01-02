package ArrayQuestion;

import java.util.Arrays;

public class DeleteElement {
    public static void main(String[] args) {
        int[] arr = {10, 20, 30, 40, 50};
        int indexToDelete = 2; // Specify the index to delete (e.g., index 2)

        System.out.println("Original Array: " + Arrays.toString(arr));

        // Check if the index is valid
        if (indexToDelete < 0 || indexToDelete >= arr.length) {
            System.out.println("Invalid index. Unable to delete.");
        } else {
            arr = deleteElement(arr, indexToDelete);
            System.out.println("Array after deletion: " + Arrays.toString(arr));
        }
    }

    public static int[] deleteElement(int[] arr, int index) {
        // Create a new array with one less element
        int[] newArray = new int[arr.length - 1];

        // Copy elements, skipping the specified index
        for (int i = 0, j = 0; i < arr.length; i++) {
            if (i != index) {
                newArray[j++] = arr[i];
            }
        }

        return newArray;
    }
}
