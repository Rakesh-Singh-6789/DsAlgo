package Recursion;
import java.io.*;

public class Factorial {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int num = Integer.parseInt(br.readLine());
		
		System.out.print(factorial(num));
	}

	private static int factorial(int num) {
		// TODO Auto-generated method stub
		if(num == 1 || num == 0) {
			return 1;
		}
		
		int fact = num*factorial(num-1);
		return fact;
	}
	
	

}
