package leetCode;

import java.util.Locale;
import java.util.Scanner;

public class capatilizeTitle {
    public static void toCapatalize(String title) {
        String[] s = title.split(" ");
        title = "";
        for (int i=0;i<s.length;i++){
            String l = "";
            if(s[i].length()<=2)
                l = s[i].toLowerCase();
            else
                l = s[i].substring(0,1).toUpperCase()+s[i].substring(1).toLowerCase();
            if (i!=s.length-1)
                title += l+" ";
            else
                title += l;
        }
        System.out.println(title);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        toCapatalize(s);
    }
}
