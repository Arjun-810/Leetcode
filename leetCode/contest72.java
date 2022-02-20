package leetCode;

import java.util.Scanner;

public class contest72 {
    public static int countSum(int[] nums,int k) {
        int c = 0;
        for (int i=0;i<nums.length-1;i++){
            for (int j=i+1;j<nums.length;j++){
                if(nums[i] == nums[j] && ((i*j)%k ==0 || (i*j) == 0)) {
                    c++;
                }
            }
        }
        return c;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i=0;i<n;i++)
            arr[i] = sc.nextInt();
        int k = sc.nextInt();
        int x = countSum(arr,k);
        System.out.println(x);
    }
}
