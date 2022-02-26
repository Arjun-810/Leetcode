package leetCode;

import java.util.Scanner;

public class LinesToString {
    public static int[] numberOfLines(int[] widths, String s) {
        int score=0,f=1;
        for(int i=0;i<s.length();i++){
            int a = s.charAt(i)-'a';
            if (score==100 || score+widths[a]>100) {
                score = 0;
                f++;
            }
            score += widths[a];
        }
        return new int[]{f, score};
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
