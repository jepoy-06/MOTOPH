import java.util.LinkedList;

public class QueueExample {
    
    static class Queue {
        private LinkedList<String> queue;

        // Constructor to initialize the queue
        public Queue() {
            this.queue = new LinkedList<>();
        }

        // Enqueue operation (add an element to the end of the queue)
        public void enqueue(String value) {
            queue.add(value);
        }

        // Dequeue operation (remove and return the front element of the queue)
        public String dequeue() {
            if (isEmpty()) {
                return null;
            }
            return queue.poll();
        }

        // Peek operation (view the front element of the queue without removing it)
        public String peek() {
            if (isEmpty()) {
                return null;
            }
            return queue.peek();
        }

        // Check if the queue is empty
        public boolean isEmpty() {
            return queue.isEmpty();
        }

        // Display the queue
        public void display() {
            System.out.println("Queue: " + queue);
        }
    }

    public static void main(String[] args) {
        // Example usage
        Queue queue = new Queue();
        
        // Enqueue some people into the queue
        queue.enqueue("Person 1");
        queue.enqueue("Person 2");
        queue.enqueue("Person 3");
        
        // Display the queue
        queue.display();
        
        // Peek at the front element
        System.out.println("Front element: " + queue.peek());
        
        // Dequeue an element
        System.out.println("Dequeued element: " + queue.dequeue());
        
        // Display the queue after dequeue
        queue.display();
    }
}


Queue: [Person 1, Person 2, Person 3]
Front element: Person 1
Dequeued element: Person 1
Queue: [Person 2, Person 3]
