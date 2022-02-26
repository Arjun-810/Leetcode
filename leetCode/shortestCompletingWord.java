package leetCode;

import java.util.*;

public class shortestCompletingWord {
    public static String srtstCompletingWord(String licensePlate, String[] words) {
        StringBuilder str = new StringBuilder();
        String s = new String();
        String final_string = new String();
        Map<String,Integer> licence = new HashMap<>();
        licensePlate = licensePlate.toLowerCase();
        for (int i=0;i<licensePlate.length();i++)
            if (!((licensePlate.charAt(i) >= 48 && licensePlate.charAt(i) <= 57) || (licensePlate.charAt(i) == 32)))
                if (licence.containsKey(String.valueOf(licensePlate.charAt(i))))
                    licence.computeIfPresent(String.valueOf(licensePlate.charAt(i)), (k, v) -> v + 1);
                else licence.put(String.valueOf(licensePlate.charAt(i)), 1);
        for (int i=0;i<words.length;i++){
            HashMap<String,Integer> temp = new HashMap<>();
            for (int j=0;j<words[i].length();j++){
                words[i] = words[i].toLowerCase();
                if (temp.containsKey(String.valueOf(words[i].charAt(j))))
                    temp.computeIfPresent(String.valueOf(words[i].charAt(j)), (k, v) -> v + 1);
                else temp.put(String.valueOf(words[i].charAt(j)).toLowerCase(), 1);
            }
            int f = 0;
            for (String a:licence.keySet()) {
                if ((temp.containsKey(a) && temp.get(a) >= licence.get(a)))
                    continue;
                else {
                    f = 1;
                    break;
                }
            }

            if (f==0) {
                s = words[i];
                if (final_string.length()==0)
                    final_string =s;
            }
            if (s.length()<final_string.length())
                final_string = s;
        }
        return final_string;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String l = sc.nextLine();
        int n = sc.nextInt();
        String[] arr = new String[n];
        for (int i=0;i<n;i++)
            arr[i] = sc.next();
        String st = srtstCompletingWord(l, arr);
        System.out.println(st);
    }
}
