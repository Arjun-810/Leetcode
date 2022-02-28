package leetCode;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class minOperations {
    public static List<String> summaryRanges(int[] nums) {
        List<String> li = new ArrayList<>();
        if (nums.length==0)
            return li;
        int start = nums[0],end=Integer.MIN_VALUE;
        int i=0;
        while (i<nums.length-1){
            if(nums[i]+1 !=nums[i+1]) {
                end = nums[i];
                if (start==end) {
                    li.add(String.valueOf(start));
                    start = nums[i+1];
                }
                else{
                    li.add(start+"->"+nums[i]);
                    start = nums[i+1];
                }
            }
            i++;
        }
        if (start!=end){
            if (start == nums[nums.length-1])
                li.add(String.valueOf(start));
            else
                li.add(start+"->"+nums[nums.length-1]);
        }
        return li;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n =sc.nextInt();
        int[] arr = new int[n];
        for (int i=0;i<n;i++)
            arr[i] = sc.nextInt();
        System.out.println(summaryRanges(arr));
    }
}
