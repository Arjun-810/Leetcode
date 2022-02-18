package leetCode;

import java.util.Arrays;
import java.util.Scanner;

public class longestCommonPrefix {
    public static void longestCommonPrefix(String[] strs) {
        if (strs.length ==0)
            System.out.println("");
        else if(strs.length ==1)
            System.out.println(strs[0]);
        else {
            Arrays.sort(strs);
            StringBuilder s = new StringBuilder();
            int length = strs[0].length();
            for (int i=0;i<length;i++){
                if (strs[0].charAt(i) == strs[strs.length-1].charAt(i))
                    s.append(strs[0].charAt(i));
                else
                    break;
            }
            System.out.println(s);
        }
//        String commonSub = "";
//        for (int j=0;j<Math.min(strs[0].length(),strs[1].length());j++){
//            if(strs[0].charAt(j) == strs[1].charAt(j))
//                commonSub += strs[1].charAt(j);
//            else
//                break;
//        }
//        for (int i=2;i<strs.length;i++){
//            String new_common = "";
//            for (int j=0;j<commonSub.length();j++){
//                if(commonSub.charAt(j) == strs[i].charAt(j))
//                    new_common += strs[i].charAt(j);
//                else
//                    break;
//            }
//            commonSub = new_common;
//        }
//        System.out.println(commonSub);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String[] arr = new String[n];
        for (int i=0;i<n;i++)
            arr[i] = sc.next();
        longestCommonPrefix(arr);

    }
}
