package leetCode;

import java.util.Scanner;

public class lengthOfLastWord {
    public static int lengthLastWord(String s) {
        String[] st = s.trim().split(" ");
        return st[st.length-1].length();
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        int idx = lengthLastWord(str);
        System.out.println(idx);
    }
}
