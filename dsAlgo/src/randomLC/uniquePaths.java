package randomLC;

public class uniquePaths {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	public static int uniquePaths(int m, int n) {
		// Write your code here.
		int answer = getPaths(0,0,m-1,n-1);
		return answer;
	}

	public static int getPaths(int sr, int sc, int dr, int dc) {

		if(sr == dr && sc == dc) {
			return 1;
		}
		if(sr > dr || sc > dc) {
			return 0;
		}


		int horizontalPaths = getPaths(sr, sc+1, dr, dc);
		int verticalPaths = getPaths(sr+1, sc, dr, dc);

		return horizontalPaths+verticalPaths;
	}

}
