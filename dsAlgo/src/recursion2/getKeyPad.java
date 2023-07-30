package recursion2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;

public class getKeyPad {
	
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine();
		keyMap.put(1,"abc");
		keyMap.put(2,"def");
		keyMap.put(3,"ghi");
		keyMap.put(4,"jkl");
		keyMap.put(5,"mno");
		keyMap.put(6,"pqr");
		keyMap.put(7,"stu");
		keyMap.put(8,"vwx");
		keyMap.put(9,"yz");
		keyMap.put(0,".?!");
		
		System.out.println(getKeyPadStrokes(str));
	}
	
	static HashMap<Integer,String> keyMap = new HashMap<>();
	private static ArrayList<String> getKeyPadStrokes(String str) {
		// TODO Auto-generated method stub
		
		if(str.length() == 0) {
			ArrayList<String> baseList =  new ArrayList<>();
			baseList.add("");
			return baseList;
		}
		
		char ch = str.charAt(0);
		int num = Character.getNumericValue(ch);
		String stokeLetters = keyMap.get(num);
		
		//if(stokeLetters != null)
		ArrayList<String> remainingList = getKeyPadStrokes(str.substring(1));
		
		ArrayList<String> resultList = new ArrayList<>();
		
		for(String temp: remainingList) {
			for(int i=0; i<stokeLetters.length(); i++) {
				StringBuilder sb =  new StringBuilder(temp);
				sb.insert(0, stokeLetters.charAt(i));
				resultList.add(sb.toString());
			}
		}
		
		return resultList;
		
	}

}
