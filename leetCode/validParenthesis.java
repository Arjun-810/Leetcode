package leetCode;

import java.util.Scanner;
import java.util.Stack;

public class validParenthesis {
    public static boolean isParenthesisValid(String s) {
        Stack<String> stack = new Stack<>();
        for (int i=0;i<s.length();i++){
            if (s.charAt(i) == '['||s.charAt(i) == '{'||s.charAt(i) == '(')
                stack.push(String.valueOf(s.charAt(i)));
            else if ((s.charAt(i) == ']' && stack.peek().equals("[")) || (s.charAt(i) == ')' && stack.peek().equals("(")) || (s.charAt(i) == '}' && stack.peek().equals("{")))
                    stack.pop();
                else return false;
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        boolean is_valid = isParenthesisValid(str);
        System.out.println(is_valid);
    }
}
