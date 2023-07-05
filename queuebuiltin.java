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
        //|karen|chad|steve|harold
        queue.poll();
        //chad|steve|harold
        System.out.println(queue.peek());
        queue.poll();
        //steve|harold
        System.out.println(queue.peek());
        queue.poll();
        //harold
        System.out.println(queue.isEmpty());//False
        System.out.println(queue.contains("Harold"));//true
        System.out.println(queue.size());//1
        queue.poll();
        //|empty queue|
        System.out.println(queue.isEmpty());//True
    }
}
