package leetCode;

import java.util.*;

public class duplicateNum {
    public static int findDuplicate(int[] nums) {
//        Set<Integer> set = new HashSet<>();
//        for (int a:nums) {
//            if (set.contains(a))
//                return a;
//            else set.add(a);
//        }
//        return -1;
        Arrays.sort(nums);
        for (int i=1;i<nums.length;i++)
            if (nums[i]==nums[i-1])
                return nums[i];
        return -1;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i=0;i<n;i++)
            arr[i] = sc.nextInt();
        int x = findDuplicate(arr);
        System.out.println(x);
    }
}
