package DP;

public class fibonaaciDP {
	
	public static int fibSum (int num) {
		if(num == 0 || num ==1) {
			return num;
		}
		
		int fib = fibSum(num -1);
		int fib2 = fibSum(num -2);
		return fib + fib2;
	}
	
	public static int fibMemoized(int num, int[] questionBank) {
		
		
		if(num == 0 || num ==1) {
			return num;
		}
		
		if(questionBank[num-1] != 0) {
			return questionBank[num];
		}
		
		int fib = fibSum(num -1);
		int fib2 = fibSum(num -2);
		int fibSumN = fib + fib2;
		
		questionBank[num-1] = fibSumN;
		
		return fib + fib2;	
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//System.out.println(fibSum(10));
		System.out.println(fibMemoized(10, new int[10]));
}

}
