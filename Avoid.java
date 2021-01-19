public class Avoid {
	public static void main(String[] args) {
		
	}
	public static void search(Node node) {
		if(node == null) {
			return;
		}
		System.out.println(node.name);
		node.isVisited = true;
		for(Node n: node.children) {
			if(n.isVisited == false) {
				search(n);
			}
		}
	}
	public static int sum(TreeNode node, int sum) {
		if(node == null) {
			return 0;
		}
		else if(node.left == null && node.right == null) {
			return node.value + sum;
		}
		return sum(node.left, (node.value+sum)*10) + sum(node.right, (node.value+sum)*10);
	} 
}