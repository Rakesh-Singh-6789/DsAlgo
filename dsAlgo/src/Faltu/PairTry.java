//
//
///* Java program to find a Pair which has maximum score*/
//import java.util.*;
//import java.lang.*;
//
//public class PairTry {
//	
//	
//	public static class Pair{
//	    int u,v;
//	    public Pair(int u, int v){
//	        this.u = u;
//	        this.v = v;
//	    } 
//	}
//	public static class Sorting implements Comparator<Pair>{
//	    public int compare(Pair p1, Pair p2){
//	        if(p2.v==p1.v){
//	            return p2.u-p1.u;
//	        }
//	        return p1.u - p2.u;
//	    }
//	}
//	
//	
//    public static void main	(String[] args) {
//    	int arr1[] = new int[] {2,5,23,7,3,6,8,1,347,0};
//    	int arr2[] = new int[] {1,2,3,4,5,6,7,8,9,10};
//    	
//    	
//    	//Arrays.sort(arr1);
//    	
//    	List<Pair> list = new ArrayList<>();
//    	
//    	for(int i=0;i<arr1.length;i++) {
//    		Pair p = new Pair(arr1[i],arr2[i]);
//    		list.add(p);
//    	}
//    	
//    	Integer finalArr[][] =  new Integer[arr1.length][2];
//    	
//    	
//    	for(int i = 0; i< arr1.length; i++) {
//    		finalArr[i][0] = arr1[i];
//    		finalArr[i][1] = arr2[i];
//    	}
//    	
//    	Arrays.sort(finalArr);
//    	
//    	for(Integer[] finalArrVal : finalArr) {
//    		System.out.println(finalArrVal[0] + " " + finalArrVal[1]);
//    	}
//    	
//    	
//    	//System.out.println(list.get(0));
//    	
//    	Collections.sort(list,new Sorting());
//    	
//    	for(Pair p : list) {
//    		System.out.println(p.u + " " + p.v);
//    	}
//    }
//}
//
//
