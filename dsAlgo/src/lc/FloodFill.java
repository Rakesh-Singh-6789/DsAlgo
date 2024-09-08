package lc;

import java.util.*;

public class FloodFill {
	
	public int[][] floodFill(int[][] image, int sr, int sc, int color) {
        int m = image.length;
        int n = image[0].length;
        boolean[][] visited = new boolean[m][n];
        if(image[sr][sc] == color) return image;
        
        floodFillHelper(image, sr, sc, color, visited, image[sr][sc]);
        return image;
    }

    private void floodFillHelper(int[][] image, int sr, int sc, int color, boolean[][] visited, int initColor) {
    	
    	if(sr<0||sc<0||sr>=image.length||sc>=image[0].length||visited[sr][sc]) {
    		return;
    	}
    	
    	if(image[sr][sc] == initColor) image[sr][sc] = color;
    	else return;
    
    	
    	int srDirs[] = {-1,0,1,0};
        int scDirs[] = {0,1,0,-1};
        visited[sr][sc] = true;
        for(int i=0; i<4; i++) {
            int srDir = srDirs[i];
            int scDir = scDirs[i];
            floodFillHelper(image, sr+srDir, sc+scDir, color, visited, initColor);
        }
        visited[sr][sc] = false;
    	
    }
    
    public static int longestValidSubstring(String str, List<String> forbidden) {
        int n = str.length();
       int left = n-1, right = left;
       
       int max = 0;
       
       HashSet<String> set = new HashSet<String>();
       
       for(String f: forbidden) {
    	   set.add(f);
       }

        while(left > -1) {
            
            StringBuilder sb = new StringBuilder();
           
            for(int i=left; i<=Math.min(right, left+9);i++) {
            	
            	sb.append(str.charAt(i));
            	//System.out.println(sb.toString());
            	if(set.contains(sb.toString())) {
            		// System.out.println(sb.toString()+ " l:"+left+" r:"+right);
            		right = i-1;
            		break;
            	}
            }
            max = Math.max(max, right-left+1);
            left--;
        }
        //0LEETCODE7
        return max;
        
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
String word = "cbaaaabc";
        
        // Define the forbidden list as an array of strings
        List<String> forbidden = new ArrayList<>(Arrays.asList("aaa","cb"));
        
        System.out.println(longestValidSubstring(word,forbidden));

	}

}
