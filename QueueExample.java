import java.util.LinkedList;
import java.util.Queue;

public class QueueExample {
	 public static void main(String[] args) {
	        // Creating a queue
	        Queue<Integer> queue = new LinkedList<>();

	        // Inserting elements (enqueue) into the queue
	        queue.add(10);
	        queue.add(20);
	        queue.add(30);
	        queue.add(40);

	        System.out.println("Queue after enqueuing elements: " + queue);

	        // Removing elements (dequeue) from the queue
	        int dequeuedElement = queue.poll();
	        System.out.println("Dequeued element: " + dequeuedElement);
	        System.out.println("Queue after dequeuing element: " + queue);

	 }
}
