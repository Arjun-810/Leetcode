package leetCode;

import java.util.Scanner;

public class sqrt {
    public static int mySqrt(int x) {
        long lb = 1,up = x;
        long temp = (long) x;
        while (lb<=up){
            long mid = lb+(up-lb)/2;
            if (mid*mid == temp)return (int) mid;
            else if (mid*mid>x)  up = mid-1;
            else if(mid*mid<x) lb = mid+1;
        }
        return (int) up;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int sq = mySqrt(x);
        System.out.println(sq);
    }
}
