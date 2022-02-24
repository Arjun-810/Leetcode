package leetCode;

import java.util.Scanner;

public class firstSubstrIndex {
    public static int strstr(String haystack, String needle) {
        int s = haystack.indexOf(needle);
        return s;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        String needle = sc.next();
        int idx = strstr(s,needle);
        System.out.println(idx);
    }
}
