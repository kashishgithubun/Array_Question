
package ArrayQuestion;
public class Find_Sub_Array_of_Sum_Zero {
   public static void main(String[] args) {
      int[] arr = { 4, 2, -3, 1, 6 };

      for (int i = 0; i < arr.length; i++) {
         int sum = 0;
         for (int j = i; j < arr.length; j++) {
         sum=sum+arr[j];

         if (sum==0) {
            System.out.println("Subarray with sum 0 : ");
            for (int j2 = i; j2 <= j; j2++) {
               System.out.println(arr[j2]+" ");
            }
         }
         }
      }
   }

}
