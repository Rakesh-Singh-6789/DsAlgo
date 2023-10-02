import java.util.*;

public class inBuilt_BinarySearch_temp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 List<Integer> al = new ArrayList<Integer>();
	        al.add(1);
	        al.add(2);
	        al.add(3);
	        al.add(10);
	        al.add(20);
	 
	        // 10 is present at index 3.
	        int index = Collections.binarySearch(al, 19);
	        System.out.println(index);
	 
	        // 13 is not present. 13 would have been inserted
	        // at position 4. So the function returns (-4-1)
	        // which is -5.
//	        index = Collections.binarySearch(al, 13);
//	        System.out.println(index);

	}

}
