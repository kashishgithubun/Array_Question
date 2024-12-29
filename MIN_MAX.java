package ArrayQuestion;
//Write a program to find the largest and smallest elements in an array.
class MIN_MAX {
   public static void main(String args[]) {
      int a[] = { 1, 4, 3, 6, 9, 0, 85, 432, 32 };
      int min = 0, max = 0;
      for (int i = 0; i < a.length; i++) {
         if (a[i] > max) {
            max = a[i];
         }
      }
      System.out.println("Max element is : " + max);

      for (int i = 0; i < a.length; i++) {
         if (a[i] < min) {
            min = a[i];
         }
      }
      System.out.println("Min element is : " + min);

   }
}