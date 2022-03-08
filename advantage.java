package leetCode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class advantage {
    public static int solve(List<Integer> brick_arr) {
        int min  = Integer.MAX_VALUE;
        for (int a:brick_arr)
            min = Math.min(a,min);
        return min>brick_arr.size()?brick_arr.size():min;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        List<Integer> arr = new ArrayList<>();
        for (int i=0;i<n;i++)
            arr.add(sc.nextInt());
        System.out.println(solve(arr));
    }
}
