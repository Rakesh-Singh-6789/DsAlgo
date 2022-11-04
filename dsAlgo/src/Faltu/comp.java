package Faltu;

import java.util.*;

public class comp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<ArrayList<Integer>> list = new ArrayList<>();
		
		for(int i = 1; i<=5;i++) {
				ArrayList<Integer> tempList =  new ArrayList<>();
				int random = (int)(Math.random()*10 + 1);
				tempList.add(random);
				tempList.add(i*10);
				list.add(tempList);
			}
		
		Collections.sort(list,(a,b)->(b.get(1)-a.get(1)));
		
		System.out.println(list);
	}

}
