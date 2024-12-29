
package ArrayQuestion;
//Remove duplicate elements from a sorted array such that each element appears only once.
public class Remove_Duplicate {
   public static int removeduplicate(int[] array) {
      if (array.length == 0)
         return 0;
      int uniqeElement = 0;
      for (int i = 1; i < array.length; i++) {
         if (array[i] != array[uniqeElement]) {
            uniqeElement++;
            array[uniqeElement] = array[i];

         }

      }

      return uniqeElement+1;
   }

   public static void main(String[] args) {
      int[] arr = { 1, 1, 2, 2, 3, 4, 4 };
      int newLength = removeduplicate(arr);

      System.out.print("Updated Array: ");
      for (int i = 0; i < newLength; i++) {
          System.out.print(arr[i] + " ");
      }
      System.out.println("\nUpdated Array Size: " + newLength);




        // ANOTHER APPROCH
      int[] arr2 = { 1, 1, 2, 2, 3, 4, 4 };

      for (int i = 0; i < arr2.length; i++) {
         for (int j = i + 1; j < arr2.length; j++) {
            if (arr2[i] == arr2[j]) {
               arr2[j] = -1;
            }

         }

      }
      for (int i = 0; i < arr2.length; i++) {

         if (arr2[i] != -1) {
            System.out.print(arr2[i] + " ");

         }

      }

     

   }
}
