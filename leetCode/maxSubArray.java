package leetCode;

import java.util.Scanner;

public class maxSubArray {
    public static int maxSum(int[] nums) {
        int sum = Integer.MIN_VALUE,s=0;
        for (int i=0;i<nums.length;i++){
            if (s <0)
                s = nums[i];
            else
                s += nums[i];
            sum = Math.max(s,sum);
        }
        return sum;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i=0;i<n;i++)
            arr[i] = sc.nextInt();
        int sum = maxSum(arr);
        System.out.println(sum);
    }
}
