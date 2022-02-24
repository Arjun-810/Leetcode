package leetCode;

import java.util.Scanner;

public class StairsCoast {
    public static int minCostClimbingStairs(int[] cost) {
        int prev=0,best=0,curr=0;
        for (int i=0;i<cost.length;i++){
            curr = cost[i]+best;
            best = Math.min(prev,curr);
            prev = curr;
        }
        return best;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i=0;i<n;i++)
            arr[i] = sc.nextInt();
        int cost = minCostClimbingStairs(arr);
        System.out.println(cost);
    }
}
