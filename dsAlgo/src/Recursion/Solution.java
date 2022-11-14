package Recursion;

import java.util.*;
import java.io.*;

public class Solution {
	
	 public static HashSet<String> uniqWords = new HashSet<>();
	   public static List<String> findWords(char[][] board, String[] words) {
	        int m = board.length;
	        int n = board[0].length;

	        HashSet<String> wordSet = new HashSet<>();
	        for(String word: words) {
	            wordSet.add(word);
	        }

	        List<String> finalAnswer = new ArrayList<>();
	        for(int i = 0; i < m; i++) {
	            for (int j = 1; j< n; j++) {
	                
	                List<String> answer = getAllWords(board,wordSet, board[i][j]+"", i, j,new boolean[m][n]);
	                for(int k = 0; k< answer.size();k++) {
	                    finalAnswer.add(answer.get(k));
	                }
	            }
	        }    
	        uniqWords = new HashSet<>(finalAnswer);
	        //System.out.println(finalAnswer);
	        finalAnswer = new ArrayList<>();
	        for(String uniqWord: uniqWords) {
	        	finalAnswer.add(uniqWord);
	        }
	        return finalAnswer;
	    }

	    public static List<String> getAllWords(char[][] board, HashSet<String> wordSet, String wsf, int row, int column, boolean[][] visited) {

	        if(row >= board.length || column >= board[0].length || row < 0 || column < 0 || visited[row][column]) {
	            List<String> temp = new ArrayList<>();
	            return temp;
	        }

	        if(wordSet.contains(wsf) && !uniqWords.contains(wsf)) {
	        	//System.out.println(uniqWords);
	            List<String> temp = new ArrayList<>();
	            uniqWords.add(wsf);
	            temp.add(wsf);
	            return temp;
	        }


	        List<String> leftCall = new ArrayList<>();
	        List<String> topCall = new ArrayList<>();
	        List<String> rightCall = new ArrayList<>();
	        List<String> downCall = new ArrayList<>();

	        List<String> answer = new ArrayList<>();
	        visited[row][column] = true;
	        if(column-1 < board[0].length && column-1 >= 0) {
	            leftCall = getAllWords(board, wordSet,wsf+board[row][column-1],row, column-1, visited);
	        }
	        
	        if(row-1 < board.length && row-1 >= 0) 
	            topCall = getAllWords(board, wordSet,wsf+board[row-1][column],row-1, column, visited);
	        if(column+1 < board[0].length && column+1 >= 0)
	            rightCall = getAllWords(board, wordSet,wsf+board[row][column+1],row, column+1, visited);
	        if(row+1 < board.length && row+1 >= 0)
	            downCall = getAllWords(board, wordSet,wsf+board[row+1][column],row+1, column, visited);

	        visited[row][column] = false;
	        for(int i = 0; i<leftCall.size(); i++) {
	            answer.add(leftCall.get(i));
	        }
	        for(int j = 0; j<topCall.size(); j++) {
	            answer.add(topCall.get(j));
	        }
	        for(int k = 0; k<rightCall.size(); k++) {
	            answer.add(rightCall.get(k));
	        }
	        for(int l = 0; l<downCall.size(); l++) {
	            answer.add(downCall.get(l));
	        }
	        return answer;
	    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		char[][] board = {
				{'a','b'},
		};
		
		System.out.println(findWords(board,new String[]{"ba"}));
	}

}
