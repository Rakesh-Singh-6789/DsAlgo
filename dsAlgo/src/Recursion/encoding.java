package Recursion;

import java.io.*;
import java.util.*;

public class encoding {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int number = Integer.parseInt(br.readLine());
		String str = String.valueOf(number);
		// String str1 = number+"";
		printEncodes(str, "");

	}
	
	private static void printEncodes(String str, String ans) {
		// TODO Auto-generated method stub
		
		if(str.length() == 0) {
			System.out.println(ans);
			return;
		}
		
		for (int i = 1; i <= str.length(); i++) {
			int num = Integer.parseInt(str.substring(0,i));
			if(num>26) {
				continue;
			}
			char ch = (char) (num+96);
			String ros = str.substring(i);
			printEncodes(ros,ans+ch);
		}
	}

}
