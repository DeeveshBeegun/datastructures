public class Node {

	Node next; 
	int data; 

	public Node(int data) {
		this.data = data;
	}

	public void appendToTail(int data) {
		Node node = new Node(data);
		Node n = this; 

		while (n.next != null) {
			n = n.next;
		}

		n.next = node;

	}

	public String toString() {
		return Integer.toString(this.data) + "->" + next;
	}

}