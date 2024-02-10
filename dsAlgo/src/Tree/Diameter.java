package Tree;

class TreeNode<T> {
    public T data;
    public TreeNode<T> left;
    public TreeNode<T> right;

    TreeNode(T data) {
        this.data = data;
        left = null;
        right = null;
    }
}

public class Diameter {
	
	  public static int diameterOfBinaryTree(TreeNode<Integer> root) {
	        // Write your code here.
	        PassByReference<Integer> maxSoFar = new PassByReference<>(0);
	        return diameterHelper(root, maxSoFar);

	    }

	    public static int diameterHelper(TreeNode<Integer> root, PassByReference<Integer> maxSoFar) {
	        if(root == null) {
	            return 0;
	        }
	        int lh = diameterHelper(root.left, maxSoFar);
	        int rh = diameterHelper(root.right, maxSoFar);

	        int temp = maxSoFar.data == null ? 0 : (int)(maxSoFar.data);
	        maxSoFar.data = Math.max(temp, lh+rh);
	        return 1+Math.max(lh,rh);
	    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	}

}

class PassByReference<T> {
    public T data;
    PassByReference(T Data) {
        this.data = data;
    }
}
