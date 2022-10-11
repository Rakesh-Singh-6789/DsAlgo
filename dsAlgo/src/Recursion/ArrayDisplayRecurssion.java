package Recursion;

import java.io.BufferedReader;
import java.io.*;
import java.util.*;

public class ArrayDisplayRecurssion {
	
	public static void main(String ...args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int length = Integer.parseInt(st.nextToken());
		int[] arr = new int[length];
		for(int i=0;i<length;i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}
		displayArr(arr,0);
	}

	private static void displayArr(int[] arr, int i) {
		// TODO Auto-generated method stub
		if(i==arr.length) {
			return;
		}
		System.out.print(arr[i]+ (i!=arr.length-1?"->":""));
		displayArr(arr,i+1);
	}

}
