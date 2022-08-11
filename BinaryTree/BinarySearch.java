import java.util.List;

public class BinarySearch {

	public static void main(String[] args) {
		BinarySearch binaryTree = new BinarySearch();

		Node node = null;

		int[] keys_balanced = {4, 15, 8, 20, 3, 50, 5, 60};
		int[] keys_unbalanced = {10, 2, 3, 4, 5, 6, 11, 12};

		for(var key : keys_balanced) 
			node = binaryTree.insertNode(node, key);

		//binaryTree.inOrderTraversal(node);
		binaryTree.preOrderTraversal(node);

	}

	public Node insertNode(Node root, int key) {

		if(root == null)
			return new Node(key);

		if(key < root.key)
			root.leftChild = insertNode(root.leftChild, key);

		else
			root.rightChild = insertNode(root.rightChild, key);

		return root;

	}

	public void inOrderTraversal(Node node) {

		if (node == null)
			return;

		inOrderTraversal(node.leftChild);

		System.out.println(node.key + " ");

		inOrderTraversal(node.rightChild);
	}

	public void preOrderTraversal(Node node) {
		if (node == null)
			return;

		System.out.println(node.key + " ");

		preOrderTraversal(node.leftChild);

		preOrderTraversal(node.rightChild);
	}

	public void postOrderTraversal(Node node) {
		if (node == null) 
			return;
		
		postOrderTraversal(node.left);

		postOrderTraversal(node.right);

		System.out.println(node.key + " ");
	}

	public class Node {

		int key;
		Node leftChild, rightChild;

		public Node(int item) {
			key = item;
			leftChild = rightChild = null;
		}

		public String toString() {

			return "key: " + key + 
			"\n" + "leftChild: " + leftChild + 
			"\n" + "rightChild: " + rightChild;
		}
	}


	

}