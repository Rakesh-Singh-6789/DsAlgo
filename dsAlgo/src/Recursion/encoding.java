package Recursion;

import java.io.*;
import java.util.*;

public class encoding {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		// int number = Integer.parseInt(br.readLine());
		String str = br.readLine();
		// String str1 = number+"";
		printEncodings(str, "");

	}

	public static void printEncodings(String str, String ans) {
		if (str.length() == 0) {
			System.out.println(ans);
			return;
		}

		for (int i = 1; i <= str.length(); i++) {
			long num = Long.parseLong(str.substring(0, i));
			if (num > 26 || num < 1) {
				continue;
			}
			char ch = (char) (num + 96);
			String ros = str.substring(i);
			printEncodings(ros, ans + ch);
		}
	}

}