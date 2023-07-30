package recursion2;

import java.io.*;
import java.util.*;

public class printPermutations {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine();
		
		printPerm(str,"");
	}
	
	private static void printPerm(String str, String ans) {
		
		if(str.length() == 0) {
			System.out.println(ans);
			return;
		}
		
		for(int i=0; i<str.length(); i++) {
			char ch = str.charAt(i);
			StringBuilder sb = new StringBuilder(str);
			sb.deleteCharAt(i);
			printPerm(sb.toString(), ans+ch);
		}
	}

}
