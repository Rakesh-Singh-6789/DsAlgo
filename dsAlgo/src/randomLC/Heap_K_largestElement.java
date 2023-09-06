package randomLC;

import java.util.*;

public class Heap_K_largestElement {

//	static class Pair implements Comparable<Pair> {
//		int key;
//		int value;
//		Pair(int key, int value) {
//			this.key = key;
//			this.value = value;
//		}
//		
////		public int compare(Pair p1, Pair p2) {
////			return p2.key-p1.key;
////		}
//
//		@Override
//		public int compareTo(Pair o) {
//			// TODO Auto-generated method stub
//			return this.key - o.key;
//		}
//
//	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PriorityQueue<Pair> pq = new PriorityQueue<>();
		Pair

		int arr[] = { 7, 10, 4, 3, 20, 15 };

		for (int i = 0; i < arr.length; i++) {
			pq.add(arr[i]);

			if (pq.size() > 3) {
				pq.poll();
			}

//			if(pq.size()<3) {
//				pq.add(arr[i]);
//			} else {
//				if(pq.peek() < arr[i]) {
//					pq.poll();
//					pq.add(arr[i]);
//				}
//			}
//			System.out.println(pq);
		}

		while (pq.size() > 0) {
			System.out.println(pq.poll());
		}

	}

}
