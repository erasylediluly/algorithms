public class TreeSum {
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
		System.out.println(sum(root));
	}
	public static int sum(TreeNode root) {
		if(root == null) {
			return 0;
		}
		return sum(root.left) + sum(root.right) + root.value;
	}
class TreeNode {
		int value;
		TreeNode right;
		TreeNode left;
		public TreeNode(int value) {
			this.value = value;
		}
	}