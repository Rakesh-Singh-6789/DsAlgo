package randomLC;

import java.util.*;

public class DP_Longest_pallindromic_subsequence {

	public static void main(String[] args) {
		public static int longestPalindromeSubsequence(String s) {
			int n = s.length();
	        int m = s.length();

			StringBuilder sb = new StringBuilder(s);
			String revS = sb.reverse().toString();
	        int dp[][] = new int[n][m];

	        return f(s,revS,n-1,m-1,dp);
	    }

	    private static int f(String a, String b, int nIdx, int mIdx, int dp[][]) {
	        if(nIdx < 0 || mIdx < 0) {
	            return 0;
	        }

	        if(dp[nIdx][mIdx] != 0) {
	            return dp[nIdx][mIdx];
	        }

	        //match
	        if(a.charAt(nIdx) == b.charAt(mIdx)) {
	            return dp[nIdx][mIdx] = 1+f(a,b,nIdx-1,mIdx-1,dp);
	        }

	        //if not match
	        return dp[nIdx][mIdx] = Math.max(f(a,b,nIdx-1,mIdx,dp), f(a,b,nIdx,mIdx-1,dp));
	    }
	    
	}
	public static List< Integer > superiorElements(int []arr) {
        // Write your code here.
        List<Integer> list = new ArrayList<>();
        int n = arr.length;
        int minSoFar = arr[n-1];
        int maxSoFar = arr[n-1];

        list.add(maxSoFar);
        for(int i=n-2; i>=0; i--) {
            if(maxSoFar > arr[i] && minSoFar > arr[i]) {
                list.add(arr[i]);
                continue;
            } 
            if(arr[i] > maxSoFar) {
                maxSoFar = arr[i];
            } 
            if(arr[i] < minSoFar) {
                minSoFar = arr[i];
            }
        }
         Collections.sort(list);
         return list;
    }