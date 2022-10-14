package Recursion;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class printAdvMP {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int sr = Integer.parseInt(st.nextToken()) - 1;
		int sc = Integer.parseInt(st.nextToken()) - 1;
		int dr = Integer.parseInt(st.nextToken()) - 1;
		int dc = Integer.parseInt(st.nextToken()) - 1;

		printAdvMazePath(sr, sc, dr, dc, "");
		System.out.println(count);
	}

	static int count = 0;

	private static void printAdvMazePath(int sr, int sc, int dr, int dc, String ans) {
		// TODO Auto-generated method stub
		
		if(sr == dr && sc == dc) {
			count++;
			System.out.println(ans);
			return;
		}
		
		if(sr > dr || sc > dc) {
			return;
		}

		for (int i=1; i <= (dr - sr); i++) {
			printAdvMazePath(sr+i,sc,dr,dc,ans+"v"+i);
		}
		
		for (int i=1; i <= (dc - sc); i++) {
			printAdvMazePath(sr,sc+i,dr,dc,ans+"h"+i);
		}
		for (int i=1; i <= (dr - sr) && i <= (dc-sc); i++) {
			printAdvMazePath(sr+i,sc+i,dr,dc,ans+"d"+i);
		}

	}

}
