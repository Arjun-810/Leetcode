package leetCode;

import java.util.Scanner;

public class climbingStairs {
    public static int climbStrairs(int n) {
        if (n == 0||n==1)
            return 1;
        else {
            int pre = 1,curr = 1;
            for (int i=2;i<=n;i++){
                int t = pre+curr;
                pre = curr;
                curr = t;
            }
            return curr;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int s = climbStrairs(n);
        System.out.println(s);
    }
}
