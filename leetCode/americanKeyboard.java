package leetCode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class americanKeyboard {
    public static String[] keyboardRow(String[] words) {
        ArrayList arr = new ArrayList<>();
        for (String s:words){
            if (s.toLowerCase().matches("[qwertyuiop]*"))
                arr.add(s);
            else if (s.toLowerCase().matches("[asdfghjkl]*"))
                arr.add(s);
            else if (s.toLowerCase().matches("[zxcvbnm]*"))
                arr.add(s);
        }
        String res [] = (String[]) arr.toArray(new String[0]);
        return res;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the no. of strings = ");
        int s = sc.nextInt();
        String[] arr = new String[s];
        for (int i=0;i<s;i++)
            arr[i] = sc.next();
        String[] res = keyboardRow(arr);
        for(int i=0;i<res.length;i++)
            System.out.println(res[i]);
    }
}
