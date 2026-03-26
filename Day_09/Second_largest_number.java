/*BLOCK 4 – PROBLEM SOLVING

Find the second largest number in an array

Input:
[10, 5, 20, 8, 15]

Output:
15

Constraint: Do not sort the array. */
package Day_09;

import java.util.Scanner;

public class Second_largest_number{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        int n1 = arr[0];
        int n2 = arr[0];
        for(int i=1;i<n;i++){
            if(arr[i] >n1){
                n1 = arr[i];
            }
        }
        for(int i=0;i<n;i++){
            if (arr[i] > n2 && arr[i] != n1){
                n2 = arr[i];
            }
        }
        System.out.println(n2);
    }
}