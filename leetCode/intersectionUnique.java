package leetCode;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class intersectionUnique {
    public static int[] intersectionUnq(int[] nums1,int[] nums2) {
        Set<Integer> set1 = new HashSet<>();
        for (int a:nums1)
            set1.add(a);
        Set<Integer> res = new HashSet<>();
        for (int b:nums2)
            if (set1.contains(b))
                res.add(b);
        int[] arr = new int[res.size()];
        int i=0;
        for (int a: res) {
            arr[i] = a;
            i++;
        }
        return arr;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr1 = new int[n];
        for (int i=0;i<n;i++)
            arr1[i] = sc.nextInt();
        int m = sc.nextInt();
        int[] arr2 = new int[m];
        for (int i=0;i<m;i++)
            arr2[i] = sc.nextInt();
        int[] inter = intersectionUnq(arr1,arr2);
        for (int a:inter)
            System.out.println(a);
    }
}
