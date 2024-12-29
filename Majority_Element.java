package ArrayQuestion;

public class Majority_Element {
   public static void main(String[] args) {
      int arr[] = { 10, 20, 10, 30, 10 };

      for (int i = 0; i < arr.length - 1; i++) {
         int count = 1;
         for (int j = i + 1; j < arr.length; j++) {
            if (arr[i] == arr[j]) {
               count++;
               arr[j] = -1;
            }
            
         }
         if (count>1&& arr[i]!=-1) {
            System.out.println("Element "+arr[i]+" occur "+count);
         }
      }

   }
}
