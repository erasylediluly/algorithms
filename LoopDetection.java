public class LoopDetection {
	public static void main(String[] args) {
		Node a = new Node(3);
		Node b = new Node(2);
		a.next = b;
		Node c = new Node(0);
		b.next = c;
		Node d = new Node(-4);
		c.next = d;
		//d.next = b;
		//d.next.next = c;
		//d.next.next.next = d;
		System.out.println(hasCycle(a));
	}
	public static boolean hasCycle(Node head) {
		Node slow = head;
		Node fast = head;
		while(fast != null && fast.next != null) {
			slow = slow.next;
			fast = fast.next.next;
			if(fast == slow) {
				return true;
			}
		}
		return false;
	}
}