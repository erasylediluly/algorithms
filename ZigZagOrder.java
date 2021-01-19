import java.util.*;
public class ZigZagOrder {
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
		System.out.println(zigZagOrder(root));
	}
	public static ArrayList<Integer> getLevel(TreeNode root, int level, int l,ArrayList<Integer> list) {
		if(root == null) {
			return new ArrayList<Integer>();
		}
		if(level == 1) {
			list.add(root.value);
		}
		else if(level > 1 && l % 2 == 0) {
			getLevel(root.right, level-1,l,list);
			getLevel(root.left, level-1,l,list);
		}
		else if(level > 1 && l % 2 == 1) {
			getLevel(root.left, level-1,l,list);
			getLevel(root.right, level-1,l,list);
		}
		return list;
	}
	public static int maxDepth(TreeNode root) {
		if(root == null) {
			return 0;
		}
		return Math.max(maxDepth(root.left),maxDepth(root.right))+1;
	}
	public static ArrayList<ArrayList<Integer>> zigZagOrder(TreeNode root) {
		ArrayList<ArrayList<Integer>> result = new ArrayList<>();
		int depth = maxDepth(root);
		for(int i = 1; i <=depth; i++) {
			result.add(getLevel(root,i,i,new ArrayList<Integer>()));
		}
		return result;
	}
}