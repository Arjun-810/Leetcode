package leetCode;

import java.util.Scanner;

public class firstPalindromicInArray {
    public static String firstPalindrome(String[] words) {
        for (String a:words){
            boolean f = true;
            for (int i=0;i<a.length()/2;i++)
                if (a.charAt(i)!=a.charAt(a.length()-1-i))
                    f=false;
            if (f)
                return a;
        }
        return "";
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String[] words = new String[n];
        for (int i=0;i<n;i++)
            words[i] = sc.next();
        System.out.println(firstPalindrome(words));
    }
}
