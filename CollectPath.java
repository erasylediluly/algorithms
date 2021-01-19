import java.util.*;
public class CollectPath {
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
		int[] path = new int[1000];
		collect(root,path,0);
		/*
			     0
			   /   \
			  1     2
			 / \   / \
			3   6 5   4
		*/
	}
	public static void collect(TreeNode node,int[] path, int pathlen) {
		if(node == null) {
			return;
		}
		path[pathlen] = node.value;
		pathlen++;
		if(node.left == null && node.right == null) {
			print(path, pathlen);
		}
		else{
			collect(node.left,path,pathlen);
			collect(node.right,path,pathlen);
		}
	}
	public static void print(int[] path, int pathlen) {
		for(int i = 0; i < pathlen; i++) {
			System.out.print(path[i] + " ");
		}
		System.out.println();
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