package lc;

import java.util.*;
import java.util.stream.*;

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
			
			return this.x - o2.x;
		}
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		List<Pair> pairList = new ArrayList<>();
//		
//		
//		pairList.add(new Pair(1,2));
//		pairList.add(new Pair(9,11));
//		pairList.add(new Pair(4,6));
//		
//		//Collections.sort(pairList, new Pair.Sorting());
//		pairList.sort(null);
//		
//		for(Pair p: pairList) {
//			System.out.println(p.x + ":" + p.y);
//		}
		
//		int[] max = new int[1];
//		IntObject obj = new IntObject(0);
//		helper(obj.max);
//		System.out.println(obj.max);
//		
//		String[] values = "a b c".split(" ");
//		System.out.println(values.length);
//		for(String val: values) {
//			System.out.println(val);
//		}
		
		//Stream<Integer> stream = (Stream<Integer>) Arrays.asList(1,5,2,4,6);
//		ArrayList<Integer> inputs = new ArrayList<>();
//		inputs.add(1);
//		inputs.add(5);
//		inputs.add(6);
//		inputs.add(2);
//		inputs.add(7);
//		
//		//List<Integer> divisibleByThree = list.stream().reduce((Integer a) -> {if(a%3==0) return a;}).toList();
//		Long average = inputs.stream()
//			    .filter(s->s>5).count();
//
//		System.out.println(average);
		
		
//		List<Integer> list = new ArrayList<>();
//		list.add(3);
//		list.add(7);
//		list.add(4);
//		list.add(2);
//		list.add(6);
//
//		List<Integer> values = list.stream()
//		    .filter(value -> value > 5)
//		    .map(value -> value * 2)
//		    .collect(Collectors.toList());
		
//		List<Integer> numbers = new ArrayList<>();
//		for (int i = 0; i < 10; i++) {
//		    numbers.add(i);
//		}
//
//		long howManyNumbers = numbers.stream()
//		    .filter(i -> i < 4)
//		    .map(i -> i * 2)
//		    .filter(i -> i < 10)
//		    .count();
//
//		System.out.println("Numbers: " + howManyNumbers);
//		
//		System.out.println(numbers);
//		ArrayList<Integer> values = new ArrayList<>();
//		values.add(7);
//		values.add(3);
//		values.add(2);
//		values.add(1);
//
//		int sum = values.stream()
//		    .reduce(0,(previousSum, value) -> previousSum + value);
//		System.out.println(sum);
		
//		Stream<Integer> infinteStream = Stream.iterate(10, (Integer n)->n+1).limit(100);
//		List<Integer> list = infinteStream.collect(Collectors.toList());
//		System.out.println(list);
		
		System.out.println(superEggDrop(2,6));
	}
	
	private static void helper(int max) {
		// TODO Auto-generated method stub
		
		max = 15;
		
	}
	
	 public static int superEggDrop(int k, int n) {
	        //return 1;
	        return helper(n,k);
	    }

	 public static int helper(int top, int eggs) {
		    if (eggs == 1) return top; // If one egg left, we need to do `top` drops.

		    if (top == 0 || top == 1) return top; // If there are no floors or only one floor.

		    int low = 1, high = top;
		    int minAttempts = Integer.MAX_VALUE;

		    while (low <= high) {
		        int mid = low + (high - low) / 2;

		        // Calculate attempts in case the egg breaks and does not break
		        int eggBreak = helper(mid - 1, eggs - 1); // Egg breaks
		        int eggNotBreak = helper(top - mid, eggs); // Egg does not break

		        // We want the worst-case scenario
		        int worstCase = 1 + Math.max(eggBreak, eggNotBreak);

		        // Minimize the number of attempts
		        minAttempts = Math.min(minAttempts, worstCase);

		        if (eggBreak > eggNotBreak) {
		            high = mid - 1; // Move towards lower floors
		        } else {
		            low = mid + 1; // Move towards higher floors
		        }
		    }

		    return minAttempts;
		}
	public static class IntObject{
		int max;
		IntObject(int max) {
			this.max = max;
		}
	}

//	private static void helper(IntObject obj) {
//		// TODO Auto-generated method stub
//		obj.max = 100;
//	}

}
class ListNode {
	      int val;
	      ListNode next;
	     ListNode() {}
	      ListNode(int val) { this.val = val; }
	      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}

class Solution {
    public ListNode mergeKLists(ListNode[] lists) {
        int k = lists.length;
        PriorityQueue<ListNode> pq = new PriorityQueue<>((a,b)->{return a.val - b.val;});
        for(int i=0;i<k;k++) {
        	pq.add(lists[i].next);
        }
        
        return null;
    }
}
