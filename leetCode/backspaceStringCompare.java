package leetCode;

import java.util.Scanner;
import java.util.Stack;

public class backspaceStringCompare {
        public static String comp(String str) {
            Stack<Character> s = new Stack<>();
            for (char c:str.toCharArray()){
                if (c!='#')
                    s.push(c);
                else {
                    if (!s.empty())
                        s.pop();
                }
            }
            return String.valueOf(s);
        }
    public static boolean backspaceCompare(String s, String t) {
//        while (s.contains("#")) {
//            if (s.indexOf("#") == 0)
//                s = s.substring(1);
//            else
//                s = s.substring(0, s.indexOf("#") - 1) + s.substring(s.indexOf("#") + 1);
//        }
//        while (t.contains("#")) {
//            if (t.indexOf("#") == 0)
//                t = t.substring(1);
//            else
//                t = t.substring(0, t.indexOf("#") - 1) + t.substring(t.indexOf("#") + 1);
//        }
//        return s.equals(t);

        //2nd Approach
        return comp(s).equals(comp(t));
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str1 = sc.next();
        String str2 = sc.next();
        boolean is_equal = backspaceCompare(str1,str2);
        System.out.println(is_equal);
    }
}
