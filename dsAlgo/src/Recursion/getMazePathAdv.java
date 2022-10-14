package Recursion;

import java.io.*;
import java.util.*;

public class getMazePathAdv {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int sr = Integer.parseInt(st.nextToken()) - 1;
		int sc = Integer.parseInt(st.nextToken()) - 1;
		int dr = Integer.parseInt(st.nextToken()) - 1;
		int dc = Integer.parseInt(st.nextToken()) - 1;
		
		ArrayList<String> ans = getMazePath(sr, sc, dr, dc);

		System.out.println(ans.size()+" "+ans);
		System.out.println(count);
	}

	static int count = 0;

	private static ArrayList<String> getMazePath(int sr, int sc, int dr, int dc) {
		count++;
		if (sr == dr && sc == dc) {
			ArrayList<String> list = new ArrayList<>();
			list.add("");
			return list;
		}

//		if (sr > dr || sc > dc) {
//			ArrayList<String> list = new ArrayList<>();
//			return list;
//		}
		
		
		ArrayList<String> ansList = new ArrayList<>();
//		ArrayList<String> vPaths = new ArrayList<>();
//		ArrayList<String> dPaths = new ArrayList<>();
//		ArrayList<String> hPaths = new ArrayList<>();

		for (int i = 1; i <= dr-sr; i++) {
			ArrayList<String> vPaths = new ArrayList<>();
			vPaths = getMazePath(sr + i, sc, dr, dc);
			for (String vPath : vPaths) {
				ansList.add("v"+ i + vPath);
			}
		}

		for (int i = 1; i <= dc-sc; i++) {
			ArrayList<String> hPaths = new ArrayList<>();
			hPaths = getMazePath(sr, sc+i, dr, dc);
			for (String hPath : hPaths) {
				ansList.add("h"+ i + hPath);
			}
		}

		// for diag
		for (int i = 1; i <= (dr-sr) && i<=(dc-sc); i++) {
			ArrayList<String> dPaths = new ArrayList<>();
			dPaths = getMazePath(sr + i, sc+i, dr, dc);
			for (String dPath : dPaths) {
				ansList.add("d"+ i + dPath);
			}
		}

		// ArrayList<String> hPaths = getMazePath(sr,sc+1,dr,dc,rows,columns);
		// ArrayList<String> dPaths = getMazePath(sr+1,sc+1,dr,dc,rows,columns);

		

		// if(hPaths != null)
		
		// if(vPaths != null)
		/*
		 * for (String vPath : vPaths) {
			ansList.add("v" + vPath);
		}

		// if(dPaths != null)
		for (String dPath : dPaths) {
			ansList.add("d" + dPath);
		}
		 * 
		 */
		

		return ansList;
	}

}
