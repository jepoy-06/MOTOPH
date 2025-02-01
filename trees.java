class Node {
  int value;
  Node left, right;

  public Node(int value) {
      this.value = value;
      this.left = null;
      this.right = null;
  }
}

class BinaryTree {
  Node root;

  public BinaryTree(int rootValue) {
      root = new Node(rootValue);
  }

  // Insert a new node into the binary tree
  public void insert(int value) {
      insertHelper(root, value);
  }

  private void insertHelper(Node currentNode, int value) {
      if (value < currentNode.value) {
          if (currentNode.left == null) {
              currentNode.left = new Node(value);
          } else {
              insertHelper(currentNode.left, value);
          }
      } else {
          if (currentNode.right == null) {
              currentNode.right = new Node(value);
          } else {
              insertHelper(currentNode.right, value);
          }
      }
  }

  // In-order traversal (Left, Root, Right)
  public void inOrder() {
      inOrderHelper(root);
  }

  private void inOrderHelper(Node currentNode) {
      if (currentNode != null) {
          inOrderHelper(currentNode.left);
          System.out.print(currentNode.value + " ");
          inOrderHelper(currentNode.right);
      }
  }

  public static void main(String[] args) {
      // Example Usage
      BinaryTree tree = new BinaryTree(10);
      tree.insert(5);
      tree.insert(15);
      tree.insert(3);
      tree.insert(7);

      System.out.print("In-order Traversal: ");
      tree.inOrder();  // Should print the elements in sorted order
  }
}

In-order Traversal: 3 5 7 10 15 
