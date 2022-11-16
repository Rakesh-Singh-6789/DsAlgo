package DP;

public class minimumMovesStairs {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(minMoveStairs(new int[] {3,2,4,2,0,2,3,1,2,2}));
	}

	private static int minMoveStairs(int[] arr) {
		// TODO Auto-generated method stub
		int n = arr.length;
		Integer[] dp = new Integer[n+1];
		dp[n] = 0;
		
		for (int i = n-1; i>=0; i--) {
			
			int steps = arr[i];
			int localMin = Integer.MAX_VALUE;
			
			for(int j = 1; j <= steps && i+j < dp.length; j++) {
				if(dp[i+j] != null && dp[i+j] < localMin) {
					localMin = dp[i+j];
				}
			}
			if(localMin != Integer.MAX_VALUE) {
				dp[i] = localMin + 1;
			}
		}
		
		for(Integer dpValue: dp) {
			System.out.print(dpValue+ " ");
		}
		System.out.println();
		return dp[0];		
	}

}
