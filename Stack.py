class Stack:
    def __init__(self):
        self.stack = []  # Initialize an empty list to represent the stack

    # Push operation (add an element to the top of the stack)
    def push(self, value):
        self.stack.append(value)

    # Pop operation (remove and return the top element of the stack)
    def pop(self):
        if self.is_empty():
            return None
        return self.stack.pop()

    # Peek operation (view the top element of the stack without removing it)
    def peek(self):
        if self.is_empty():
            return None
        return self.stack[-1]

    # Check if the stack is empty
    def is_empty(self):
        return len(self.stack) == 0

    # Display the stack
    def display(self):
        print("Stack:", self.stack)

# Example usage
stack = Stack()
stack.push("Plate 1")
stack.push("Plate 2")
stack.push("Plate 3")

stack.display()

# Peek at the top element
print("Top element:", stack.peek())

# Pop an element
print("Popped element:", stack.pop())

stack.display()
