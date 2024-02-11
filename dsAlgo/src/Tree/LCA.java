package Tree;

public class LCA {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	 public static int lowestCommonAncestor(TreeNode<Integer> root, int x, int y) {
	        //    Write your code here.

	        if(root == null) {
	            return -1;
	        }

	        if(root.data == x || root.data == y) {
	            return root.data;
	        }

	        int leftCall = lowestCommonAncestor(root.left, x, y);
	        int rightCall = lowestCommonAncestor(root.right, x, y);

	        if(leftCall == -1 && rightCall != -1) {
	            return rightCall;
	        }

	        if(leftCall != -1 && rightCall == -1) {
	            return leftCall;
	        }
	        if(leftCall != -1 && rightCall != -1) {
	            return root.data;
	        }

	        return -1;
	    }

}
