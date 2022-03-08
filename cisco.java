package leetCode;

import java.util.Scanner;

public class cisco {
    public static String solve(int N, String keypad) {
        String[] arr = {",@","ABCabc2","DEFdef3","GHIghi4","JKLjkl5","MNOmno6","PQRSpqrs7","TUVtuv8","WXYZwxyz9", " 0"};
        StringBuilder res = new StringBuilder();
        for (int p=0;p<N;p++) {
            int t = 0, count = 0;
            char[] ch = keypad.toCharArray();
            for (int i = 0; i < keypad.length() - 1; i++) {
                String isnew  = String.valueOf(keypad.charAt(i)+keypad.charAt(i+1));
                if (isnew.equals("\n"))
                    break;
                if ((int) keypad.charAt(i) == 95)
                    continue;
                if (keypad.charAt(i) == keypad.charAt(i + 1))
                    count++;
                else {
                    count++;
                    int temp = (int) keypad.charAt(i) - 49;
                    while (arr[temp].length() < count)
                        count -= arr[temp].length();
                    res.append(arr[temp].charAt(count - 1));
                    count = 0;
                }
            }
            if (count == 0) {
                int temp = (int) keypad.charAt(keypad.length() - 1) - 49;
                res.append(arr[temp].charAt(1));
            } else {
                int temp = (int) keypad.charAt(keypad.length() - 1) - 49;
                res.append(arr[temp].charAt(count));
            }
            res.append("\n");
        }
        return res.toString();
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
        String str = sc.nextLine();
        String s = solve(2,str);
        System.out.println(s);
    }
}
