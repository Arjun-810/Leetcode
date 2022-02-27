package leetCode;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Stack;

public class consistentString {
    public static int countConsistentStrings(String allowed,String[] words) {
        int n=0;
        HashSet<Character> set = new HashSet<>();
        for (char a:allowed.toCharArray())
            set.add(a);
        for (String w:words){
            boolean f = true;
            for (char a:w.toCharArray())
                if (!set.contains(a)) {
                    f = false;
                    break;
                }
            if (f)
                n++;
        }
        return n;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String allowed = sc.next();
        int n = sc.nextInt();
        String[] words = new String[n];
        for (int i=0;i<n;i++)
            words[i] = sc.next();
        int x = countConsistentStrings(allowed, words);
        System.out.println(x);
    }
}
