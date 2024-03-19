package ArrayList;

import java.util.*;
import java.util.Map.Entry;

public class HashSetArrayList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		HashSet<ArrayList<String>> set = new HashSet<>();
//		
//		ArrayList<String> list1 = new ArrayList<>();
//		list1.add("ABC");
//		
//		set.add(list1);
//		
//		ArrayList<String> list2 = new ArrayList<>();
//		list2.add("ABC");
//		
//		set.add(list2);
//		
//		set.forEach(tempList -> {
//			System.out.println(tempList);
//		});
//		
		
HashSet<ArrayList<Integer>> set = new HashSet<>();
		
		ArrayList<Integer> list1 = new ArrayList<>();
		list1.add(1);
		list1.add(2);
		list1.add(3);
		
		set.add(list1);
		
		ArrayList<Integer> list2 = new ArrayList<>();
		list2.add(1);
		list2.add(2);
		list2.add(3);
		
		set.add(list2);
		
		set.add(list2);
		
		set.forEach(tempList -> {
			System.out.println(tempList);
		});
	}

}
