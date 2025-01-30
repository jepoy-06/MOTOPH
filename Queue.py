from collections import deque

class Queue:
    def __init__(self):
        self.queue = deque()  # Initialize an empty deque to represent the queue

    # Enqueue operation (add an element to the end of the queue)
    def enqueue(self, value):
        self.queue.append(value)

    # Dequeue operation (remove and return the front element of the queue)
    def dequeue(self):
        if self.is_empty():
            return None
        return self.queue.popleft()

    # Peek operation (view the front element of the queue without removing it)
    def peek(self):
        if self.is_empty():
            return None
        return self.queue[0]

    # Check if the queue is empty
    def is_empty(self):
        return len(self.queue) == 0

    # Display the queue
    def display(self):
        print("Queue:", list(self.queue))

# Example usage
queue = Queue()
queue.enqueue("Person 1")
queue.enqueue("Person 2")
queue.enqueue("Person 3")

queue.display()

# Peek at the front element
print("Front element:", queue.peek())

# Dequeue an element
print("Dequeued element:", queue.dequeue())

queue.display()
