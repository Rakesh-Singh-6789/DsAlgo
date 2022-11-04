package Recursion;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class NQueens {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		boolean arr[][] = new boolean[n][n];
		printNQueens(0,0,0,"",arr);
	}

	private static void printNQueens(int queenPlaced, int row, int col, String path, boolean[][] arr) {
		// TODO Auto-generated method stub
		
		
		//printNQueens(n+1,row+1,col,path+"");
	}

}
