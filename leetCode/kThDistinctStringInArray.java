package leetCode;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class kThDistinctStringInArray {
    public static String kthDistinct(String[] arr, int k) {
        Map<String,Integer> map = new HashMap<>();
        for (String ar:arr)
            map.put(ar, map.getOrDefault(ar,0)+1);
        for (int i=0;i< arr.length;i++)
            if (map.get(arr[i])==1 && --k==0)
                return arr[i];
        return "";
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String[] str = new String[n];
        for (int i=0;i<n;i++)
            str[i] = sc.next();
        int k = sc.nextInt();
        System.out.println(kthDistinct(str,k));
    }
}
