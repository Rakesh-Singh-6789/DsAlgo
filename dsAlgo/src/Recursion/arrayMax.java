package Recursion;

import java.io.BufferedReader;
import java.io.*;
import java.util.StringTokenizer;

public class arrayMax {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int length = Integer.parseInt(st.nextToken());
		int[] arr = new int[length];
		for(int i=0;i<length;i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}
		int max = maxArray(arr,0);
		System.out.println(max);
	}

	private static int maxArray(int[] arr, int i) {
		// TODO Auto-generated method stub
		if(i==arr.length) {
			return Integer.MIN_VALUE;
		}
		int max = maxArray(arr,i+1);
		if(max < arr[i]) {
			max = arr[i];
		}
		return max;
	}
}
