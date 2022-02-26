package leetCode;

import java.util.*;

public class rotateArray {
    public static void rotate(int[] nums, int k) {
        ArrayDeque<Integer> q = new ArrayDeque<>();
        for (int a:nums)
            q.offer(a);
        for (int i=0;i<k;i++){
            int s = q.peekLast();
            q.pollLast();
            q.offerFirst(s);
        }
        for (int i=0;i< nums.length;i++) {
            nums[i] = q.peekFirst();
            q.pollFirst();
        }
        int j=2;
        System.out.println(j++);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i=0;i<n;i++)
            arr[i] = sc.nextInt();
        int k = sc.nextInt();
        rotate(arr,k);
        for (int a:arr)
            System.out.println(a);
    }
}
