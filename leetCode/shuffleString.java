package leetCode;

import java.util.Arrays;
import java.util.Scanner;

public class shuffleString {
    public static String restoreString(String s, int[] indices) {
        char[] res = new char[indices.length];
        for (int i=0;i<indices.length;i++)
            res[indices[i]] = s.charAt(i);
        return  String.valueOf(res);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);;
        String str = sc.next();
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i=0;i<n;i++)
            arr[i] = sc.nextInt();
        System.out.println(restoreString(str,arr));
    }
}
