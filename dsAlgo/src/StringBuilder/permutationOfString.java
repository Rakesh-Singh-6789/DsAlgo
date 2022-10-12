package StringBuilder;
import java.io.*;
import java.util.*;

public class permutationOfString {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine();
		printAllPermuation(str);
	}
	private static void printAllPermuation(String str) {
		int factorial = getFactorial(str.length());
		
		for(int i=0;i<factorial;i++) {
			StringBuilder sb = new StringBuilder(str);
			StringBuilder finalSb = new StringBuilder();
			//System.out.println(i);
			for(int j=str.length(); j>0; j--) {
				int quotient = i/j;
				int remainder = i%j;
				finalSb.append(sb.charAt(remainder));
				sb.deleteCharAt(remainder);
			}
			System.out.println(finalSb);
		}
	}
	private static int getFactorial(int num) {
		if(num==1) {
			return 1;
		}
		int factorial = num*getFactorial(num-1);
		return factorial;
	}
}
