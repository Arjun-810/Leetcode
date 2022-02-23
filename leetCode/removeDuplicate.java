package leetCode;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class removeDuplicate {
    public static int removeDuplicates(int[] nums) {
//        Set<Integer> set = new HashSet<>();
//        for (int a:nums)
//            set.add(a);
//        int[] arr = new int[set.size()];
//        int i = 0;
//        for (int a:set){
//            arr[i] = a;
//            i++;
//        }
//        Arrays.sort(arr);
//        i=0;
//        for (int a:arr) {
//            nums[i] = a;
//            i++;
//        }
//        return set.size();
        int f = 0;
        for (int i=0;i< nums.length;i++)
            if (nums[i] != nums[f]) {
                f++;
                nums[f] = nums[i];
            }
        return f+1;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++)
            arr[i] = sc.nextInt();
        int res = removeDuplicates(arr);
        for (int i=0;i<res;i++)
            System.out.println(arr[i]);
    }
}
