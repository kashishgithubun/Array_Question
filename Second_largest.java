package ArrayQuestion;
//Write a program to find the second largest element in an array.
public class Second_largest {
   public static void main(String[] args) {

      int[] arr = { 10, 20, 4, 45, 99 };
     

      for (int i = 0; i < arr.length; i++) {
         int max = arr[i];
         for (int j = i+1; j < arr.length; j++) {
            if (arr[j] > max) {
               max = arr[j];

               arr[j] = arr[i];
               arr[i] = max;
            }
         }

      }

      for (int i : arr) {
         System.out.println(i);
      }
      System.out.println("Second Largest element is :" + arr[1]);

   }

}
