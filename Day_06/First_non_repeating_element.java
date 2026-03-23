/*
BLOCK 4 – PROBLEM SOLVING (Intermediate)

Find the first non-repeating element in the array

Input:
[4,5,1,2,0,4,1,2]

Output:
5

Follow-up:
Solve efficiently using hashing.

 */


package Day_06;

import java.util.*;

public class First_non_repeating_element {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int num : arr){
            map.put(num, map.getOrDefault(num, 0) + 1);
        }
        int a = -1;
        for(int num : arr) {
            if(map.get(num) == 1){
                a = num;
                break;
            }
        }
        if(a != -1){
            System.out.println(a);
        } 
    }
}