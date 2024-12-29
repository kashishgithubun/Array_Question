package ArrayQuestion;
//Given an array containing n distinct numbers in the range [0, n], find the one number that is missing from the array.
public class Missing_Number {
   public static void main(String[] args) {
      int arr[] = {3, 0, 1};
      int  max = 0;
      for (int i = 0; i < arr.length; i++) {
         if (arr[i] > max) {
            max = arr[i];
         }
      }
    
      int sum=(max*(max+1))/2;

     int arraySum=0;
     for (int i : arr) {
      arraySum=arraySum+i;
     }

     int Missing_Number=sum-arraySum;
     System.out.println("Missing Number :"+Missing_Number);
   }
   
}
