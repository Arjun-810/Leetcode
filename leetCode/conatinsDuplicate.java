package leetCode;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class conatinsDuplicate {
    public static boolean containsDup(int[] nums) {
        Set<Integer> set = new HashSet<Integer>();
        for (int a:nums) {
            if (set.contains(a))
                return true;
            else set.add(a);
        }
        return false;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i=0;i<n;i++)
            arr[i] = sc.nextInt();
        boolean isDup = containsDup(arr);
        System.out.println(isDup);
    }
}
