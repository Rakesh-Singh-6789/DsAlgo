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
		if(n==0) {
			return 1;
		}
		
		int halfPower = power(x,n/2);
		int fullPower = halfPower*halfPower;
		if(n%2 != 0) {
			fullPower=fullPower*x;
		}
		return fullPower;
	}
}
