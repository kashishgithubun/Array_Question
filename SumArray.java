package ArrayQuestion;
//Calculate the sum of all elements in the array.
public class SumArray {
   public static void main(String[] args) {
      int[] array = {10, 20, 30, 40, 50};
   int sum=0;
   for (int i = 0; i < array.length; i++) {

      sum=sum+array[i];
      
   }
System.out.println("Sum is : "+sum);
   } 
}
