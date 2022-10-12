package Recursion;
import java.io.*;
import java.util.*;

public class keyPadStroke {
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
		System.out.println(getKeyPadCodes(str));
	}
	static HashMap<Integer,String> keyMap = new HashMap<>();
	private static ArrayList<String> getKeyPadCodes(String str) {
		// TODO Auto-generated method stub
		
		if(str.length() == 0) {
			ArrayList<String> list =  new ArrayList<>();
			list.add("");
			return list;
		}
		String ros = str.substring(1);
		
		ArrayList<String> recursiveList = getKeyPadCodes(ros); // Recursion
		
		char ch = str.charAt(0);
		String pressedKeyValues = keyMap.get(Character.getNumericValue(ch));
		ArrayList<String> answerList = new ArrayList<>();
		
		for(int j=0; j<pressedKeyValues.length(); j++) {
			for(String returnedStr: recursiveList)  {
				answerList.add(pressedKeyValues.charAt(j) + returnedStr);
			}
		}

		return answerList;
	}

}
