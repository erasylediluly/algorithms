public class Symmetric {
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
		System.out.println(isSymmetric(root));
	}
	public static boolean isSymmetric(TreeNode root) {
		return root == null || checker(root.left, root.right);
	}
	public static boolean checker(TreeNode left, TreeNode right) {
		if(left == null && right == null) {
			return true;
		}
		else if(left == null ^ right == null) {
			return false;
		} 
		return left.val == right.val && checker(left.left, right.right) && checker(left.right, right.left);
	}