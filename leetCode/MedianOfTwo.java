package leetCode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class MedianOfTwo {
        public static double meadiaArray(int[] num1,int[] num2) {
            double median;
            ArrayList<Integer> merged = new ArrayList<Integer>();
            for (int a:num1)
                merged.add(a);
            for (int a:num2)
                merged.add(a);
            Collections.sort(merged);
            if (merged.size()%2!=0)
                median = (double) merged.get(merged.size()/2);
            else median = (double) (merged.get((merged.size()-1)/2)+(double)merged.get((merged.size())/2))/2;
            return median;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr1 = new int[n];
        for (int i=0;i<n;i++)
            arr1[i] = sc.nextInt();
        int m = sc.nextInt();
        int[] arr2 = new int[m];
        for (int i=0;i<m;i++)
            arr2[i] = sc.nextInt();
        double meadian = meadiaArray(arr1,arr2);
        System.out.println(meadian);
    }
}
