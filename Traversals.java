public class Traversals {
	public static void main(String[] args) {
		TreeNode root = new TreeNode(0);
		TreeNode left = new TreeNode(1);
		root.left = left;
		TreeNode right = new TreeNode(2);
		root.right = right;
		TreeNode leftleft = new TreeNode(3);
		left.left = leftleft;
		TreeNode rightright = new TreeNode(4);
		right.right = rightright;
		TreeNode rightleft = new TreeNode(5);
		right.left = rightleft;
		TreeNode leftright = new TreeNode(6);
		left.right = leftright;
		preOrder(root);
		System.out.println();
		inOrder(root);
		System.out.println();
		postOrder(root);
		/*
			--------0-------
			------/---\------
			-----1-----2-----
			----/-\---/-\----
			---3---6-5---4---

		*/
	}
	public static void preOrder(TreeNode root) {
		if(root != null) {
			visit(root);
			preOrder(root.left);
			preOrder(root.right);
		}
	} 
	public static void inOrder(TreeNode root) {
		if(root != null){
			inOrder(root.left);
			visit(root);
			inOrder(root.right);
		}
	} 
	public static void postOrder(TreeNode root) {
		if(root != null){
			postOrder(root.left);
			postOrder(root.right);
			visit(root);
		}
	}
	public static void visit(TreeNode node) {
		System.out.print(node.val + " ");
	}
}
class TreeNode {
	int val;
	TreeNode left;
	TreeNode right;
	public TreeNode(int x){
		this.val = x;
	}
}