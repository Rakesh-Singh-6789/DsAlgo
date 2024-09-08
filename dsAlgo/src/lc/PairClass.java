package lc;

import java.util.*;

public class PairClass {
	
	public static class Pair implements Comparable<Pair>{
		private int x,y;
		
		Pair(int x, int y) {
			this.x = x;
			this.y = y;
		}
		
//		public static class Sorting implements Comparator<Pair> {
//			public int compare(Pair p1, Pair p2) {
//				return p1.y - p2.y;
//			}
//		}
		
		
		@Override
		public int compareTo(Pair o2) {
			// TODO Auto-generated method stub
			
			return this.y - o2.x;
		}
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Pair> pairList = new ArrayList<>();
		
		
		pairList.add(new Pair(1,2));
		pairList.add(new Pair(9,11));
		pairList.add(new Pair(4,6));
		
		//Collections.sort(pairList, new Pair.Sorting());
		pairList.sort(null);
		
		for(Pair p: pairList) {
			System.out.println(p.x + ":" + p.y);
		}
		
	}

}
