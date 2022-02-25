package leetCode;

import java.util.Scanner;

public class areaCircle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        double pi = 3.14;
        double area = pi*n*n;
        System.out.println("Area = " + area);
    }
}
