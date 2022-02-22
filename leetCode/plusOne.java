package leetCode;

import java.util.Scanner;

public class plusOne {
    public static int[] plusOneArray(int[] digits) {
        digits[digits.length-1]++;
        int i;
        for (i = digits.length-1;i>0;i--){
            if (digits[i]>=10){
                digits[i] = 0;
                digits[i-1]++;
            }
        }
        if (digits[0]>=10){
            int[] arr = new int[digits.length+1];
            arr[0] = 1;
            for (int a=1;a<digits.length;a++)
                arr[a] = digits[a];
            return arr;
        }
        return digits;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i=0;i<n;i++)
            arr[i] = sc.nextInt();
        int[] res = plusOneArray(arr);
        for (int a:res)
            System.out.println(a);
    }
}
