package leetCode;

import java.math.BigInteger;
import java.util.*;
import java.util.stream.Collectors;

public class advantage4 {

    public static long reverseBits(long n)
    {
        long num = n, n1;
        long reverse = 0;
        n1 = num;
        while (n1 > 0) {
            reverse <<= 1;
            if ((n1 & 1) == 1)
                reverse ^= 1;
            n1 >>= 1;
        }

        // required number
        return reverse;
    }

    public static int solve(int Q, List<List<Integer>> queries) {
        int count = 0;
        for (int i=0;i<Q;i++)
            for (double j = Math.pow(2,queries.get(i).get(0))+1; j < Math.pow(2,queries.get(i).get(1)) ; j++) {
                if (reverseBits((long)(j))==j)
                    count++;
            }
        return count;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int Q = Integer.parseInt(sc.nextLine().trim());
        List<List<Integer>> queries = new ArrayList<>(Q);
        for (int i = 0; i < Q; i++) {
            queries.add(Arrays.asList(sc.nextLine().trim().split(" ")).stream().map(s->Integer.parseInt(s)).collect(Collectors.toList()));
        }
        int res= solve(Q,queries);
        System.out.println(res);
    }
}
