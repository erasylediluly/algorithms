import java.util.*;
public class BuildTree {
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
		int[] pre = {3,9,20,15,7};
		int[] in = {9,3,15,20,7};
		System.out.println(buildTree(pre, in));
	}
	public static TreeNode buildTree(int[] pre, int[] in) {
		return builder(0, 0, pre.length - 1, pre, in);
	}
	public static TreeNode builder(int preLeft, int inLeft, int inRight, int[] pre, int[] in) {
		if((preLeft >= pre.length-1) || (inLeft > inRight)) {
			return null;
		}
		TreeNode root = new TreeNode(pre[preLeft]);
		int newRight = 0;
		for(int i = 0; i <= inRight; i++) {
			if(pre[preLeft] == in[i]) {
				newRight = i;
				break;
			}
		}
		root.left = builder(preLeft+1, inLeft, newRight-1, pre, in);
		root.right = builder(preLeft + newRight - inLeft + 1, newRight+1, inRight, pre, in);
		return root;
	}
	public static int sumLeft(TreeNode root) {
		if(root == null) {
			return 0;
		}
		else if(root.left != null && root.left.left == null && root.left.right == null) {
			return root.left.value + sumLeft(root.right);
		}
		return sum(root.left) + sum(root.right);
	}
	public static boolean similarLeaves(TreeNode root1, TreeNode root2) {
		Queue<Integer> q1 = new LinkedList<>();
		Queue<Integer> q2 = new LinkedList<>();
		collector(root1, q1);
		collector(root2, q2);
		if(q1.size() != q2.size()) {
			return false;
		}
		while(!q1.isEmpty() || !q1.isEmpty()) {
			if(q1.peek() != q2.peek()) {
				return false;
			} 
			else{
				q1.poll();
				q2.poll();
			}
		}
		return true;
	}
	public static void collector(TreeNode root, Queue<Integer> q) {
		if(root == null) {
			return;
		}
		else if(root.right == null && root.left == null) {
			q.add(root.value);
			return;
		}
		else{
			collector(root.right, q);
			collector(root.left, q);
		}
	}
	public static boolean validParantheses(String s) {
		Stack<Character> stack = new Stack<>();
		for(int i = 0; i < s.length; i++) {
			if(s.charAt(i) == '(') {
				stack.push(s.charAt(i));
			}
			else if(s.charAt(i) == ')' && stack.peek() == '(') {
				stack.pop();
			}
		}
		return stack.empty();
	}
	public static boolean duplicateParantheses(String s) {
		Stack<Character> stack = new Stack<>();
		for(int i = 0; i < s.length(); i++) {
			if(s.charAt(i) == ')') {}
		}
	}
}