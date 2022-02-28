package leetCode;

import java.util.Scanner;

public class stringPrefix {
    public static boolean isPrefixString(String s,String[] words) {
        StringBuilder str = new StringBuilder();
        for (String a:words) {
            str.append(a);
            System.out.println(str);
            if (s.equals(str.toString()))
                return true;
        }
        return false;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        int n = sc.nextInt();
        String[] words = new String[n];
        for (int i=0;i<n;i++)
            words[i] = sc.next();
        System.out.println(isPrefixString(str,words));
    }
}
