package leetCode;

import java.util.Scanner;

public class power {
    public static double myPow(double x , int n) {
        double p = 1,t = Math.abs(n);
        for (int i=0;i<t;i++)
            p = p*x;
        if (n>0)
            return p;
        else
            return 1/p;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double x = sc.nextDouble();
        int n = sc.nextInt();
        double p = myPow(x,n);
        System.out.println(p);
    }
}
