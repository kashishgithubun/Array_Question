package ArrayQuestion;

public class RemoveDuplicate {
   public static void main(String[] args) {
      int a[] = { 1, 1, 2, 2, 3, 4, 4 };
      int len=a.length;
      for (int i = 0; i < a.length - 1; i++) {
         if (a[i] != -1) {
            for (int j = i + 1; j < a.length; j++) {
               if (a[i] == a[j]) {
                  a[j] = -1;
                  len--;
               }
            }
         }

      }
      System.out.println("Updated length of array "+len);
      for (int i = 0; i < a.length - 1; i++) {
         if (a[i] != -1) {
           System.out.print(a[i]+" ");
         }
      }
      
   }
}
