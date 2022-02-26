package leetCode;

import java.util.Scanner;

public class validPalindrome {
    public static boolean isPalindrome(String s) {
        StringBuilder str = new StringBuilder();
        String st = s.toLowerCase();
        for (int i=0;i<s.length();i++)
            if ((st.charAt(i) > 96 && st.charAt(i) < 123)||(st.charAt(i) > 47 && st.charAt(i) < 58))
                str.append(st.charAt(i));
        for (int i=0;i<str.length()/2;i++)
            if (str.charAt(i)!=str.charAt(str.length()-i-1))
                return false;
        return true;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        boolean is_pal = isPalindrome(str);
        System.out.println(is_pal);
    }
}
