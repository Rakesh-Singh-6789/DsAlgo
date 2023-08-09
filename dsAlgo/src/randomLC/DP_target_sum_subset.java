package randomLC;

public class DP_target_sum_subset {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	 public static boolean subsetSumToK(int n, int k, int arr[]){
	        // Write your code here.
	        return f(n, k, arr,0,0);
	    }

	    private static boolean f(int n, int k, int arr[], int sum, int idx) {

	        if(sum == k) {
	            return true;
	        }

	        if(idx > n-1) {
	            return false;
	        }

	        return f(n, k,arr, sum+arr[idx], idx+1) || f(n, k,arr, sum+0, idx+1);
	    }

}
