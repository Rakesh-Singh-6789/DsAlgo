package Recursion;
import java.io.*;
import java.lang.*;

public class TowerOfHanoi {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int disks = Integer.parseInt(br.readLine());
		towerOfHanoi(disks, 'A','B','C');
	}
	
	private static void towerOfHanoi(int disks, char diskA, char diskB, char diskC) {
		// A, B, C towers
		
	}

}
