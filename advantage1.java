package leetCode;

import java.util.Scanner;

public class advantage1 {
    public static int minMoves(String s) {
        char[] bits = s.toCharArray();
        int f = 0,idx = -1;
        for (int a=0;a<bits.length;a++)
            if (bits[a]=='0') {
                idx = a;
                break;
            }
        while (idx !=-1){
            for (int j=idx;j<bits.length;j++){
                if (bits[j] == '0') bits[j] = '1';
                else bits[j] = '0';
            }
            idx = -1;
            for (int a=0;a<bits.length;a++)
                if (bits[a]=='0') {
                    idx = a;
                    break;
                }
            f++;
        }
        return f;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int result = minMoves(s);
        System.out.println(result);
    }
}
