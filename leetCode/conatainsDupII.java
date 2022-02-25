package leetCode;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class conatainsDupII {
    public static boolean containsNearbyDuplicate(int[] nums, int k) {
        Map<Integer,Integer> map = new HashMap<Integer,Integer>();
        for (int i=0;i< nums.length;i++) {
            if (map.containsKey(nums[i]) && Math.abs(i - map.get(nums[i])) <= k)
                return true;
            else map.put(nums[i],i);
        }
        return false;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i=0;i<n;i++)
            arr[i] = sc.nextInt();
        int k = sc.nextInt();
        boolean is_avai = containsNearbyDuplicate(arr,k);
        System.out.println(is_avai);
    }
}
