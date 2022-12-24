package DP;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class coinChangePermutation {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		BufferedReader br  = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		
		int arr[] = new int[n];
		
		for(int i=0;i<n;i++) {
			arr[i] = Integer.parseInt(br.readLine());
		}
		int target = Integer.parseInt(br.readLine());
		
		System.out.println(solve(arr,target));
	}

	private static int solve(int[] arr, int target) {
		// TODO Auto-generated method stub
		int n = arr.length;
		int m = target+1;
		
		//boolean isTargetSumFound = false;
		
		int dp[] = new int[m];
		dp[0] = 1;
		
		for(int i = 1; i < dp.length; i++) {
			int currentValue = i;
			for(int j = 0; j < n; j++) {
				int coin = arr[j];
				if(currentValue - coin >= 0 && dp[currentValue - coin] != 0) {
					dp[currentValue] += dp[currentValue - coin];
				}
			}
		}
		
		return dp[target];
	}

}
