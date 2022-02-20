package leetCode;

import java.util.Arrays;
import java.util.Scanner;

public class goodTriplet {
    public static int noGoodTriplet(int[] num1,int[] num2) {
        int c = 0;
        for (int i=0;i<num1.length-2;i++){
            for (int j=i+1;j<num1.length-1;j++){
                for (int k=j+1;k<num1.length;k++){
                    int x = -1,y=-1,z=-1;
                    for(int p = 0;p< num2.length;p++) {
                        if (num2[p]==num1[i]) x = p;
                        if(num2[p]==num1[j])y=p;
                        if(num2[p]==num1[k])z=p;
                        if (x<y && y<z || x!=-1) {
//                            System.out.println(x+" " + y + " "+ z);
                            c++;
                            break;
                        }
                    }
                }
            }
        }
        return c;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr1 = new int[n];
        int[] arr2 = new int[n];
        for (int i=0;i<n;i++)
            arr1[i] = sc.nextInt();
        for (int i=0;i<n;i++)
            arr2[i] = sc.nextInt();
        int x = noGoodTriplet(arr1,arr2);
        System.out.println(x);
    }
}
