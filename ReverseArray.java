package ArrayQuestion;
//Given an array, write a program to reverse it.
public class ReverseArray {
   public static void main(String[] args) {
      int[] array1 = { 1, 2, 3, 4, 5 };
      int[] array2 = new int[5];
      int j=0;
      for (int i = array1.length - 1; i >= 0; i--) {
         
            array2[j] = array1[i];
            j++;
         
      }

      for (int k : array2) {
         System.out.print(k + " ");
      }

   }
}
