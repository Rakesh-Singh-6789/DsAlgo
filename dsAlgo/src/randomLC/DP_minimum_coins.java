package randomLC;

public class DP_minimum_coins {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	 public static int minimumElements(int num[], int x) {
	        // Write your code here..

	        long[][] dp = new long[num.length][x+1];
	        long ans = f(num, x, num.length-1,dp);
	        if(ans >= Integer.MAX_VALUE) {
	            return -1;
	        } 
	        return (int)ans;
	    }

	    private static long f(int num[], int target, int idx, long dp[][]) {
	        if(idx == 0) {
	            if(target%num[0]==0) 
	                return target/num[0];
	            return Integer.MAX_VALUE;
	        }

	        // if(target == 0) {
	        //     return 1;
	        // }
	        if(dp[idx][target] != 0) {
	            return dp[idx][target];
	        }

	        long excluding = f(num,target,idx-1);

	        long including = Integer.MAX_VALUE;
	        if(num[idx] <= target) {
	            including = 1+f(num,target-num[idx],idx);
	        }
	        dp[idx][target] = Math.min(including, excluding);
	        return Math.min(including, excluding);
	    }

}
