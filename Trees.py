class Node:
    def __init__(self, value):
        self.value = value
        self.left = None
        self.right = None

class BinaryTree:
    def __init__(self, root_value):
        self.root = Node(root_value)

    # Insert a new node into the binary tree
    def insert(self, value):
        self._insert_helper(self.root, value)

    def _insert_helper(self, current_node, value):
        if value < current_node.value:
            if current_node.left is None:
                current_node.left = Node(value)
            else:
                self._insert_helper(current_node.left, value)
        else:
            if current_node.right is None:
                current_node.right = Node(value)
            else:
                self._insert_helper(current_node.right, value)

    # In-order traversal (Left, Root, Right)
    def in_order(self):
        return self._in_order_helper(self.root)

    def _in_order_helper(self, current_node):
        if current_node is None:
            return []
        return self._in_order_helper(current_node.left) + [current_node.value] + self._in_order_helper(current_node.right)

# Example Usage
tree = BinaryTree(10)
tree.insert(5)
tree.insert(15)
tree.insert(3)
tree.insert(7)

print("In-order Traversal:", tree.in_order())  # Should print the elements in sorted order
