class Node {
  String value;  // value of the node
  Node next;    // reference to the next node

  public Node(String value) {
      this.value = value;
      this.next = null;
  }
}

class LinkedList {
  Node head;  // head of the list

  public LinkedList() {
      this.head = null;
  }

  // Add a new stock (append at the end of the list)
  public void add(String value) {
      Node newNode = new Node(value);
      if (head == null) {
          head = newNode;
      } else {
          Node current = head;
          while (current.next != null) {
              current = current.next;
          }
          current.next = newNode;
      }
  }

  // Delete incorrect stock (remove by value)
  public void delete(String value) {
      Node current = head;
      if (current != null && current.value.equals(value)) {
          head = current.next;
          current = null;
          return;
      }

      Node prev = null;
      while (current != null && !current.value.equals(value)) {
          prev = current;
          current = current.next;
      }

      if (current == null) {
          return;  // value not found
      }

      prev.next = current.next;
      current = null;
  }

  // Search for a stock (check if an item exists in the list)
  public boolean search(String value) {
      Node current = head;
      while (current != null) {
          if (current.value.equals(value)) {
              return true;
          }
          current = current.next;
      }
      return false;
  }

  // Sort the linked list using bubble sort
  public void sort() {
      if (head == null) return;

      boolean swapped;
      do {
          swapped = false;
          Node current = head;
          while (current != null && current.next != null) {
              if (current.value.compareTo(current.next.value) > 0) {
                  // Swap values
                  String temp = current.value;
                  current.value = current.next.value;
                  current.next.value = temp;
                  swapped = true;
              }
              current = current.next;
          }
      } while (swapped);
  }

  // Display the linked list
  public void display() {
      Node current = head;
      while (current != null) {
          System.out.print(current.value + " -> ");
          current = current.next;
      }
      System.out.println("None");
  }

  public static void main(String[] args) {
      // Example usage
      LinkedList inventory = new LinkedList();
      inventory.add("Toyota");
      inventory.add("Honda");
      inventory.add("BMW");
      inventory.add("Ford");

      // Display original inventory
      inventory.display();

      // Add and delete stocks
      inventory.add("Chevrolet");
      inventory.delete("Ford");

      // Search for a stock
      if (inventory.search("Honda")) {
          System.out.println("Honda found in inventory.");
      }

      // Sort and display sorted inventory
      inventory.sort();
      inventory.display();
  }
}
