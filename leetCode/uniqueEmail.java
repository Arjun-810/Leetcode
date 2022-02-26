package leetCode;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class uniqueEmail {
    public static int numUniqueEmails(String[] emails) {
        int x;
        HashSet<String> set = new HashSet<>();
        for (String s:emails){
            String temp = "";
            if (s.contains("@"))
                temp = s.split("@")[0];
            if (temp.contains("+"))
                temp = s.split("\\+")[0];
            if (temp.contains("."))
                while (temp.contains(".")) {
                    x = temp.indexOf(".");
                    temp = temp.substring(0, x) + temp.substring(x + 1);
                }
            set.add(temp+'@'+s.split("@")[1]);
        }
        return set.size();
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String[] email = new String[n];
        for (int i=0;i<n;i++)
            email[i] = sc.next();
        int x = numUniqueEmails(email);
        System.out.println(x);
    }
}
