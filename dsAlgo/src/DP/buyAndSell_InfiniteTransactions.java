package DP;

import java.io.*;
import java.util.*;

public class buyAndSell_InfiniteTransactions {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		
		int prices[] = new int[n];
				
		for(int i = 0; i<n; i++) {
			prices[i] = Integer.parseInt(br.readLine());
		}
		
		long overAllProfit = 0;
		int buy = prices[0];
		int sell = prices[0];
		
		for(int i =1; i<n ; i++) {
			if(prices[i] < sell) {
				overAllProfit += (sell - buy);
				buy = sell = prices[i];
			} else {
				sell = prices[i];
			}
		}
		System.out.println(overAllProfit);
	}

}
