package Recursion;
import java.io.*;
import java.util.StringTokenizer;

public class Power {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int x = Integer.parseInt(st.nextToken());
		int n = Integer.parseInt(st.nextToken());
		
		System.out.println(power(x,n));
	}

	private static int power(int x, int n) {
		// TODO Auto-generated method stub
		
		
//		if(n==0) {
//			return 1;
//		}
		if( n == 1) {
			return x;
		}
		
		int tillX = power(x,n-1);
		int ans = x * tillX;
		return ans;
	}

}
