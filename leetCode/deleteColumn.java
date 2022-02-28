package leetCode;

import java.util.Scanner;

public class deleteColumn {
    public static int minDeletionSize(String[] str) {
        System.out.println("Na hua");
        return 1;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String[] strs = new String[n];
        for (int i=0;i<n;i++)
            strs[i] = sc.next();
        System.out.println(minDeletionSize(strs));
    }
}
