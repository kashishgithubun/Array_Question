package ArrayQuestion;

//Separate the even and odd numbers from an array into two different arrays.
public class Even_Odd {
   public static void main(String[] args) {
      int[] array = { 15, 24, 18, 33, 42, 29, 7, 16 };
      int evencount = 0, oddcount = 0;
      for (int i : array) {
         if (i % 2 == 0) {
            evencount++;

         } else {
            oddcount++;
         }

      }
      int even[] = new int[evencount];
      int odd[] = new int[oddcount];

      int evenindex = 0, oddindex = 0;
      for (int num : array) {
         if (num % 2 == 0) {
            even[evenindex++] = num;
         } else {
            odd[oddindex++] = num;
         }

      }

      System.out.print("Even Array ");
      for (int i : even) {

         System.out.print(i + " ");
      }
      System.out.println();
      System.out.print("Odd Array ");
      for (int j : odd) {

         System.out.print(j + " ");
      }

   }

}
