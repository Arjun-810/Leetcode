package leetCode;

import java.util.Scanner;
import java.util.TreeSet;

public class missingNum {
    public static int missingNumber(int[] nums) {
//        TreeSet<Integer> set = new TreeSet<>();
//        for (int a:nums)
//            set.add(a);
//        int i=-1;
//        for (int a:set){
//            i++;
//            if (a!=i)
//                return i;
//        }
//        return ++i;
        int ans = (nums.length*(nums.length+1))/2;
        for (int a:nums)
            ans-=a;
        return ans;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i=0;i<n;i++)
            arr[i] = sc.nextInt();
        int x = missingNumber(arr);
        System.out.println(x);
    }
}
