/* 
Practice Problem

Find the maximum element in the array

[3,8,1,10,4]


Answer:
*/

import java.util.Scanner;
public class Max_value{
   @SuppressWarnings("resource")
public static void main(String[]args){
      Scanner sc= new Scanner(System.in);
      int n =sc .nextInt();
      int []arr = new int[n];
      int max= arr[0];
      for(int i=0;i<n;i++){
         arr[i]=sc.nextInt();
      }
      for(int i=0;i<arr.length;i++){
         if(arr[i]>max){
            max= arr[i];
         }
      }
      System.out.println(max);
   }
}