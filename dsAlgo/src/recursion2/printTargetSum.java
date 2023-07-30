package recursion2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class printTargetSum {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int n = Integer.parseInt(st.nextToken());
		
		//int array[] = new int[n];
		ArrayList<Integer> list = new ArrayList<>();
		for(int i=0; i<n; i++) {
			list.add(Integer.parseInt(st.nextToken()));
		}
		
		Integer target = Integer.parseInt(st.nextToken());
		
		printTargetSum(target, list);
	}

	private static void printTargetSum(Integer target, ArrayList<Integer> list) {
		// TODO Auto-generated method stub
		ArrayList<Integer> listCopy =  new ArrayList<>(list);
		System.out.println(listCopy);
		helperFunction(target, list, 0, "");
		
	}

	private static void helperFunction(Integer target, ArrayList<Integer> list, int sos, String ans) {
		// TODO Auto-generated method stub
		if(sos == target) {
			System.out.println(ans);
			//return; might be zeroes
		}
		
		if(sos > target || list.size() == 0) {
			return;
		}
		
		for(int i = 0; i<list.size(); i++) {
			int currentNum = list.remove(i);
		}
		
		
		int currentNum = 0;
		helperFunction(target, list, sos+currentNum , ""+ans+currentNum);
		helperFunction(target, list, sos, ans);
	}

}
