package leetCode;

import java.util.Scanner;

public class search {
    public static int searchPos(int[] arr, int target) {
        int i;
        for (i=0;i<arr.length;i++)
            if (arr[i]>=target) return i;
        return i;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i=0;i<n;i++)
            arr[i] = sc.nextInt();
        int target = sc.nextInt();
        int p = searchPos(arr, target);
        System.out.println(p);
    }
}
