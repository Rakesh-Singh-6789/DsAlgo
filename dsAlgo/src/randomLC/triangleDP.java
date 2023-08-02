package randomLC;

public class triangleDP {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int triagnle[][] = {{2}, {3,4}, {6,5,7}, {4,1,8,3}};
		//System.out.println(minimumPathSum(triagnle,4));
		System.out.println(minimumPathDPSpaceSum(triagnle,4));

	}
	public static int minimumPathDPSpaceSum(int[][] triangle, int n) {
        // Write your code here.
        int dp[] = new int[n];
        // for(int i=0; i< n; i++) {
        //     for (int j= 0; j<n; j++) {
        //         dp[i][j] = Integer.MAX_VALUE;
        //     }
        // }
        // return f(triangle,n,0,0, dp);

        for(int i=0; i<n; i++) {
            dp[i] = triangle[n-1][i];
        }

        for(int i=n-2; i>=0; i--) {
            int tempRow[] = new int[i+1];
            for(int j=i; j>=0; j--) {
                tempRow[j] = triangle[i][j] + Math.min(dp[j], dp[j+1]);
            }
            for(int j=i; j>=0; j--) {
                dp[j] = tempRow[j];
            }
        }

        return dp[0];
    }
	public static int minimumPathSum(int[][] triangle, int n) {
        // Write your code here.
        int dp[][] = new int[n][n];
        // for(int i=0; i< n; i++) {
        //     for (int j= 0; j<n; j++) {
        //         dp[i][j] = Integer.MAX_VALUE;
        //     }
        // }
        // return f(triangle,n,0,0, dp);

        for(int i=0; i<n; i++) {
            dp[n-1][i] = triangle[n-1][i];
        }

        for(int i=n-2; i>=0; i--) {
            for(int j=i-2; j>=0; j--) {
                System.out.println(i + " " + j);
                dp[i][j] = triangle[i][j] + Math.min(dp[i+1][j], dp[i+1][j+1]);
            }
        }

        return dp[0][0];
    }

}
