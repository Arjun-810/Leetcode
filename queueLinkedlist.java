import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class queueLinkedlist {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Queue<Integer> queue = new LinkedList<>();
        queue.offer(10);
        queue.offer(20);
        queue.offer(30);
        System.out.println("Queve Linkedlist: "+ queue);
        System.out.println("Peek method = "  + queue.peek());
        System.out.println("Pool method = " + queue.poll());
        System.out.println("queue linked list = " + queue);
    }
}
