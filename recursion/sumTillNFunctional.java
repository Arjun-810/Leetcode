package recursion;

import java.util.Scanner;

public class sumTillNFunctional {
    public static int sumTillN(int n) {
        if(n==0)
            return 0;
        return n+sumTillN(n-1);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number = ");
        int n = sc.nextInt();
        int sum = sumTillN(n);
        System.out.println("Sum = " + sum);
    }
}
