package Recursion;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class PowerLog {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int x = Integer.parseInt(st.nextToken());
		int n = Integer.parseInt(st.nextToken());
		
		System.out.println(power(x,n));
	}

	private static int power(int x, int n) {
		
		if(n==1) {
			return x;
		}
		
		int ans;
		if(n%2 == 0) {
			int powerHalf = power(x,n/2);
			ans = (int)Math.pow(powerHalf, 2);
		} else {
			int powerHalf = power(x,n/2);
			ans = (int)Math.pow(powerHalf, 2)*x;
		}
		
		return ans;
		
	}
}
