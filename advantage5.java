package leetCode;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class advantage5 {
    public static int numberOfOvertake(int N,int T,List<Integer> D,List<Integer> V) {
        int n=0;
        for (int i=0;i<N;i++)
            V.set(i,V.get(i)*T+D.get(i));
        for (int i=0;i<N;i++)
            for (int j=i+1;j<N;j++){
                if (D.get(i) < D.get(j) && V.get(i) > V.get(j))
                    n+=1;
            }
        return n;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine().trim());
        int t = Integer.parseInt(sc.nextLine().trim());
        List<Integer> D = new ArrayList<>(n);
        for (int j=0;j<n;j++)
            D.add(Integer.parseInt(sc.nextLine().trim()));
        List<Integer> V = new ArrayList<>(n);
        for (int j=0;j<n;j++)
            V.add(Integer.parseInt(sc.nextLine().trim()));
        int res = numberOfOvertake(n,t,D,V);
        System.out.println(res);
    }
}
