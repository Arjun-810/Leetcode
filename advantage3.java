package leetCode;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class advantage3 {
    public static int funCall(int N,List<Integer> A,List<Integer> B) {
        int sum = 0;
        for (int i = N-1; i >0 ; i--) {
            int max = Integer.MIN_VALUE;
            for (int j = i-1; j >=0 ; j--) {
                if (A.get(j)<A.get(i) &&  B.get(j)<B.get(i))
                    max = Math.max(B.get(j),max);
            }
            if (max!=Integer.MIN_VALUE)
                sum+=max;
        }
        return sum;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine().trim());
        List<Integer> A = new ArrayList<>(n);
        for (int i = 0; i < n; i++) {
            A.add(Integer.parseInt(sc.nextLine().trim()));
        }
        List<Integer> B = new ArrayList<>(n);
        for (int i = 0; i < n; i++) {
            B.add(Integer.parseInt(sc.nextLine().trim()));
        }
        int res = funCall(n,A,B);
        System.out.println(res);
    }
}
