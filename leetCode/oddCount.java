package leetCode;

import java.util.Scanner;

public class oddCount {
    public static int countOdds(int low, int high) {
        int i=0;
        if (low%2==0)
            low++;
        while (low<=high){
            low+=2;
            i++;
        }
        return i;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int low = sc.nextInt();
        int heigh = sc.nextInt();
        System.out.println(countOdds(low,heigh));
    }
}
