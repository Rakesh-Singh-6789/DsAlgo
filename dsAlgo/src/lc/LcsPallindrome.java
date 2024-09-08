package lc;
import java.util.*;
public class LcsPallindrome {
	
	 public  int longestPalindromeSubseq(String s) {
	        StringBuilder sb = new StringBuilder(s);
	        String revS = sb.reverse().toString();
	        //int n = s.length();
	       // int[][] dp = new int[n+1][n+1];
	        return lpsHelperOptimized(s, revS);
	        //return lpsHelper(n-1,n-1,s,revS,dp);
	    }

	    private int lpsHelper(int i, int j, String original, String reversed, int[][] dp) {
	        if(i <0  || j<0) {
	            return 0;
	        }

	        if(dp[i][j] != 0) return dp[i][j];

	        if(original.charAt(i) == reversed.charAt(j)) {
	            return 1+lpsHelper(i-1,j-1,original,reversed, dp);
	        }
	        int iTh = lpsHelper(i-1,j,original,reversed, dp);
	        int jTh = lpsHelper(i,j-1,original,reversed, dp);

	        dp[i][j] = Math.max(iTh,jTh);
	        return dp[i][j];
	        
	    }

	     private int lpsHelperOptimized(String original, String reversed) {
	        int n = original.length();
	        //int[][] dp = new int[n+1][n+1]; 

	        int[] curr = new int[n+1]; 
	        int[] prev = new int[n+1]; 

	        for(int i=1; i<=n; i++) {
	            for(int j=1;j<=n;j++) {
	               if(original.charAt(i-1) == reversed.charAt(j-1)) {
	                    curr[j] = 1+prev[j-1];
	                    continue;
	                }
	                int iTh = prev[j];
	                int jTh = curr[j-1];
	                curr[j] = Math.max(iTh,jTh);
	            }
	            prev = curr;
	        }

	        return curr[n];
	        
	    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//System.out.println(longestPalindromeSubseq("bbbab"));
//		Deque<Integer> dq = new ArrayDeque<>();
//		
//		int[] nums = {1,3,-1,-3,5,3,2,1,6};
//		int n = nums.length;
//		int k = 3;
//		List<Integer> maxList = new ArrayList<>();
//		dq.add(0);
//		for(int i=1; i<n; i++) {
//			int num = nums[i];
//			
//			if(!dq.isEmpty() && dq.peekFirst() <= i-k) {
//				dq.removeFirst();
//			}
////			if(!dq.isEmpty() && nums[dq.peekLast()] <= num) {
////				dq.addLast(i);
////			}
//			while(!dq.isEmpty() && nums[dq.peekLast()] <= num) {
//				dq.removeLast();
//			}
//			dq.addLast(i);
//
//			maxList.add(nums[dq.peekFirst()]);
//			
//			//System.out.println(dq);
//		}
//		//System.out.println(maxList);
//		//System.out.println('c'-'a');
//		int arr[] = {1,-1,0};
//		System.out.println(subarraySum(arr, 0));
		
		Job job1 = new Job(10,5,100);
		Job job2 = new Job(8,4,90);
		Job job3 = new Job(6,8,70);
		Job job4 = new Job(1,5,70);
		
		List<Job> jobList = new ArrayList<>();
		jobList.add(job1);
		jobList.add(job2);
		jobList.add(job3);
		jobList.add(job4);
		
		Collections.sort(jobList,(a,b)-> { return b.profit - a.profit;});

		for(Job j: jobList) {
			System.out.println("id:"+j.id + " de:"+j.deadline + " p:" + j.profit);
		}
		

	}
	
	 public static int subarraySum(int[] nums, int k) {

	        int left=0, right=0;
	        int sumSoFar = nums[0];
	        int n = nums.length;
	        int count = 0;
	        while(right < n && left < n && left <= right) {
	            //sumSoFar += nums[right];
	        	//System.out.println("start: " +left + ": " +right+ ": "+sumSoFar);
	        	if(sumSoFar == k) {
	                count++;
	            }
//	            if(left == right && sumSoFar == k) {
//	                count++;
//	            }
	            if((right < n-1) && (sumSoFar <= k || sumSoFar == 0)) {
	                right++;
	                sumSoFar += nums[right];
	            } else {
	                sumSoFar -= nums[left];
	                left++;
	            }

	            
	            System.out.println("end: " +left + ": " +right+ ": "+sumSoFar + " c: "+count);

	        }

	        return count;
	        
	    }

}

class Job {
	int id, deadline, profit;
	
	Job(int id, int deadline, int profit) {
		this.id = id;
		this.deadline = deadline;
		this.profit = profit;
	}
}
