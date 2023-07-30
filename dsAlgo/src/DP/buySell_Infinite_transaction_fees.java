package DP;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class buySell_Infinite_transaction_fees {

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
	
	private static long solve(int[] prices, int transactionFees) {
		
		int n = prices.length;
		long dp[][] = new long[n][2];
		
		dp[0][0] = -prices[0];
		dp[0][1] = 0;
		
		StringBuilder buySb = new StringBuilder("b1");
		StringBuilder sellSb = new StringBuilder();
		
		for(int i=1; i<n; i++) {
			
			//buy
			dp[i][0] = dp[i-1][0];
			long ifBoughtToday = dp[i-1][1] - prices[i];
			String BuySbString = buySb.toString(); 
			
			if(ifBoughtToday > dp[i][0]) {
				buySb = new StringBuilder(sellSb);
				buySb.append("b"+(i+1));
				dp[i][0] = ifBoughtToday;
			}
			
			//sell
			dp[i][1] = dp[i-1][1];
			long ifSoldToday = dp[i-1][0] + prices[i] - transactionFees;
			
			if(ifSoldToday > dp[i][1]) {
				sellSb = new StringBuilder(BuySbString);
				sellSb.append("s"+(i+1));
				dp[i][1] = ifSoldToday;
			}
			
			//System.out.println(dp[i][0] + " " + dp[i][1]);
		}
		//System.out.println(buySb.toString() + "  " + sellSb.toString());
		return Math.max(dp[n-1][0], dp[n-1][1]);
	}

}
