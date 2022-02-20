package leetCode;

import java.util.ArrayList;
import java.util.Scanner;

public class leetCode72II {
    public static long[] conicutive(long num ) {
        long k = num/3;
        if (k-1+k+k+1==num){
            long[] arr = new long[3];
            arr[0] = k-1;
            arr[1] = k;
            arr[2] = k+1;
            return arr;
        }
        long[] arr = new long[0];
        return arr;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n  = sc.nextLong();
        long[] res = conicutive(n);
        for (int i=0;i<res.length;i++)
            System.out.println(res[i]);
    }
}
