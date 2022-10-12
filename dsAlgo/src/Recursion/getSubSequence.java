package Recursion;
import java.io.*;
import java.util.*;

public class getSubSequence {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine();
		System.out.println(getSubSequence(str));
	}

	private static ArrayList<String> getSubSequence(String str) {
		
		if(str.length() == 0) {
			ArrayList<String> list = new ArrayList<>();
			list.add("");
			return list;
		}
		
		
		String remStr = str.substring(1);
		ArrayList<String> list = getSubSequence(remStr);
		ArrayList<String> answerList = new ArrayList<>();
		char ch = str.charAt(0);
		for(String rstr : list) {
			answerList.add(""+rstr);
			answerList.add(ch+rstr);
		}
		return answerList;
	}

}
