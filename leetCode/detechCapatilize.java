package leetCode;

import java.util.Locale;
import java.util.Scanner;

public class detechCapatilize {
    public static void detect(String word) {
        System.out.println((word.substring(0,1).toUpperCase()+word.substring(1).toLowerCase()));
        if(word == word.toUpperCase() || word == word.toLowerCase() || word.equals((word.substring(0,1).toUpperCase()+word.substring(1).toLowerCase())))
            System.out.println(true);
        else System.out.println(false);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        detect(s);
    }
}
