import java.util.Scanner;

import static java.lang.Math.max;

public class EVM {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] arr = new int[n][6];
        for (int i=0;i<n;i++)
            for (int j=0;j<6;j++)
                arr[i][j] = sc.nextInt();
        String[] output = new String[n];
        for (int i=0;i<n;i++) {
            int max = 0, final_max = Integer.MIN_VALUE;
            for (int j = 0; j < 3; j++) {
                max = arr[i][6-j-1] - arr[i][j];
                final_max = Math.max(final_max,max);
            }
            int x = arr[i][0] + arr[i][1]+arr[i][2]+final_max;
            int y = arr[i][3] + arr[i][4]+arr[i][5];
            if (x>y/2)
                output[i] = "Yes";
            else
                output[i] = "No";
        }
        for (String s : output)
            System.out.println(s);
    }
}
