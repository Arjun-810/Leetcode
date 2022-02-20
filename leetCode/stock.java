package leetCode;

import java.util.Scanner;

public class stock {
    public static int sellStock(int[] prices) {
        int bp = Integer.MIN_VALUE,low = prices[0],price= 0;
        for (int i=0;i<prices.length;i++){
            if (low<prices[i])
                price = prices[i]-low;
            else low = prices[i];
            bp = Math.max(bp,price);
        }
        return bp;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i=0;i<n;i++)
            arr[i] = sc.nextInt();
        int st = sellStock(arr);
        System.out.println(st);
    }
}
