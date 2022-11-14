package Recursion;

import java.util.*;

public class pallindromPartition {
	
	public List<List<String>> partition(String s) {
        List<List<String>> answerList = new ArrayList<>();
        answerList = solve(s, answerList);
        return answerList;
    }

    public List<List<String>> solve (String str,List<List<String>> answerList) {
         if(str.length() == 0) {
            List<String> list = new ArrayList<>();
            return list;
        }

        
        for(int i = 1; i<s.length; i++) {
            String leftStr = s.substring(0,i);
            String rightStr = s.substring(i);
            List<String> list;
            if(isPallindrome(leftStr)) {
                List<String> list = solve(rightStr, answerList);
                list.add(leftStr);
            }
            answerList.add(list);
        }
        return answerList;
    }

    public static boolean isPallindrome(String str) {
        int n = str.length();
        for(int i=0, j = n-1; i <= j ; i++, j--) {
            if(str[i] != str[j]) {
                return false;
            }
        }
        return true;
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
