package Recursion;

import java.io.*;
import java.util.*;

public class printKeySS {
	
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine();
		
		keyMap.put(1,"abc");
		keyMap.put(2,"def");
		keyMap.put(3,"ghi");
		keyMap.put(4,"jkl");
		keyMap.put(5,"mno");
		keyMap.put(6,"pqr");
		keyMap.put(7,"stu");
		keyMap.put(8,"vwx");
		keyMap.put(9,"yz");
		keyMap.put(0,".?!");
		
		printKeySS(str,"");
		System.out.println(count);
	}
	static int count = 0;
	static HashMap<Integer,String> keyMap = new HashMap<>();
	private static void printKeySS(String str, String ans) {
		if(str.length() == 0) {
			count++;
			System.out.println(ans);
			return;
		}
		
		char ch = str.charAt(0);
		String ros = str.substring(1);
		String pressedValues = keyMap.get(Character.getNumericValue(ch));
		
		for(int i=0;i<pressedValues.length();i++) {
			char pressedCh = pressedValues.charAt(i);
			printKeySS(ros,ans+pressedCh);
		}
		
		
	}

}
