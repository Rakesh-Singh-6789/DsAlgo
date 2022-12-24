package DP;

import java.io.*;
import java.util.*;

public class targetSumSubsets {

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

	private static boolean solve(int[] arr, int target) {
		// TODO Auto-generated method stub
		int n = arr.length+1;
		int m = target+1;
		
		//boolean isTargetSumFound = false;
		
		boolean dp[][] = new boolean[n][m];
		
		for(int i = 0; i < n; i++) {
			dp[i][0] = true;
		}
		
		for(int i = 0; i < m; i++) {
			dp[0][i] = false;
		}
		
		for(int i = 1; i<n; i++) {
			int value = arr[i-1];
			for(int j = 1; j<m; j++) {
				if(dp[i-1][j] || (j-value >=0 && dp[i-1][j-value])) {
					dp[i][j] = true;
					if(j == target) {
						return true;
					}
				}
			}
		}
		
		
		return false;
	}

}
