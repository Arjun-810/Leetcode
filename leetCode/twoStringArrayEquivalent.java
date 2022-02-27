package leetCode;

import java.util.Scanner;

public class twoStringArrayEquivalent {
    public static boolean arrayStringsAreEqual(String[] word1,String[] word2) {
        StringBuilder sb1 = new StringBuilder();
        StringBuilder sb2 = new StringBuilder();

        for(int i=0;i<word1.length;i++)
            sb1.append(word1[i]);
        for(int i=0;i<word2.length;i++)
            sb2.append(word2[i]);

        if((sb1.toString()).equals(sb2.toString()))
            return true;

        return false;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String[] str1 = new String[n];
        for (int i=0;i<n;i++)
            str1[i] = sc.next();
        int m = sc.nextInt();
        String[] str2 = new String[m];
        for (int i=0;i<m;i++)
            str2[i] = sc.next();
        System.out.println(arrayStringsAreEqual(str1,str2));
    }
}
