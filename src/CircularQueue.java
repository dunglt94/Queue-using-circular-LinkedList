public class CircularQueue {
    private Node front;
    private Node rear;

    public class Node {
        private int data;
        private Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }


    }

    public CircularQueue() {
        front = null;
        rear = null;
    }

    public void enqueue(int data) {
        Node newNode = new Node(data);
        if (front == null) {
            front = newNode;
        } else {
            rear.next = newNode;
        }
        rear = newNode;
        rear.next = front;
    }

    public void  dequeue() {
        if (front == null) {
            System.out.println("Queue is empty");
        }

        if (front == rear) {
            front = rear = null;
        } else {
            front = front.next;
            rear.next = front;
        }
    }

    public void displayQueue() {
        if (front == null) {
            System.out.println("Queue is empty");
        } else {
            Node current = front;
            System.out.print("Queue: ");
            do {
                System.out.print(current.data + " ");
                current = current.next;
            } while (current != front);
            System.out.println();
        }
    }
}
