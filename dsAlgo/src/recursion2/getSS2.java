package recursion2;

import java.io.*;
import java.util.*;

public class getSS2 {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine();
		 
		System.out.println(getSSs(str));
		
	}
	
	private static ArrayList<String> getSSs(String str) {
		// TODO Auto-generated method stub
		
		if(str.length() == 0) {
			ArrayList<String> emptyList = new ArrayList<>();
			emptyList.add("");
			return emptyList;
		}
		
		char ch = str.charAt(0);
		String ros = str.substring(1);
		
		ArrayList<String> remainingSSList = getSSs(ros);
		
		ArrayList<String> ansList = new ArrayList<>();
		
		for(String temp: remainingSSList) {
			ansList.add(""+temp);
			ansList.add(ch+temp);
		}
		
		return ansList;	
	}

}
