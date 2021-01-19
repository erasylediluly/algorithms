public class MinDepth {
	public static void main(String[] args) {
		TreeNode root = new TreeNode(0);
		TreeNode left = new TreeNode(1);
		root.left = left;
		TreeNode right = new TreeNode(2);
		root.right = right;
		TreeNode leftleft = new TreeNode(3);
		left.left = leftleft;
		TreeNode leftright = new TreeNode(6);
		left.right = leftright;
		System.out.println(minDepth(root));
	}
	public static int minDepth(TreeNode node) {
		if(node == null) {
			return 0;
		}
		return Math.min(minDepth(node.left), minDepth(node.right)) + 1;
	}
}