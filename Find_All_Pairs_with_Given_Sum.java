package ArrayQuestion;
//Write a program to find all pairs of integers in an array whose sum is equal to a given number.
// Input:
// arr = {1, 5, 7, -1, 5}, target = 6
public class Find_All_Pairs_with_Given_Sum {
   public static void main(String[] args) {
      int a[]={1, 5, 7, -1, 5};
      int target=6;
      for (int i = 0; i < a.length-1; i++) {
         for (int j = i+1; j < a.length; j++) {
            if (a[i]+a[j]==target) {
               System.out.println("Pairs is : ("+a[i]+" ,"+a[j]+")");
               
            }
         }
      }


   }
   
}
