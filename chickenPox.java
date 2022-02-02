import java.util.Scanner;

public class chickenPox {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] arr = new int[n][2];
        for (int i=0;i<n;i++)
            for (int j=0;j<2;j++)
                arr[i][j] = sc.nextInt();
        int[] otp = new int[n];
        for (int i=0;i<n;i++) {
            otp[i] = arr[i][1]*2;
            if(arr[i][0] == arr[i][1])
                otp[i] -= 1;
            else {
                otp[i] += arr[i][0] - arr[i][1];
            }
        }
        for (int a : otp)
            System.out.println(a);

    }
}
