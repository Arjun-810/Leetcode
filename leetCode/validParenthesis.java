package leetCode;

import java.util.Scanner;
import java.util.Stack;

public class validParenthesis {
    public static boolean isParenthesisValid(String s) {
        Stack<Character> st = new Stack<>();

        for(int i=0;i<s.length();i++)
        {
            char ch = s.charAt(i);
            if(ch == '(' || ch == '{' || ch == '[')
            {
                st.push(ch);
                continue;
            }
            else
            {
                if(st.size() == 0)
                    return false;
                switch(ch){
                    case ')' :
                        if(st.peek() == '(')
                            st.pop();
                        else
                            return false;
                        break;

                    case ']' :
                        if(st.peek() == '[')
                            st.pop();
                        else
                            return false;
                        break;

                    case '}' :
                        if(st.peek() == '{')
                            st.pop();
                        else
                            return false;
                        break;

                }
            }
        }
        if(st.size() == 0)
            return true;
        else
            return false;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        boolean is_valid = isParenthesisValid(str);
        System.out.println(is_valid);
    }
}
