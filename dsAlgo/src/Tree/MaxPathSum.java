

class MaxSum<T> {
	public T data;
	MaxSum(T data) {
		this.data = data;
	}
}


public class MaxPathSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	public static int maxPathSum(TreeNode<Integer> root) {
		// Write your code here.
		MaxSum<Integer> maxSum = new MaxSum<>(0);
		int temp = maxPathHelper(root, maxSum);
		return maxSum.data;
	}

	public static int maxPathHelper(TreeNode<Integer> root, MaxSum<Integer> maxSum) {
		if(root == null) return 0;

		int lSum = maxPathHelper(root.left, maxSum);
		int rSum = maxPathHelper(root.right, maxSum);
		if(lSum < 0) lSum = 0;
		if(rSum < 0) rSum = 0;

		int pathSum = root.data + (lSum + rSum);

		maxSum.data = Math.max(maxSum.data, pathSum);
		return root.data + Math.max(lSum, rSum);

	}

}

