package DP;

public class countPath {

	public static void main(String[] args) {
		
		int num = 35;
		// TODO Auto-generated method stub
		double start = System.currentTimeMillis();
		System.out.println(countPath(num));
		double end = System.currentTimeMillis();
		System.out.println(end-start);
		
		
		double start2 = System.currentTimeMillis();
		System.out.println("--" + countPathMemoized(num, new int[num+1]));
		double end2 = System.currentTimeMillis();
		System.out.println(end2-start2);
	}
	
	public static int countPath(int num) {
		
		if(num == 0) {
			return 1;
		}
		
		if(num < 0) {
			return 0;
		}
		
		int nm1 = countPath(num-1);
		int nm2 = countPath(num-2);
		int nm3 = countPath(num-3);
		int sum = nm1+nm2+nm3;
		
		return sum;
	}
	
public static int countPathMemoized(int num, int questionBank[]) {
		
		if(num == 0) {
			return 1;
		}
		
		if(num < 0) {
			return 0;
		}
		
		if(questionBank[num] != 0) {
			return questionBank[num];
		}
		
		int nm1 = countPathMemoized(num-1,questionBank );
		int nm2 = countPathMemoized(num-2, questionBank);
		int nm3 = countPathMemoized(num-3, questionBank);
		int sum = nm1+nm2+nm3;
		
		questionBank[num] = sum;
		
		return sum;
	}

}
