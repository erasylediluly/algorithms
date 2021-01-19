public class ReverseLL {
	public static void main(String[] args) {
		Node a = new Node(1);
		Node b = new Node(2);
		a.next = b; 
		Node c = new Node(3);
		b.next = c;
		Node d = new Node(4);
		c.next = d;
		Node e = new Node(5);
		d.next = e;
		printLL(reverseLL(a));
	}
	public static Node reverseLL(Node head) {
		Node prev = new Node(0);
		Node current = head;
		prev.next = head;
		while(current != null && current.next != null) {
			Node temp = prev.next;
			prev.next = current.next;
			current.next = current.next.next;
			prev.next.next = temp;
			printLL(prev);
			System.out.println();
		}
		return prev.next;
	}
	public static void printLL(Node head) {
		Node current = head;
		while(current != null) {
			System.out.print(current.value + " ");
			current = current.next;
		}
	}
}
class Node {
	int value;
	Node next;
	public Node(int value) {
		this.value = value;
	}
}