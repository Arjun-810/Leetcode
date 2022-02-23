package leetCode;

import java.util.Scanner;

public class LinesToString {
    public static int[] numberOfLines(int[] widths, String s) {
        return widths;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i=0;i<n;i++)
            arr[i] = sc.nextInt();
        String str = sc.next();
        int[] res = numberOfLines(arr,str);
        for (int i=0;i<2;i++)
            System.out.println(res[i]);
    }
}
