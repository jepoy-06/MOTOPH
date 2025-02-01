import java.util.Stack;

public class StackExample {
    
    // A Stack class using Java's built-in Stack data structure
    static class Stack {
        private java.util.Stack<String> stack;

        // Constructor to initialize the stack
        public Stack() {
            this.stack = new java.util.Stack<>();
        }

        // Push operation (add an element to the top of the stack)
        public void push(String value) {
            stack.push(value);
        }

        // Pop operation (remove and return the top element of the stack)
        public String pop() {
            if (isEmpty()) {
                return null;
            }
            return stack.pop();
        }

        // Peek operation (view the top element of the stack without removing it)
        public String peek() {
            if (isEmpty()) {
                return null;
            }
            return stack.peek();
        }

        // Check if the stack is empty
        public boolean isEmpty() {
            return stack.isEmpty();
        }

        // Display the stack
        public void display() {
            System.out.println("Stack: " + stack);
        }
    }

    public static void main(String[] args) {
        // Example usage
        Stack stack = new Stack();
        
        // Push some plates onto the stack
        stack.push("Plate 1");
        stack.push("Plate 2");
        stack.push("Plate 3");
        
        // Display the stack
        stack.display();
        
        // Peek at the top element
        System.out.println("Top element: " + stack.peek());
        
        // Pop an element
        System.out.println("Popped element: " + stack.pop());
        
        // Display the stack after popping
        stack.display();
    }
}


Stack: [Plate 1, Plate 2, Plate 3]
Top element: Plate 3
Popped element: Plate 3
Stack: [Plate 1, Plate 2]
