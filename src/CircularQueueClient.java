public class CircularQueueClient {
    public static void main(String[] args) {
        CircularQueue queue = new CircularQueue();
        queue.enqueue(1);
        queue.enqueue(2);
        queue.enqueue(3);
        queue.enqueue(4);
        queue.enqueue(5);
        queue.displayQueue();
        queue.dequeue();
        queue.dequeue();
        queue.dequeue();
        queue.displayQueue();
        queue.enqueue(6);
        queue.enqueue(7);
        queue.enqueue(8);
        queue.displayQueue();
        queue.dequeue();
        queue.dequeue();
        queue.dequeue();
        queue.dequeue();
        queue.dequeue();
        queue.displayQueue();


    }
}
