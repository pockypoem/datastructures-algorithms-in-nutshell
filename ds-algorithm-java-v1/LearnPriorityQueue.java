import java.util.Queue;
import java.util.Collections;
// import java.util.LinkedList;
import java.util.PriorityQueue;

public class LearnPriorityQueue {
    public static void main(String[] args) {
        //String
        Queue <String> queue = new PriorityQueue<>(Collections.reverseOrder());

        queue.offer("B");
        queue.offer("C");
        queue.offer("A");
        queue.offer("F");
        queue.offer("D");

        while(!queue.isEmpty()) {
            System.out.println(queue.poll());
        }

        //Double:
        // Queue <Double> queue = new PriorityQueue<>(Collections.reverseOrder());

        // queue.offer(3.0);
        // queue.offer(2.5);
        // queue.offer(4.0);
        // queue.offer(1.5);
        // queue.offer(2.0);

        // while(!queue.isEmpty()) {
        //     System.out.println(queue.poll());
        // }
    }
}
