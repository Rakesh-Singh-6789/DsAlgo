package ArrayList;
import java.io.*;
import java.util.*;

public class removePrimeNumbers {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		StringTokenizer st = new StringTokenizer(br.readLine());
		int arr[] = new int[n];
		for(int i=0;i<n;i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}
		arr = removeAllPrimes(arr);
	}
	
	private static int[] removeAllPrimes(int[] arr) {
		ArrayList<Integer> list = new ArrayList<>();
		for(int value: arr) {
			list.add(null);
		}
		
		return null;
	}
	
	private static boolean isPrimeNumber(int num) {
		for(int i=2; i*i<=num;i++) {
			if(num%i == 0) return false;
		}
		return true;
	}
}
