package leetCode;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class threeSum {
    public static int[] threeSumZero(int[] nums) {
        int[] res = new int[3];
        List<List<Integer>> list = new ArrayList<>();
        int f=-1;
        for (int i=0;i<nums.length;i++){
            for (int j=i+1;j<nums.length;j++){
                for (int k=j+1;k<nums.length;k++){
                    if(nums[i]+nums[j]+nums[k] == 0) {
                        f++;
                        list.get(f).set(0,nums[i]);
                        list.get(f).set(1,nums[j]);
                        list.get(f).set(2,nums[k]);
                    }
                }
            }
        }
        System.out.println(list);
        return res;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i=0;i<n;i++)
            arr[i] = sc.nextInt();
        int[] res = threeSumZero(arr);
        for (int a: res)
            System.out.println(a);
    }
}
