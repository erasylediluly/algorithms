import java.util.*;
public class DFS {
	public static void main(String[] args) {
		Node a = new Node("a");
		Node b = new Node("b");
		Node c = new Node("c");
		Node d = new Node("d");
		Node e = new Node("e");
		a.connect(b);
		b.connect(c);
		c.connect(d);
		d.connect(e);
		b.connect(e);
		e.connect(a);
		dfs(a);
		System.out.println();
		bfs(a);
	}
	public static void dfs(Node node) {
		if(node == null) {
			return;
		}
		System.out.print(node.name + " ");
		node.isVisited = true;
		for(Node n: node.children) {
			if(n.isVisited == false) {
				dfs(n);
			}
		}
	}
	public static void bfs(Node node) {
		if(node == null) {
			return;
		}
		for(Node n: node.children) {
			if(n.isVisited == false) {
				System.out.print(n.name+" ");
				n.isVisited=true;
				bfs(n);
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