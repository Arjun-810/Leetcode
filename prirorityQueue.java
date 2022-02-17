import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Scanner;

public class prirorityQueue {
    public static void main(String[] args) {
        Queue<Integer> pq = new PriorityQueue<>();
        pq.offer(40);
        pq.offer(12);
        pq.offer(24);
        System.out.println("Prirority queue = " + pq);
    }
}
