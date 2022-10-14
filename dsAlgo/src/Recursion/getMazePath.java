package Recursion;
import java.io.*;
import java.util.*;

public class getMazePath {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int sr = Integer.parseInt(st.nextToken())-1;
		int sc = Integer.parseInt(st.nextToken())-1;
		int dr = Integer.parseInt(st.nextToken())-1;
		int dc = Integer.parseInt(st.nextToken())-1;

		System.out.println(getMazePath(sr,sc,dr,dc));
		System.out.println(count);
	}
	
	static int count = 0;

	private static ArrayList<String> getMazePath(int sr, int sc, int dr, int dc) {
		count++;
		if(sr==dr && sc==dc) {
			ArrayList<String> list = new ArrayList<>();
			list.add("");
			return list;
		}
		
		if(sr > dr || sc > dc) {
			ArrayList<String> list = new ArrayList<>();
			return list;
		}
		
		
		
		ArrayList<String> hPaths = getMazePath(sr,sc+1,dr,dc);
		ArrayList<String> dPaths = getMazePath(sr+1,sc+1,dr,dc);
		ArrayList<String> vPaths = getMazePath(sr+1,sc,dr,dc);
		
		
		ArrayList<String> ansList = new ArrayList<>();
		
		//if(hPaths != null)
		for(String hPath: hPaths) {
			ansList.add("h"+hPath);
		}
		//if(vPaths != null)
		for(String vPath: vPaths) {
			ansList.add("v"+vPath);
		}
		
		//if(dPaths != null)
		for(String dPath: dPaths) {
			ansList.add("d"+dPath);
		}
		
		return ansList;
	}

}
