package DP;

import java.io.*;

public class decodeWays {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String str = br.readLine(); 
		
		System.out.println(solve(str));

	}
	
	private static int solve(String str) {
		
		int dp[] =  new int[str.length()+1];
		
		char ch = str.charAt(0);
		
		dp[0] = 1;
		if(Character.getNumericValue(ch) != 0) {
			dp[1] = 1;
		}
		
		for (int i=2; i < dp.length; i++) {
			int iMinus1 = Character.getNumericValue(str.charAt(i-2));
			int iTh = Character.getNumericValue(str.charAt(i-1));
			
			// 0 - 0
			if(iMinus1 == 0 && iTh == 0) {
				dp[i] = 0;
			}
			
			// 0 - non0
			if(iMinus1 == 0 && iTh != 0) {
				dp[i] = dp[i-1];
			}
			
			// non0 - 0
			if(iMinus1 != 0 && iTh == 0) {
				String tempStr = iMinus1+""+iTh;
				int value = Integer.parseInt(tempStr);
				
				if(value <= 26) {
					dp[i] = dp[i-2];
				}
			}
						
						
			// non0 - non0
			if(iMinus1 != 0 && iTh != 0) {
				dp[i] = dp[i-1];
				
				String tempStr = iMinus1+""+iTh;
				int value = Integer.parseInt(tempStr);
				
				if(value <= 26) {
					dp[i] += dp[i-2];
				}
			}
			
//			for(int dpVal: dp) {
//				System.out.print(dpVal+" ");
//			}
//			System.out.println();	
		}
		
		return dp[dp.length-1];
	}

}
