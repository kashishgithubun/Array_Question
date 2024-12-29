package ArrayQuestion;
//Write a program to count how many times a specific element appears in the array.
public class Count_Occurrance1 {
   public static void main(String[] args) {
      int[] array = { 3, 5, 3, 7, 3, 9, 3, 11, 5 };
      // int element = 0,count=0;
      for (int i = 0; i < array.length; i++) {
         int count = 1;
         if (array[i] != -1) {
            for (int j = i + 1; j < array.length; j++) {
               if (array[i] == array[j]) {
                  count++;
                  array[j]=-1;
               }
             
            }
            if (count>1) {
               System.out.println("Element "+array[i]+" occure "+count+" times");
               
            }
         }

      }

   }

}
