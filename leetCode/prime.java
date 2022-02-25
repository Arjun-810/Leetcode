package leetCode;

import java.util.Scanner;

public class prime {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i=2;i<=n;i++){
            int flag = 0;
            for (int j=2;j<=Math.sqrt(i);j++)
                if (i%j==0)
                    flag = 1;
            if (flag == 0)
                System.out.print(i+" ");
        }
    }
}
