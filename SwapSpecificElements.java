package ArrayQuestion;
public class SwapSpecificElements {
   public static void main(String[] args) {
       int[] nums = {5, 12, 8, 3, 15, 7};

       // Elements to swap
       int firstElement = 3, secondElement = 12;
       int firstIndex = -1, secondIndex = -1;

       // Find indices of the two elements
       for (int i = 0; i < nums.length; i++) {
           if (nums[i] == firstElement) {
               firstIndex = i;
           }
           if (nums[i] == secondElement) {
               secondIndex = i;
           }
       }

       // Check if both elements are found
       if (firstIndex != -1 && secondIndex != -1) {
           // Swap the elements
           int temp = nums[firstIndex];
           nums[firstIndex] = nums[secondIndex];
           nums[secondIndex] = temp;
       } else {
           System.out.println("One or both elements not found in the array.");
       }

       // Print the modified array
       System.out.print("Array after swapping: ");
       for (int num : nums) {
           System.out.print(num + " ");
       }
   }
}
