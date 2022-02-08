package recursion;

import java.util.Scanner;

public class sumTillN {
    public static void sumToN(int n,int sum) {
        if(n<0) {
            System.out.println(sum);
            return;
        }   
        sumToN(n-1,sum+n);

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum = 0;
        sumToN(n,sum);
    }
}
