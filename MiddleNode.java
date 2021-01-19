public class MiddleNode {
	public static void main(String[] args) {
		Node a = new Node(1);
		Node b = new Node(2);
		a.next=b;
		Node c = new Node(3);
		b.next=c;
		Node d = new Node(4);
		c.next=d;
		Node e = new Node(5);
		d.next=e;
		Node f = new Node(6);	
		e.next=f;
		printLL(middleNode(a));
	}
	public static Node middleNode(Node head){
 		Node slow = head;
 		Node fast = head;
 		Node prev = null;
 		do{
 			System.out.println(slow+","+fast);
 			fast = fast.next.next;
 			prev = slow;
 			slow = slow.next;
 			System.out.println(slow+","+fast);
 		}
 		while(fast!=null && fast.next != null);
 		prev.next = slow.next;
 		return head;
 	}
 	public static void printLL(Node head) {
 		Node current = head;
 		while(current != null) {
 			System.out.print(current.value+" ");
 			current = current.next;
 		}
 	} 
}
class Node{
 		int value;
 		Node next;
 		public Node(int value){
 			this.value = value;
 		}
 		public String toString() {
 			return this.value+"";
 		}
 	}