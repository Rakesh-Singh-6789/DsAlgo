package randomLC;

import java.io.*;
import java.util.StringTokenizer;

public class DP_getMaxPathVariableStarting {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		//int triagnle[][] = {{1,2,10,4}, {100,3,2,1}, {1,1,20,2}, {1,2,2,1}};
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int n = Integer.parseInt(st.nextToken());
		int m =  Integer.parseInt(st.nextToken());
		
		
		int matrix[][] = new int[n][m];
		for(int i=0; i<n; i++) {
			st = new StringTokenizer(br.readLine());
			for(int j=0; j<m; j++) {
				matrix[i][j] = Integer.parseInt(st.nextToken());
			}
		}
		
		System.out.println(getMaxPathSum(matrix));

	}
	
	public static int getMaxPathSum(int[][] matrix) {
		// Write your code here
		int n = matrix.length;
		int m = matrix[0].length;

		return minimumPathSum(matrix,n,m);
	}
	public static int minimumPathSum(int[][] matrix, int n, int m) {
        // Write your code here.
        int dp[][] = new int[n][n];
        // for(int i=0; i< n; i++) {
        //     for (int j= 0; j<n; j++) {
        //         dp[i][j] = Integer.MAX_VALUE;
        //     }
        // }
        // return f(triangle,n,0,0, dp);

        for(int i=0; i<m; i++) {
            dp[n-1][i] = matrix[n-1][i];
        }

        for(int i=n-2; i>=0; i--) {
            for(int j=m-1; j>=0; j--) {
            	int max = dp[i+1][j];
            	if(j+1<m) {
            		max = Math.max(max, dp[i+1][j+1]);
            	}
				if(j-1>=0) {
					max = Math.max(max, dp[i+1][j-1]);
				}
				dp[i][j] = max + matrix[i][j];
            }
        }

		int max = dp[0][0];
		for(int i=0; i<n; i++) {
			for(int j=0; j<m; j++) {
				System.out.print(dp[i][j] + " ");
			}
			System.out.println();
		}
		for(int j=1; j<m; j++) {
			if(dp[0][j] > max ) {
				max = dp[0][j];
			}
		}
        return max;
    }

}
