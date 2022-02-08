package recursion;

import java.util.Scanner;

public class printNtoI {
    public static void printTill1(int i, int n) {
        if (i > n)
            return;
        printTill1(i+1,n);
        System.out.print(i+" ");
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of n = ");
        int n = sc.nextInt();
        printTill1(1,n);
    }
}
