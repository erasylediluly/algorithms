import java.util.*;
public class IsComplete {
	public static void main(String[] args) {
		TreeNode root = new TreeNode(0);
		TreeNode left = new TreeNode(1);
		root.left = left;
		TreeNode right = new TreeNode(2);
		root.right = right;
		TreeNode leftleft = new TreeNode(3);
		left.left = leftleft;/*
		TreeNode rightright = new TreeNode(4);
		right.right = rightright;
*/		TreeNode rightleft = new TreeNode(5);
		right.left = rightleft;
		TreeNode leftright = new TreeNode(6);
		left.right = leftright;
		isComplete(root);
	}
	public static boolean isComplete(TreeNode root) {
		ArrayList<Integer> list = levelOrder(root);
		for(int i = 0; i < list.size(); i++) {
			if(list.get(i) == null && list.get(i+1) != null) {
				return false;
			}
		}
		return true;
	}
	public static int maxDepth(TreeNode root) {
		if(root == null) {
			return 0;
		}
		return Math.max(maxDepth(root.left),maxDepth(root.right))+1;
	}
	public static ArrayList<Integer> getLevel(TreeNode root, int level, ArrayList<Integer> list) {
		if(root == null) {
			list.add(null);
			return new ArrayList<Integer>();
		}
		if(level == 1) {
			list.add(root.value);
		}
		else if(level > 1) {
			getLevel(root.left, level-1,list);
			getLevel(root.right, level-1,list);
		}
		return list;
	}
	public static ArrayList<Integer> levelOrder(TreeNode root) {
		ArrayList<Integer> result = new ArrayList<>();
		int depth = maxDepth(root);
		for(int i = 1; i <=depth; i++) {
			ArrayList<Integer> temp = getLevel(root,i,new ArrayList<Integer>());
			for(int j = 0; j < temp.size(); j++) {
				result.add(temp.get(j));
			}
		}
		return result;
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