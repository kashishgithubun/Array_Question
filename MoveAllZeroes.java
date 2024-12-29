package ArrayQuestion;

//Write a program to move all the zeroes in an array to the end while maintaining the relative order of other elements.
public class MoveAllZeroes {
   public static void main(String[] args) {
      int[] arr = { 0, 1, 9, 8, 4, 0, 0, 2, 7, 0, 6, 0, 9 };
     
      for (int i = 0; i < arr.length-1; i++) {
        for (int j = i+1; j < arr.length; j++) {
         if (arr[i] == 0 ) {
          
            int temp = arr[i];
            arr[i] = arr[j ];
            arr[j ] = temp;
           

         }
      }
      }
      for (int i : arr) {
         System.out.print(i + " ");
      }

   }
}
