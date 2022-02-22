package leetCode;

import java.util.*;

public class intersection {
    public static int[] intersectionArray(int[] nums1,int[] nums2) {
        Map<Integer,Integer> map = new HashMap<>();
        for (int n:nums1)
            map.put(n,map.getOrDefault(n,0)+1);
        List<Integer> res = new ArrayList<>();
        for (int n:nums2) {
            map.put(n, map.getOrDefault(n, 0) - 1);
            if (map.get(n) >= 0)
                res.add(n);
        }
        int ans[] = new int[res.size()];
        int i = 0;
        for(int n : res) {
            ans[i++] = n;
        }
        return ans;
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
        int[] inter = intersectionArray(arr1,arr2);
        for (int a:inter)
            System.out.println(a);

    }
}
