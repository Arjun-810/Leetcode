package leetCode;

import java.util.Scanner;

public class RomanTOInteger {
    public static void romanTOInteger(String s) {
        int final_values = 0;
        int[] values = new int[s.length()];
        for (int i=0;i<s.length();i++){
            char x = s.charAt(i);
            switch (x){
                case 'I':
                    values[i] = 1;
                    break;
                case 'V':
                    values[i] = 5;
                    break;
                case 'X':
                    values[i] = 10;
                    break;
                case 'L':
                    values[i] = 50;
                    break;
                case 'C':
                    values[i] = 100;
                    break;
                case 'D':
                    values[i] = 500;
                    break;
                case 'M':
                    values[i] = 1000;
                    break;
            }
        }
        for (int i=0;i<values.length-1;i++)
            if(values[i]<values[i+1])
                final_values -= values[i];
            else
                final_values += values[i];
        final_values += values[values.length-1];
        System.out.println(final_values);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        romanTOInteger(str);
    }
}
