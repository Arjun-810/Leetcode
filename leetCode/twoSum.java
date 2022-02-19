package leetCode;

import java.util.HashMap;
import java.util.Scanner;

public class twoSum {
    public static void sumTwo(int[] nums,int target) {
        int[] res = new int[2];
//        for (int i=0;i<nums.length-1;i++){
//            if (nums[i]>target)
//                continue;
//            for (int j=i+1;j<nums.length;j++){
//                if (nums[j]> target)
//                    continue;
//                if (nums[i] + nums[j] == target) {
//                    res[0] = i;
//                    res[1] = j;
//                }
//            }
//        }
//        System.out.println(res[0]+" "+ res[1]);
        HashMap<Integer, Integer> twoHash = new HashMap<Integer, Integer>();
        for (int i=0;i<nums.length;i++){
            if (!twoHash.isEmpty() && twoHash.containsKey(target-nums[i])){
                res[0] = i;
                res[1] = twoHash.get(target-nums[i]);
                break;
            }

            twoHash.put(nums[i],i);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i=0;i<n;i++)
            arr[i] = sc.nextInt();
        int t = sc.nextInt();
        sumTwo(arr, t);
    }
}
