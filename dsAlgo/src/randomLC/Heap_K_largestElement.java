package randomLC;

import java.util.*;

public class Heap_K_largestElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PriorityQueue<Integer> pq = new PriorityQueue<>();
		
		int arr[] = {7,10,4,3,20,15};
		
		for(int i=0; i<arr.length; i++) {
			pq.add(arr[i]);
			
			if(pq.size()>3) {
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
		
		while(pq.size() >0) {
			System.out.println(pq.poll());
		}
		
	}

}
