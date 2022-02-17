package bitManipulation;

import java.util.Scanner;

public class set_bit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of n = ");
        int n = sc.nextInt();
        System.out.print("Enter the value of i = ");
        int i = sc.nextInt();
        int bit_mask = 1<<i-1;
        System.out.println("New no. = "+(bit_mask|n));
    }
}
