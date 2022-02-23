package leetCode;

import java.util.Scanner;

public class moveZero {
    public static void moveZeros(int[] nums) {
        int f = 0;
        for (int i=0;i<nums.length;i++)
            if (nums[i] !=0){
                nums[f] = nums[i];
                f++;
            }
        for (int i=0;i<nums.length;i++){
            if (i<f)
                continue;
            else nums[i] = 0;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++)
            arr[i] = sc.nextInt();
        moveZeros(arr);
        for (int a:arr)
            System.out.println(a);
    }
}
