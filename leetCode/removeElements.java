package leetCode;

import java.util.Scanner;

public class removeElements {
    public static int remobeVal(int[] nums,int val) {
        int f = 0;
        for (int i=0;i<nums.length;i++){
            if (nums[i] != val){
                nums[f] = nums[i];
                f++;
            }
        }
        return f;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++)
            arr[i] = sc.nextInt();
        int val = sc.nextInt();
        int res = remobeVal(arr,val);
        for (int i=0;i<res;i++)
            System.out.println(arr[i]);
    }
}
