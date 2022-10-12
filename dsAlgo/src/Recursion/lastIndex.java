package Recursion;

import java.io.BufferedReader;
import java.io.*;
import java.util.StringTokenizer;

public class lastIndex {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int length = Integer.parseInt(st.nextToken());
		int[] arr = new int[length];
		for(int i=0;i<length;i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}
		int numToFind = Integer.parseInt(st.nextToken());
		int max = lastIndex(arr,0,numToFind);
		System.out.println(max);
	}

	private static int lastIndex(int[] arr, int i, int numToFind) {
		// TODO Auto-generated method stub
		if(i == arr.length) {
			return -1;
		}
		int lastIndex  = lastIndex(arr,i+1,numToFind);
		if(lastIndex == -1) {
			if(arr[i] == numToFind) {
				return i;
			}
		}
		return lastIndex;
	}

}
