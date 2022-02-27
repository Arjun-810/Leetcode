package leetCode;

import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class missingPositiveNo {
    public static int firstMissingPositive(int[] nums) {
        Set<Integer> set = new TreeSet<>();
        for (int a:nums)
            if (a>0)
                set.add(a);
        int i=1;
        for (int a:set) {
            if (i != a)
                return i;
            i++;
        }
        return i;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i=0;i<n;i++)
            arr[i] = sc.nextInt();
        int x = firstMissingPositive(arr);
        System.out.println(x);
    }
}
