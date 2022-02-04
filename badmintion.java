import java.util.Scanner;

public class badmintion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i=0;i<n;i++) {
            int points = sc.nextInt();
            int a = (points / 2) + 1;
            System.out.println(a);
        }
    }
}
