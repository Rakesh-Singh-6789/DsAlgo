package Recursion;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class printSS {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine();
		printSubSequence(str,"");
		System.out.println(count);
	}

	static int count = 0;
	private static void printSubSequence(String str, String ans) {
		// TODO Auto-generated method stub
		if(str.length() == 0 ) {
			count++;
			System.out.println(ans);
			return;
		}
		
		
		char ch = str.charAt(0);
		String ros = str.substring(1);
		
		printSubSequence(ros,ans+"");
		printSubSequence(ros,ans+ch);
		
		//System.out.println("post: "+"str: "+str+" ans: " +ans);
	}

}
