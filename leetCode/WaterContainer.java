package leetCode;

import java.util.Map;
import java.util.Scanner;

public class WaterContainer {
    public static int maxArea(int[] height) {
        int area = 0,temp,i=0,j=height.length-1;
        while(i<j){
            if (height[i]>height[j]){
                temp = height[j]*(j-i);
                j--;
                area = Math.max(area,temp);
            }else {
                temp = height[i]*(j-i);
                i++;
                area = Math.max(area,temp);
            }
        }
        return area;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i=0;i<n;i++)
            arr[i] = sc.nextInt();
        int amt = maxArea(arr);
        System.out.println(amt);
    }
}
