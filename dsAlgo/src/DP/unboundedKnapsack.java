package DP;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class unboundedKnapsack {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		
		int prices[] = new int[n];
		int itemsWeight[] = new int[n];
		
		StringTokenizer stPrices = new StringTokenizer(br.readLine());
		StringTokenizer stItemsWeight = new StringTokenizer(br.readLine());
		
		for(int i = 0; i<n; i++) {
			prices[i] = Integer.parseInt(stPrices.nextToken());
			itemsWeight[i] = Integer.parseInt(stItemsWeight.nextToken());
		}
		int target = Integer.parseInt(br.readLine());
		
		System.out.println(solve(prices,itemsWeight,target));

	}

	private static int solve(int[] prices, int[] itemsWeight, int target) {
		
		
		int dp[] = new int[target + 1];
		int max = Integer.MIN_VALUE;
		
		dp[0] = 0;
		
		//each cell will represents the max price
		
		for(int i = 0; i < prices.length; i++) {
			
			int currentWeight = itemsWeight[i];
			int currentPrice = prices[i];

			for (int j = currentWeight; j < dp.length; j++) {
				
				int remCap = j - currentWeight;
				if(remCap >= 0 && remCap < dp.length) {
					
					int includingWeightPrice = prices[i] + dp[remCap];
					int existingPrice = dp[j];
					
					dp[j] = Math.max(existingPrice, includingWeightPrice);
					
					if(dp[j] > max) {
						max = dp[j];
					}
				} 
			}
			for(int k = 0; k< dp.length; k++) {
				System.out.print(dp[k] + " ");
			}
			System.out.println();
		}
		
		
		
		
		return max;
	}

}
