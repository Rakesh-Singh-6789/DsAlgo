package DP;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class buyAndSell_K_transactions {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		
		int prices[] = new int[n];
				
		for(int i = 0; i<n; i++) {
			prices[i] = Integer.parseInt(br.readLine());
		}
		
		int transactionFees = Integer.parseInt(br.readLine());
		
		System.out.println(solve(prices,transactionFees));
	}
	
	private static long solve(int[] prices, int k) {
		
		int n = prices.length;
		long dp[][] = new long[k+1][n];
		
		for(int t = 1; t<=k; t++) {
			long maxDiffSoFar = Integer.MIN_VALUE;
			for(int d=1; d<n ; d++) {
				
				long priceDiff = dp[t-1][d-1] - prices[d-1]; 
				if(priceDiff > maxDiffSoFar) {
					maxDiffSoFar = priceDiff;
				}
				
				dp[t][d] = Math.max(maxDiffSoFar+prices[d], dp[t][d-1]);
			}
			
		}
		
		return dp[k][n-1];
		
	}

}
