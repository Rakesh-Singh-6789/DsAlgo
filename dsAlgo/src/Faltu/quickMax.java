import java.util.*;

public class quickMax {
	public static int modulo = 1000000007;

	
	public static int maxAreaOfRectangles(int[] sizes) {
		Arrays.sort(sizes);
		int MOD = (int)1e4+7;
		int areaSum = 0;
		int length = 0, breadth = 0;
		for(int i = sizes.length - 1; i > 0;) {
			if(sizes[i] == sizes[i-1] || sizes[i] == sizes[i-1] - 1){
				if(breadth == 0 && length != 0) {
					if(sizes[i] == sizes[i-1]) breadth = sizes[i];
					else if(sizes[i] == sizes[i-1] + 1) breadth = sizes[i-1];
				} else if(length == 0) {
					if(sizes[i] == sizes[i-1]) length = sizes[i];
					else if(sizes[i] == sizes[i-1] + 1) length = sizes[i-1];
				}
				i -= 2;
			} else {
				i--;
			}
			if(length != 0 && breadth != 0) {
				areaSum = areaSum%MOD + ((length%MOD)*(breadth%MOD))%MOD;
				length = 0;
				breadth = 0;
			}

		}
		return areaSum%MOD;
	}
	
	public static int getMaxArea(int[] arr) {
		int length=0;
		long sum=0;
	       Arrays.sort(arr);
	       final int modulo = 1000000007;
	       
	       for(int i=arr.length-1;i>0;i--){
	           if(arr[i]-arr[i-1] <= 1){
	                if(length==0){
	                    length= arr[i-1];
	                    i--;
	                }else{
	                    sum += (long)length * arr[i-1];
	                    length=0;
	                    i--;
	                }
	           }
	       }
       return (int) (sum%modulo);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] array = new int[]{2,3,3,4,6,8,8,6}; //2, 6, 2, 6, 3, 5
		int[] array2 = new int[]{2, 6, 2, 4, 3}; //
		//System.out.println(maxAreaOfRectangles(array));
		//System.out.println(getMaxArea(array2));
		int modulo = 1000000007;
		int a = 1000000006;
		int b = 1000000006;
		long temp = (long)a*b;
		System.out.println(temp%modulo);
	}

}
