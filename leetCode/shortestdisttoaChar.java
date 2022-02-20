package leetCode;

import java.util.Scanner;
import java.util.TreeSet;

public class shortestdisttoaChar {
    public static int[] shortestDistance(String s,char c) {
        int[] arr = new int[s.length()];
        TreeSet<Integer> t = new TreeSet<Integer>();
        for (int i=0;i<s.length();i++)
            if (s.charAt(i) == c)
                t.add(i);
        for (int i=0;i<s.length();i++){
            Integer l = t.floor(i);
            Integer h = t.ceiling(i);
            if (h == null || (l != null && i-l <h-i))
                arr[i] = i-l;
            else arr[i] = h-i;
        }
        return arr;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the String = ");
        String str = sc.next();
        System.out.print("Enter the character = ");
        char ch = sc.next().charAt(0);
        int[] arr = shortestDistance(str,ch);
        for (int a: arr)
            System.out.print(a+ " ");
    }
}
