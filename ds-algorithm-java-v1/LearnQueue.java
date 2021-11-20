import java.util.Queue;
import java.util.LinkedList;

public class LearnQueue {
    public static void main(String[] args) {
        Queue<String> queue = new LinkedList<String>();

        System.out.println(queue.isEmpty());

        queue.offer("Karen"); //offer to the front of queue
        queue.offer("Chad");
        queue.offer("Kevin");
        queue.offer("Steve");

        System.out.println(queue.isEmpty());
        System.out.println(queue.size()); //length of the queue
        System.out.println(queue.contains("Kevin")); //check is kevin in this queue ? -> true

        System.out.println(queue);
        System.out.println(queue.peek()); //Karen

        queue.poll(); //dequeue your queue
        System.out.println(queue.peek()); //Chad
        System.out.println(queue);
    }
}
