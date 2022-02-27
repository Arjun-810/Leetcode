package leetCode;

import java.util.Scanner;

public class avgSalary {
    public static double average(int[] salary) {
        double avg=0;
        int max = Integer.MIN_VALUE,min = Integer.MAX_VALUE;
        for (int a:salary){
            avg +=(double) a;
            max = Math.max(max,a);
            min = Math.min(min,a);
        }
        return (avg-max-min)/(salary.length-2);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i=0;i<n;i++)
            arr[i] = sc.nextInt();
        System.out.println(average(arr));
    }
}
