package leetCode;

import java.util.Scanner;

public class maxWord {
    public static int mostWordsFound(String[] sentences) {
        int n=0;
        for (String a:sentences){
            String[] s = a.split(" ");
            n = Math.max(n,s.length);
        }
        return n;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String[] arr = new String[n];
        for (int i=0;i<n;i++)
            arr[i] = sc.nextLine();
        int x = mostWordsFound(arr);
        System.out.println(x);
    }
}
