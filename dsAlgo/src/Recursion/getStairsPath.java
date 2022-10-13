package Recursion;
import java.io.*;
import java.util.*;

public class getStairsPath {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		System.out.println(getStairsPath(n));
	}

	private static ArrayList<String> getStairsPath(int n) {
		// TODO Auto-generated method stub
		if(n==0) {
			ArrayList<String> list = new ArrayList<>();
			list.add("");
			return list;
		} else if(n< 0) {
			ArrayList<String> list = new ArrayList<>();
			return list;
		}
		
		ArrayList<String> recList1 = getStairsPath(n-1);
		ArrayList<String> recList2 = getStairsPath(n-2);
		ArrayList<String> recList3 = getStairsPath(n-3);
		ArrayList<String> ansList = new ArrayList<>();
		for(String recValue: recList1) {
//			int sum = 0;
//			for(int i=0; i<recValue.length(); i++) {
//				sum+=Character.getNumericValue(recValue.charAt(0));
//			}
//			if(sum+1 == n) {
				ansList.add(recValue+1);
			//}
		}
		for(String recValue: recList2) {
			
				ansList.add(recValue+2);

		}
		for(String recValue: recList3) {
			
				ansList.add(recValue+3);

		}
 		return ansList;
	}

}
