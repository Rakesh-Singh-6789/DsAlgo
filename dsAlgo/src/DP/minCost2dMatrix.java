package DP;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.StringTokenizer;

public class minCost2dMatrix {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));	
		int n = Integer.parseInt(br.readLine());
		int m = Integer.parseInt(br.readLine());
		
		
		int arr[][] = new int[n][m];
		
		for(int i = 0; i< n; i++) {
		    StringTokenizer st = new StringTokenizer(br.readLine());
			for(int j = 0; j< m; j++) {
				arr[i][j] = Integer.parseInt(st.nextToken());
			}
		}
//		int arr[][] = {
//				{2,3,1},
//				{1,0,2},
//				{4,3,9},
//		};
		Integer dp[][] = new Integer[arr.length][arr[0].length];
// 		for(int i = 0; i< n; i++) {
//         	    //StringTokenizer st = new StringTokenizer(br.readLine());
//         		for(int j = 0; j< m; j++) {
//         			dp[i][j] = -1;
//         		}
// 		}
		
		System.out.println(minCost(arr,dp,0,0));
	}

	private static int minCost(int[][] arr, Integer[][] dp, int row,int col) {
		// TODO Auto-generated method stub
		if(row >= arr.length || col >= arr[0].length ) {
			return Integer.MAX_VALUE;
		}
		if(row == arr.length-1 && col == arr[0].length-1) {
			return arr[row][col];
		}
		
		if(dp[row][col] != null) {
		    return dp[row][col];
		}
		
		int hCost = minCost(arr,dp,row,col+1);
		int vCost = minCost(arr,dp,row+1,col);
		int minCost = Math.min(hCost, vCost);
		dp[row][col] = minCost + arr[row][col];
		
		return dp[row][col];
	}

}