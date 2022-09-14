package Recursion;
import java.util.*;
import java.io.*;

public class Print {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br =  new BufferedReader(new InputStreamReader(System.in));
		int num = Integer.parseInt(br.readLine());
		
		
		print(num);
	}

	private static void print(int num) {
		// TODO Auto-generated method stub
		
		if(num < 0) {
			return;
		}
		
		System.out.println(num);
		print(--num);	
	}

}
