import java.util.Arrays;
import java.util.Scanner;

public class infitiq2  {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        String[] str = new String[m];
        for (int i=0;i<m;i++)
            str[i] = sc.next();
        String[] n_count;
        n_count = str[0].split(",");
        int n = n_count.length;
        int[][] arr = new int[m][n];
        for (int i=0;i<m;i++) {
            String[] lineVector = new String[n];
            lineVector = str[i].split(",");
            for (int j=0;j<lineVector.length;j++)
                if (lineVector[j] != null)
                    arr[i][j] = Integer.parseInt(lineVector[j]);
        }
        int[] pq = new int[m*n];
        for (int i=0;i<m*n;i++)
            pq[i] = 0;
        int temparr = 0;
        boolean leftToRight = true;
        int l=0;
        for (int i = 0; i < m; i++) {
            if (leftToRight) {
                for (int j = 0; j < n; j++) {
                    temparr += arr[i][j];
                    int sr = (int)Math.sqrt(temparr);
                    if (sr * sr == temparr){
                       pq[l] = temparr;
                       l++;
                       temparr = 0;
                    }

                }
            } else {
                for (int j = n - 1; j >= 0; j--) {
                    temparr += arr[i][j];
                    int sr = (int)Math.sqrt(temparr);
                    if (sr * sr == temparr){
                        pq[l] = temparr;
                        l++;
                        temparr = 0;
                    }

                }
            }

            leftToRight = !leftToRight;
        }
        Arrays.sort(pq);
        if (pq[m*n-1] == 0)
            System.out.println(-1);
        else
            System.out.println(pq[m*n-1]);

    }
}
