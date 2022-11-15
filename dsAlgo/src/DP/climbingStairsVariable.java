package DP;

public class climbingStairsVariable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(getVariableCountStair(new int[] {3,3,0,2,2,3}));
	}
	
	public static int getVariableCountStair(int arr[]) {
		int length = arr.length;
		
		int dp[] = new int[length+1];
		
		dp[length] = 1;
		for(int i = length-1; i >= 0; i--) {
			int steps = arr[i];
			
			for(int j = steps; j > 0; j--) {
				if( i + j <= length) {
					dp[i]+=dp[i+j];
				}
			}			
		}
		
		return dp[0];
	}

}
