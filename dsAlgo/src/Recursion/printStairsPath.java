package Recursion;

import java.io.*;

public class printStairsPath {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		printStairsPath(n,"");
		System.out.println(count);
	}
	static int count = 0;
	private static void printStairsPath(int n, String ans) {
		// TODO Auto-generated method stub
		if( n == 0) {
			count++;
			System.out.println(ans);
			return;
		}
		if(n<0) {
			return;
		}
		printStairsPath(n-1,ans+1);
		printStairsPath(n-2,ans+2);
		printStairsPath(n-3,ans+3);
	}
}
