package leetCode;

import java.util.Scanner;

public class crawlerLogFolder {
    public static int minOperations(String[] logs) {
        int op = 0;
        for (String a:logs){
            if (a.equals("./"))
                continue;
            else if (a.equals("../") && op>0)
                op--;
            else if (!(a.equals("../")))
                op++;
        }
        return op;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String[] arr = new String[n];
        for (int i=0;i<n;i++)
            arr[i] = sc.next();
        int op = minOperations(arr);
        System.out.println(op);
    }
}
