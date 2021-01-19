public class HeapToArray {
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
		heapToArray(root);
	}
	public static void heapToArray(TreeNode root) { 
		int h = maxDepth(root);
		int i;
		for(i = 1; i <= h; i++) {
			printLevel(root,i);
		}
	}
	public static int maxDepth(TreeNode root) {
		if(root == null) {
			return 0;
		}
		return Math.max(maxDepth(root.left), maxDepth(root.left))+1;
	}
	public static void printLevel(TreeNode root, int level) {
		if(root == null){
			return;
		}
		if(level == 1) {
			System.out.print(root.value + " ");
		}
		else if(level > 1) {
			printLevel(root.left, level - 1);
			printLevel(root.right, level - 1);
		}
	}
	private static class TreeNode {
		int value;
		TreeNode left;
		TreeNode right;
		public TreeNode(int value){
			this.value = value;
		}
	}
}