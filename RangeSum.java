public class RangeSum {
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
		System.out.println(rangeSum(root, 2,5));
	}
	public static int rangeSum(TreeNode root, int L, int R) {
		if(root == null) {
			return 0;
		}
		if(root.value > L && root.value < R) {
			return root.value + rangeSum(root.right, L, R) + rangeSum(root.left, L, R);
		}
		else{
			return rangeSum(root.right, L, R) + rangeSum(root.left, L, R);
		}
		
	}
}