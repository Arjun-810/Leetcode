package recursion;

import java.util.Scanner;

public class palindrome {
    public static boolean palin(String str,int i,int n) {
        if (i>=n) return true;
        else {
            if (str.charAt(i) != str.charAt(n)) palin(str, i + 1, n - 1);
            else return false;
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the string = ");
        String str = sc.next();
        boolean is_palin = palin(str.toLowerCase(),0,str.length()-1);
        System.out.println("Is palindrome = " + is_palin);
    }

}
