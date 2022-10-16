package Recursion;

import java.io.*;
import java.util.*;

public class TargetSum {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		int arr[] = new int[n];
		for (int i = 0; i < n; i++) {
			arr[i] = Integer.parseInt(br.readLine());
		}
		// StringTokenizer st = new StringTokenizer(br.readLine());
		int target = Integer.parseInt(br.readLine());
		printTargetSum(arr, 0, "", 0, target);
	}

	private static void printTargetSum(int[] arr, int idx, String set, int sumOfSubset, int target) {
		// TODO Auto-generated method stub

		if (sumOfSubset > target) {
			return;
		}

		

		for (int i = idx; i < arr.length; i++) {
			printTargetSum(arr, i + 1, set + arr[i] + ", ", sumOfSubset + arr[i], target);
		}
		
		if (sumOfSubset == target) {
			System.out.println(set + " .");
			//return;
		}

	}

}
