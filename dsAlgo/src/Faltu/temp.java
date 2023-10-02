import java.util.*;

public class temp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		int num = 5+48;
//		char ch = (char) num;
//		System.out.println(ch);
		
		int nums[] = {1,7,8,4,5,6,-1,9};
		
		ArrayList<Integer> sortedList = new ArrayList<>();
        sortedList.add(nums[0]);
        int n = nums.length;
        for(int i=1; i<n; i++) {
            int num = nums[i];
            int index = Collections.binarySearch(sortedList,num);
            System.out.println("num " + num + " ind " + index);
            if(index < 0) {
            	index = Math.abs(index)-1;
            }
            System.out.println(index);
            if(index >= sortedList.size())
            	sortedList.add(num);
            else 
            	sortedList.set(index,num);
            System.out.println(sortedList);
        }
        
        //System.out.println(sortedList);
		
	}

}
