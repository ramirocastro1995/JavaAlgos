package JavaAlgos;

import java.util.LinkedList;
import java.util.Queue;

public class queuebuiltin {
    public static void main(String[] args) {
        //add == enqueue/ offer()
        //remove = dequeue, poll()
        Queue<String> queue = new LinkedList<String>();
        queue.offer("Karen");
        queue.offer("Chad");
        queue.offer("Steve");
        queue.offer("Harold");
        System.out.println(queue.peek());
        queue.poll();
        System.out.println(queue.peek());
    }
}
