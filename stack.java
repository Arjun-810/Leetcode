import java.util.Scanner;
import java.util.Stack;

public class stack {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Stack<Integer> st = new Stack<>();
        st.push(10);
        st.push(20);
        st.push(30);
        System.out.println("Stack : " + st);
        System.out.println("Stack : " + st.peek());
        st.pop();
        System.out.println("Stack : " + st);
        st.empty();
        System.out.println("Stack : " + st.empty());
        System.out.println(st.search(10));
    }
}
