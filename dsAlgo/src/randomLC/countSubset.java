package randomLC;

import java.util.ArrayList;

public class countSubset {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> list = new ArrayList<>();
		
		//int num[] = {1,4,4,5};
		int num[] = {5, 9, 10, 8, 9, 8, 1, 2, 5, 6, 1, 7};
		int dp[][] = new int[num.length][5];
        for(int i=0; i<dp.length; i++){
            for(int j=0; j<=4; j++){
            dp[i][j]=-1;
            }
        }
		System.out.println(f(num,4,11,dp));

	}
	public static int f(int[] num, int tar, int n,int dp[][]){
        if(n==0) {
            return num[0] == tar ? 1 : 0;
        }
        if( n<0 || tar < 0) {
            return 0;
        }
        if(tar == 0) {
            return 1;
        }
        
        if(tar>=0 && dp[n][tar] != -1) {
            return dp[n][tar];
        }

        int including = f(num, tar-num[n],n-1,dp);
        int excluding = f(num, tar, n-1, dp);
        int sum = including+excluding;
        dp[n][tar] = sum;
        return sum;
    }

}
