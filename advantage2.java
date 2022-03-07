package leetCode;

import java.util.*;
import java.util.stream.Collectors;

public class advantage2 {
    public static boolean isValid(char[] s) {
        Stack<Character> stack = new Stack<Character>();
        for (char c : s) {
            switch(c) {
                case '0':
                    if (stack.isEmpty() || stack.pop() != '1') return false;
                    break;
                default:
                    stack.push(c);
                    break;
            }
        }

        return stack.isEmpty();
    }
    public static int solve(int N,List<Integer> A,int Q, List<List<Integer>> queries) {
        int score=0;
        for (int i=0;i<queries.size();i++){
            if (queries.get(i).get(0) == 1){
                A.set(queries.get(i).get(1)-1,queries.get(i).get(2));
            }
            if (queries.get(i).get(0) == 2) {
                for (int x=queries.get(i).get(1) - 1;x<=queries.get(i).get(2) - 1;x++){
                    int a = A.get(x);
                    String temp = Integer.toBinaryString(a);
                    char[] t = temp.toCharArray();
                    boolean check = isValid(t);
                    System.out.println(check);
                    if (check)
                        score++;
                }
            }
        }
        return score;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = Integer.parseInt(sc.nextLine().trim());
        List<Integer> A= new ArrayList<>(N);
        for (int i=0;i<N;i++)
            A.add(Integer.parseInt(sc.nextLine().trim()));
        int Q = Integer.parseInt(sc.nextLine().trim());
        List<List<Integer>> queries = new ArrayList<>(Q);
        for (int i=0;i<Q;i++)
            queries.add(Arrays.asList(sc.nextLine().trim().split(" ")).stream().map(s->Integer.parseInt(s)).collect(Collectors.toList()));
        int res = solve(N,A,Q,queries);
        System.out.println(res);
    }
}
