package leetCode;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class WordWithOneOccurence {
    public static int countWords(String[] words1,String[] words2) {
        int n = 0;
        Map<String,Integer> map1 = new HashMap<>();
        for (String a:words1)
            map1.put(a,map1.getOrDefault(a,0)+1);
        Map<String,Integer> map2 = new HashMap<>();
        for (String b:words2)
            map2.put(b,map2.getOrDefault(b,0)+1);
        for (String a:words1)
            if (map2.containsKey(a))
                if (map1.get(a) == 1 && map2.get(a) == 1)
                    n++;
        return n;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String[] str1 = new String[n];
        for (int i=0;i<n;i++)
            str1[i] = sc.next();
        int m = sc.nextInt();
        String[] str2 = new String[m];
        for (int i=0;i<m;i++)
            str2[i] = sc.next();
        System.out.println(countWords(str1,str2));
    }
}
