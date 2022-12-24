package DP;

import java.io.*;
import java.util.*;

public class knapsack01 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		
		int prices[] = new int[n];
		int itemsWeight[] = new int[n];
		
		StringTokenizer stWeights = new StringTokenizer(br.readLine());
		StringTokenizer stItems = new StringTokenizer(br.readLine());
		
		for(int i = 0; i<n; i++) {
			prices[i] = Integer.parseInt(stWeights.nextToken());
			itemsWeight[i] = Integer.parseInt(stItems.nextToken());
		}
		int target = Integer.parseInt(br.readLine());
		
		System.out.println(solve(prices,itemsWeight,target));

	}

	private static int solve(int[] prices, int[] itemsWeight, int target) {
		
		
		int dp[][] = new int[prices.length+1][target + 1];
		
		//each cell will represents the max price
		
		for(int i = 1; i < dp.length; i++) {
			
			int currentWeight = itemsWeight[i-1];
			int currentPrice = prices[i-1];

			for (int j = 1; j< dp[0].length; j++) {
				
				int uparWala = dp[i-1][j];
				
				if(j >= currentWeight) {
					int includingCurrentWeight = currentPrice + dp[i-1][j-currentWeight];
					if(includingCurrentWeight > uparWala) {
						dp[i][j] = includingCurrentWeight;
					} else {
						dp[i][j] = uparWala;
					}
				} else {
					dp[i][j] = uparWala;
				}
				
			}
		}
		
		for(int i = 0; i< dp.length; i++) {
			for(int j = 0 ; j< dp[0].length; j++) {
				System.out.print(dp[i][j] + " ");
			}
			System.out.println();
		}
		
		
		return dp[prices.length][target];
	}

}
