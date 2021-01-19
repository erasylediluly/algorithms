import java.util.*;
public class CollectValues {
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
		System.out.println(levelOrder(root));
	}/*
	public static ArrayList<ArrayList<Integer>> levelOrder(TreeNode root) {
		ArrayList<ArrayList<Integer>> result = new ArrayList<ArrayList<Integer>>();
		if(root == null) {
			return result;
		}
		Queue<TreeNode> queue = new LinkedList<>();
		queue.add(root);
		while(!queue.isEmpty()) {
			int size = queue.size();
			ArrayList<Integer> inside = new ArrayList<>();
			for(int i = 0; i < size; i++) {
				TreeNode temp = queue.poll();
				if(temp.left != null) {
					queue.add(temp.left);
				}
				if(temp.right != null) {
					queue.add(temp.right);
				}
				inside.add(temp.value);
			}
			result.add(inside);
		}
		return result;
	}*/
	public static int maxDepth(TreeNode root) {
		if(root == null) {
			return 0;
		}
		return Math.max(maxDepth(root.left),maxDepth(root.right))+1;
	}
	public static ArrayList<Integer> getLevel(TreeNode root, int level, ArrayList<Integer> list) {
		if(root == null) {
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
	public static ArrayList<ArrayList<Integer>> levelOrder(TreeNode root) {
		ArrayList<ArrayList<Integer>> result = new ArrayList<>();
		int depth = maxDepth(root);
		for(int i = 1; i <=depth; i++) {
			result.add(getLevel(root,i,new ArrayList<Integer>()));
		}
		return result;
	}
}