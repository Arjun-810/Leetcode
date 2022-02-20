package leetCode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class minIdxSum {
    public static String[] minIndxSum(String[] list1, String[] list2) {
        Map<String, Integer> hm = new HashMap<String,Integer>();
        ArrayList res = new ArrayList<>();
        int min = Integer.MAX_VALUE;
        for (int i=0;i<list1.length;i++)hm.put(list1[i],i);
        for (int i=0;i< list2.length;i++){
            if (!hm.containsKey(list2[i]) || i+hm.get(list2[i])>min)continue;
            if (i+hm.get(list2[i])>min){
                min = i+hm.get(list2[i]);
            }
            res.add(list2[i]);

        }
        return (String[]) res.toArray(new String[0]);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(),m = sc.nextInt();
        String[] arr1 = new String[n];
        String[] arr2 = new String[m];
        for (int i=0;i<n;i++)
            arr1[i] = sc.nextLine();
        for (int i=0;i<m;i++)
            arr2[i] = sc.nextLine();
        System.out.println("Idx = " + minIndxSum(arr1,arr2)[0]);
    }
}
