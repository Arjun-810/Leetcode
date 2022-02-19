package leetCode;

import java.util.Scanner;

public class palandromic {
    public static boolean palindrom(int x) {
        String s = Integer.toString(x);
        for (int i=0;i<s.length()/2;i++)
            if(s.charAt(i) != s.charAt(s.length()-i-1))
                return false;
        return true;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        boolean isPal = palindrom(n);
        System.out.println(isPal);
    }
}
