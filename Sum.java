import java.util.*;
public class Sum {
	public static void main(String[] args) {
		TreeNode a = new TreeNode(4);
		TreeNode b = new TreeNode(5);
		a.left = b;
		TreeNode c = new TreeNode(9);
		a.right = c;
		b.left=new TreeNode(1);
		b.right=new TreeNode(1);
		c.left=new TreeNode(1);
		c.right=new TreeNode(1);
		System.out.println(sum(a,0));
	}
	public static int sum(TreeNode node,int s) {
		if(node == null) {
			return 0;
		}
		if(node.left == null && node.right == null) {
			return s+node.value;
		}
		return sum(node.left,(s+node.value)*10)+sum(node.right,(s+node.value)*10);
		
	}
}
class TreeNode {
	int value;
	TreeNode left;
	TreeNode right;
	public TreeNode(int value) {
		this.value = value;
	}
}