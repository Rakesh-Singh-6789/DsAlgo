import java.util.*;

public class pairClass {
	
	public static class Pair {
		int value,freq;
		public Pair(int u, int v) {
			this.value = u;
			this.freq = v;
		}
	}
	
//	public static class MySorting implements Comparator<Pair>{
//		public int compare(Pair p1, Pair p2) {
//			return p1.freq-p1.freq;
//		}
//	}
		
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<Pair> pairList = new ArrayList<>();
		
		int arr[] = { 7, 7, 4, 1, 4, 1, 1,5, 15,6,5};
		HashMap<Integer, Integer> hm = new HashMap<>();
		
		for(int value: arr) {
			Integer freq = hm.get(value);
			if(freq != null) {
//				pair = new Pair(value,pair.freq+1);
				freq += 1;
				//hm.put(value, freq+1);
			} else {
				//hm.put(value,1);
				freq = 1;
			}
			hm.put(value,freq);
		}
		
		for(Map.Entry<Integer, Integer> entry: hm.entrySet()) {
			Pair temp = new Pair(entry.getKey(), entry.getValue());
			pairList.add(temp);
		}
		
		
		pairList.sort((a,b)->{return b.freq - a.freq;});
		
		 

}
