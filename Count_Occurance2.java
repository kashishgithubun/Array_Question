package ArrayQuestion;

public class Count_Occurance2 {
   public static void main(String[] args) {
      int[] array = { 3, 5, 3, 7, 3, 9, 3, 11, 5, 6, 7, 11 };
      boolean visited[] = new boolean[array.length];
      for (int i = 0; i < array.length; i++) {
         if (visited[i]) {
            continue;
         }
         int count=1;
         for (int j = i+1; j < array.length; j++) {
            if (array[i]==array[j]) {
               count++;
               visited[j]=true;
               
            }
         }
         if (count>1) {
            System.out.println("Element "+array[i]+" occures "+ count+" times");
            
         }
         
      }

   }
}
