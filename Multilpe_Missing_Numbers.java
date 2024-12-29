
package ArrayQuestion;
public class Multilpe_Missing_Numbers {
   public static void main(String[] args) {
      int[] arr = {3, 0, 1};
      int n=5;
      boolean present[]= new boolean[n+1];
      for (int num : arr) {
         if (num <= n) {
             present[num] = true;
         }
     }

     // Find missing numbers
     System.out.print("Missing Numbers: ");
     for (int i = 0; i <= n; i++) {
         if (!present[i]) {
             System.out.print(i + " ");
         }
     }
   }
   
}
