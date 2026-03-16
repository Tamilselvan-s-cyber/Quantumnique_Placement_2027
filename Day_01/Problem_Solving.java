/*BLOCK 4 – PROBLEM SOLVING


Find the missing number in the array


Input :[1,2,3,4,6,7,8]

Expected Output : 5

Answer:

*/
import java.util.*;
public class Problem_Solving{
   @SuppressWarnings("resource")
   public static void main(String[]args){
      Scanner sc = new Scanner(System.in);
      int a = sc.nextInt();
      int []arr = new int[a];
      int sum = 0;
      for(int i=0;i<a;i++){
         arr[i] =sc.nextInt();
         sum = sum + arr[i];
      }
      int n=8;
      int arr1 = n * (n+1)/2;
      int arr2 = arr1 - sum ;
     System.out.println(arr2);
   }
}