package leetCode;

import java.util.Scanner;

public class truncateSentence {
    public static String truncate(String s, int k) {
//        String res = new String();
//        String[] str_arr = s.split(" ");
//        for (int i=0;i<k;i++)
//            res += str_arr[i]+" ";
//        return res.trim();
        for (int i=0;i<s.length();i++)
            if (s.charAt(i)==' ')
                if (--k == 0)
                    return s.substring(0,i);
        return s;
//        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        int n = sc.nextInt();
        String st = truncate(str,n);
        System.out.println(st);
    }
}
