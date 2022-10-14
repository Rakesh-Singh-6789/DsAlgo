package Recursion;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class printPermutation {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine();
		printPermutation(str,"");
		System.out.println(count);
	}
	static int count = 0;
	private static void printPermutation(String str,String ans) {
		// TODO Auto-generated method stub
		if(str.length() == 0) {
			count++;
			System.out.println(ans);
			return;
		}
		for(int i=0;i<str.length();i++) {
			char ch = str.charAt(i);
			StringBuilder  sb = new StringBuilder(str);
			sb.deleteCharAt(i);
			String ros = sb.toString();
			printPermutation(ros,ch+ans);
		}
	}

}
