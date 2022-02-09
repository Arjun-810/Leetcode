package recursion;

import java.util.Scanner;

public class reverseArray {
    public static void reverse(int[] arr,int i,int n) {
        if(i>=n)
            return;
        else{
            int temp  =arr[i];
            arr[i] = arr[n];
            arr[n] = temp;
            reverse(arr,i+1,n-1);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the lengt of array = ");
        int n = sc.nextInt();
        System.out.print("Enter the value of array  = ");
        int[] arr = new int[n];
        for (int i=0;i<n;i++)
            arr[i] = sc.nextInt();
        reverse(arr,0,n-1);
        for (int i=0;i<n;i++)
            System.out.println(arr[i]);
    }
}
