package randomLC;

public class Test_XOR {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = new int[5];
//		System.out.println(arr[0]);
		for(int i = 0; i<5; i++) {
			if(i+1 == 1) continue;
			arr[i] = i+1;
			
		}
		
		int xorSoFar = arr[0]^1;
		for(int i = 1; i<5; i++) {
			int j = i+1;
			xorSoFar ^= (arr[i]^j);
		}
		
	
		//System.out.println(xorSoFar);
		System.out.println();
	}

}
