package recursion2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class MColoring {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		
		List<Integer>[] graph = new ArrayList[n];
		for(int i=0; i<n; i++) {
			String str = br.readLine();
			String strArr[] = str.split(" ");
			graph[i] = new ArrayList<>();
			for(int j=0; j<strArr.length; j++) {
				graph[i].add(Integer.parseInt(strArr[j]));
			}
		}
		int m = Integer.parseInt(br.readLine());
		
		boolean bool = isMColoringPossible(graph,m,0, new int[m+1]);
				System.out.println(bool);
	}

	private static boolean isMColoringPossible(List<Integer>[] graph, int m, int node, int[] colors) {
		// TODO Auto-generated method stub
		
		if(node == graph.length) {
			return true;
		}
		
		
		for(int i=1; i<=m; i++) {
			if(isSafe(graph,i,node,colors)) {
				colors[node] = i;
				boolean vool = isMColoringPossible(graph,m,node+1,colors);
				if(vool) return true;
				colors[node] = 0;
			}
		}
		
		
		return false;
	}

	private static boolean isSafe(List<Integer>[] graph, int currentColor, int node, int[] colors) {
		// TODO Auto-generated method stub
		
		for(int nodeNum: graph[node]) {
			if(colors[nodeNum] == currentColor) {
				return false;
			}
		}
		return true;
	}

}
