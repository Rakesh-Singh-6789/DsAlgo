import java.util.*;

public class Heap_Top_K_frequent {
	
	static class Pair implements Comparable<Pair> {
		
		private int freq;
		private int value;
		
		Pair(int value, int frequency) {
			this.value = value;			
			this.freq = frequency;
		}
		
		public void updateValueByOne() {
			this.freq += 1;
		}
		
		@Override
		public int compareTo(Pair o) {
			// TODO Auto-generated method stub
			return this.freq - o.freq;
		}
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = { 7, 7, 4, 1, 4, 1, 1,5, 15,6,5};
		HashMap<Integer, Pair> hm = new HashMap<>();
		PriorityQueue<Pair> pq= new PriorityQueue<>();
		
		
		for(int value: arr) {
			Pair pair = hm.get(value);
			if(pair != null) {
//				pair = new Pair(value,pair.freq+1);
				pair.updateValueByOne();
			} else {
				pair = new Pair(value,1);
			}
			hm.put(value,pair);
		}
		
		for(Map.Entry<Integer, Pair> entry : hm.entrySet()) {
			pq.add(entry.getValue());
			if(pq.size() > 3) {
				pq.poll();
			}
		}
		
//		for(Pair p: pq) {
//			System.out.println(p.value + " " + p.freq);
//		}
		
		while(pq.size() > 0) {
			System.out.println(pq.peek().value + " " + pq.peek().freq);
			pq.remove();
		}
		
	}

}
