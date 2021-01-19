import java.util.*;
public class AvoidInfinity {
	public static void main(String[] args) {
		Node a = new Node("a");
		Node b = new Node("b");
		Node c = new Node("c");
		Node d = new Node("d");
		Node e = new Node("e");
		a.connect(b);
		a.connect(c);
		a.connect(d);
		a.connect(e);
		c.connect(e);
		b.connect(new Node("null"));
		e.connect(new Node("null"));
		d.connect(new Node("null"));
		/*
			 a
		   / \ \ 
		  b   c d
		     /
		    e
		*/
		ArrayList<String> list = new ArrayList<>();
		search(a, list);
	}
	public static void search(Node node, ArrayList<String> arr) {
		if((node.name).equals("null")) {
			System.out.println();
			System.out.println(arr);
			arr = new ArrayList<>();
			return;	
		}
		System.out.print(node.name + " ");
		node.isVisited = true;
		for(Node n: node.children) {
			if(n.isVisited == false) {
				arr.add(node.name);
				search(n,arr);
			}		
		}
	}
}
class Node {
	String name;
	ArrayList<Node> children;
	boolean isVisited;
	public Node(String name) {
		this.name = name;
		children = new ArrayList<>();
		isVisited = false;
	}
	public void connect(Node n) {
		n.children.add(this);
		this.children.add(n);
	}
}