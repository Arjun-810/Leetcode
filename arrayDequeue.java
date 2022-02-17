import java.util.ArrayDeque;
import java.util.Queue;
import java.util.Scanner;

public class arrayDequeue {
    public static void main(String[] args) {
        ArrayDeque<Integer> adq = new ArrayDeque<>();
        System.out.println("TO add elements:");
        adq.offer(10);
        adq.offerFirst(20);
        adq.offerLast(30);
        System.out.println("Array dequeue = " + adq);
        System.out.println("To get elements:");
        System.out.println("Array dqueue = " + adq.peek());
        System.out.println("Array dqueue = " + adq.peekFirst());
        System.out.println("Array dqueue = " + adq.peekLast());
        System.out.println("To remove:");
        adq.poll();
        System.out.println(adq);
        adq.pollLast();
        System.out.println(adq);

    }
}
