public class MaxDepth {
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
		System.out.println(maxDepth(root));
	}
	public static int maxDepth(TreeNode root) {
		if(root == null) {
			return 0;
		}
		return Math.max(maxDepth(root.left), maxDepth(root.right)) + 1;
	}
}