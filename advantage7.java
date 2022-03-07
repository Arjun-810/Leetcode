package leetCode;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class advantage7 {
    public static int solve(int N,int K, List<Integer> A) {
        if (N==1 && K==1)
            return 0;
        for (int i=1;i<=K;i++)
            if (!A.contains(i))
                return -1;
        int res = Integer.MAX_VALUE;
        List<Integer> B = new ArrayList<>();
        for (int i=0;i<K;i++)
            B.addAll(A);
        int idx = A.indexOf(1);
        while (idx != -1){
            int f=2, p=Integer.MAX_VALUE;
            for (int i=idx+1;i<B.size();i++){
                if (f==B.get(i)) {
                    if (f==K) {
                        p = i;
                        break;
                    }
                    else f++;
                }
            }
            int c=-1;
            res = Math.min(p-idx,res);
            for (int i=idx+1;i<B.size();i++) {
                if (B.get(i) == 1) {
                    c = i;
                    break;
                }
            }
            idx = c;
        }
        return res;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = Integer.parseInt(sc.nextLine().trim());
        int K = Integer.parseInt(sc.nextLine().trim());
        List<Integer> D = new ArrayList<>(N);
        for (int j=0;j<N;j++)
            D.add(Integer.parseInt(sc.nextLine().trim()));
        int res = solve(N,K,D);
        System.out.println(res);
    }
}
