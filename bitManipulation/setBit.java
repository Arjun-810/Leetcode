package bitManipulation;

import java.util.Scanner;

public class setBit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of n = ");
        int n = sc.nextInt();
        System.out.print("Enter the value of i = ");
        int i = sc.nextInt();
        int bit_mask = 1<<i-1;
        if((bit_mask & n) == 1)
            System.out.println("Bit was one");
        else
            System.out.println("Bit was zero");

    }
}
