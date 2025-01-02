import java.util.Scanner;

public class User_Array {
   public static void main(String[] args) {
      Scanner sc=new Scanner(System.in);
      System.out.print("Enter length of Array ");
      int len =sc.nextInt();
      int a[]=new int[len];
      System.out.print("Enter elements of array of size "+len);
      for (int i = 0; i <len; i++) {
         a[i]=sc.nextInt();
      }
System.out.println("Odd element in array is");
      for (int i = 0; i < a.length; i++) {
         if (a[i]%2!=0) {
            System.out.print(a[i]+" ");
         }
      }
   }
}
