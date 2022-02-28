package leetCode;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class secondLargest {
    public static int secondHighest(String s) {
        int max1=-1,max2=-1;
        for (int i=0;i<s.length();i++){
            int a = s.charAt(i)-'0';
            if (a>=0 && a<=9) {
                if (a == max1 || a == max2)
                    continue;
                if (a > max1) {
                    max2 = max1;
                    max1 = a;
                } else if (a > max2)
                    max2 = a;
            }
        }
        return max2;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        System.out.println(secondHighest(str));
    }
}
