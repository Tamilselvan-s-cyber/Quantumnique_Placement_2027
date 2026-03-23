
package Day_06;

import  java.util.*;

public class Remove_duplicate {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        
        int[] num = new int[n];
        
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }

        int j = 0;
        num[j++] = arr[0];
        for(int i=1;i<n;i++){
            if(arr[i] != arr[i - 1]){
                num[j++] = arr[i];
            }
        }
        for(int i=0;i<j;i++){
            System.out.print(num[i]);
        }
    }
}