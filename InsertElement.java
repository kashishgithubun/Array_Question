package ArrayQuestion;

import java.util.Arrays;

public class InsertElement {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        int index = 2; // Index where the element is to be inserted
        int element = 99; // Element to insert

        // Insert the element
        int[] newArr = insertAtIndex(arr, index, element);

        // Print the updated array
        System.out.println("Array after insertion: " + Arrays.toString(newArr));
    }

    public static int[] insertAtIndex(int[] arr, int index, int element) {
        // Create a new array with one extra space
        int[] newArr = new int[arr.length + 1];

        // Copy elements up to the index
        for (int i = 0; i < index; i++) {
            newArr[i] = arr[i];
        }

        // Insert the new element
        newArr[index] = element;

        // Copy the remaining elements
        for (int i = index; i < arr.length; i++) {
            newArr[i + 1] = arr[i];
        }

        return newArr;
    }
}
