package leetCode;

import java.util.Scanner;

public class mergeTwoShortedList {
    public static int[] merge(int[] a,int[] b) {
        return a;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr1 = new int[n];
        for (int i=0;i<n;i++)
            arr1[i] = sc.nextInt();
        int m = sc.nextInt();
        int[] arr2 = new int[m];
        for (int i=0;i<m;i++)
            arr2[i] = sc.nextInt();
        int[] res = merge(arr1,arr2);
        for (int a:res)
            System.out.print(a);
    }
}
