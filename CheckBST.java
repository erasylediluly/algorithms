public class CheckBST {
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
		System.out.println(checkBST(root));
	}
	public static boolean checkBST(TreeNode root) {
		return checkBST(root, null, null);
	}
	public static boolean checkBST(TreeNode root, Integer min, Integer max) {
		if(root == null) {
			return true;
		}
		if((min != null && root.val < min) || (max != null && root.val > max)){
			return false;
		}
		if(!checkBST(root.left, min, root.val) || !checkBST(root.right, root.val, max)){
			return false;
		}
		return true;
	}
}