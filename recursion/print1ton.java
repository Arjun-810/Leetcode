package recursion;

import java.util.Scanner;

public class print1ton {
    public static void printTillN(int i,int n) {
        if (i>n)
            return;
        System.out.println(i);
        printTillN(i+1,n);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of n = ");
        int n = sc.nextInt();
        printTillN(1,n);
    }
}
