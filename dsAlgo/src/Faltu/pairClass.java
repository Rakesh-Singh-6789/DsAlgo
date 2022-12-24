package Faltu;

import java.util.Comparator;

public class pairClass {
	
	public static class Pair {
		int u,v;
		public Pair(int u, int v) {
			this.u = u;
			this.v = v;
		}
	}
	
	public static class MySorting implements Comparator<Pair>{
		public int compare(Pair p1, Pair p2) {
			return p1.u-p1.u;
		}
	}
		
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
