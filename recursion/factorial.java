package recursion;

import java.util.Scanner;

public class factorial {
    public static void factorialOfN(int n, int f) {
        if(n==1) {
            System.out.println("Factorial = " + f);
            return;
        }
        else
            factorialOfN(n-1,f*n);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of n = ");
        int n = sc.nextInt();
        factorialOfN(n,1);
    }
}
