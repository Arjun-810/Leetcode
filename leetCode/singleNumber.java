package leetCode;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class singleNumber {
    public static int singleNum(int[] nums) {
//        Arrays.sort(nums);
//        for (int i=0;i<nums.length-1;i++){
//            if (nums[i]==nums[i+1])
//                i++;
//            else
//                return nums[i];
//        }
//        return nums[nums.length-1];
        int a=0;

        for (int i=0;i<nums.length;i++)
        {
            a=a^nums[i];//1 1 2 2 4
        }
        return a;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i=0;i<n;i++)
            arr[i] = sc.nextInt();
        int x = singleNum(arr);
        System.out.println(x);
    }
}
