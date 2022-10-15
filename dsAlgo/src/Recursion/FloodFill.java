package Recursion;

import java.io.*;
import java.util.*;

public class FloodFill {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int m = Integer.parseInt(st.nextToken());
		int n = Integer.parseInt(st.nextToken());
		int[][] arr = new int[m][n];
		for (int i = 0; i < m; i++) {
			st = new StringTokenizer(br.readLine());
			for (int j = 0; j < n; j++) {
				arr[i][j] = Integer.parseInt(st.nextToken());
			}
		}
		boolean[][] visited = new boolean[m][n];
		printFloodFill(arr, 0, 0, "", visited);
		System.out.println(count);
	}
	
	static int count = 0;
	private static void printFloodFill(int[][] arr, int m, int n, String path, boolean[][] visited) {
		// TODO Auto-generated method stub

		if (m == arr.length - 1 && n == arr[0].length - 1) {
			//visited = new boolean[m][];
			count++;
			System.out.println(path);
			return;
		}
		visited[m][n] = true;
//		for (int i = 0; i < visited.length; i++) {
//			for (int j = 0; j < visited[0].length; j++) {
//				System.out.print(visited[i][j] ? "-" : "0");
//			}
//			System.out.println();
//		}
//		System.out.println();
		if (m - 1 >= 0 && visited[m - 1][n] == false && arr[m - 1][n] != 1) {
			// visited[m - 1][n] = true;
			printFloodFill(arr, m - 1, n, path + "t", visited);
			//visited[m - 1][n] = false;
		}

		if (n - 1 >= 0 && visited[m][n - 1] == false && arr[m][n - 1] != 1) {
			// visited[m][n - 1] = true;
			printFloodFill(arr, m, n - 1, path + "l", visited);
			//visited[m][n - 1] = false;
		}

		if (m + 1 < arr.length && visited[m + 1][n] == false && arr[m + 1][n] != 1) {
			// visited[m + 1][n] = true;
			printFloodFill(arr, m + 1, n, path + "d", visited);
			//visited[m + 1][n] = false;
		}

		if (n + 1 < arr[0].length && visited[m][n + 1] == false && arr[m][n + 1] != 1) {
			// visited[m][n + 1] = true;
			printFloodFill(arr, m, n + 1, path + "r", visited);
			//visited[m][n + 1] = false;
		}
		
		visited[m][n] = false;
	}
}
