package ARRAY_PRACTICE;
// Rearrange the elements of the array such that the largest element is followed by the smallest, then the second-largest, and so on.
public class Arrange_Alternatively {
   public static void main(String[] args) {
      int a[]={1,2,3,4,5,6};
      int first=a[0],last=a[a.length-1];
      
      int a1[]=new int[a.length];
      for (int i = 0; i < a.length; i++) {
        
         if (i%2==0) {
            a1[i]=last--;
            // a1[i]=a[a.length-(j)];
            // j++;
         } 
         else {
            a1[i]=first++;
            // a1[i]=a[i-1];
         }
        }
   
      for (int i : a1) {
         System.out.print(i+" ");
      }
   }
}