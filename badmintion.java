import java.util.Scanner;

public class badmintion {
    public static int[] game(int[] points, int n) {
        int[] otp = new int[n];
        for (int i=0;i<n;i++)
            otp[i] = (points[i]/2)+1;
        return otp;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] points = new int[n];
        for (int i=0;i<n;i++)
            points[i] = sc.nextInt();
        int[] otp = game(points, n);
        for (int a: otp)
            System.out.println(a);
    }
}
