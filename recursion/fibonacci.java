package recursion;

import java.util.Scanner;

public class fibonacci {
    public static int fib(int n) {
        if(n<=1)
            return n;
        return fib(n-1)+fib(n-2);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of n = ");
        int n = sc.nextInt();
        int f = fib(n);
        System.out.println("Fibonacci = "+f);
    }
}
