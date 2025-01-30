class Node:
    def __init__(self, value):
        self.value = value  # value of the node
        self.next = None    # reference to the next node

class LinkedList:
    def __init__(self):
        self.head = None    # head of the list

    # Add a new stock (append at the end of the list)
    def add(self, value):
        new_node = Node(value)
        if not self.head:
            self.head = new_node
        else:
            current = self.head
            while current.next:
                current = current.next
            current.next = new_node

    # Delete incorrect stock (remove by value)
    def delete(self, value):
        current = self.head
        if current and current.value == value:
            self.head = current.next
            current = None
            return
        prev = None
        while current and current.value != value:
            prev = current
            current = current.next
        if current is None:
            return
        prev.next = current.next
        current = None

    # Search for a stock (check if an item exists in the list)
    def search(self, value):
        current = self.head
        while current:
            if current.value == value:
                return True
            current = current.next
        return False

    # Sort the linked list using bubble sort
    def sort(self):
        if self.head is None:
            return
        current = self.head
        while current:
            next_node = current.next
            while next_node:
                if current.value > next_node.value:
                    current.value, next_node.value = next_node.value, current.value
                next_node = next_node.next
            current = current.next

    # Display the linked list
    def display(self):
        current = self.head
        while current:
            print(current.value, end=" -> ")
            current = current.next
        print("None")

# Example usage
inventory = LinkedList()
inventory.add("Toyota")
inventory.add("Honda")
inventory.add("BMW")
inventory.add("Ford")

# Display original inventory
inventory.display()

# Add and delete stocks
inventory.add("Chevrolet")
inventory.delete("Ford")

# Search for a stock
if inventory.search("Honda"):
    print("Honda found in inventory.")

# Sort and display sorted inventory
inventory.sort()
inventory.display()
