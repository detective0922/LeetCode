
/*

121. Best Time to Buy and Sell Stock

Say you have an array for which the ith element is the price of a given stock on day i.

If you were only permitted to complete at most one transaction (ie, buy one and sell one share of the stock), 
design an algorithm to find the maximum profit.

Example 1:

Input: [7, 1, 5, 3, 6, 4]
Output: 5

max. difference = 6-1 = 5 (not 7-1 = 6, as selling price needs to be larger than buying price)



Example 2:

Input: [7, 6, 4, 3, 1]
Output: 0

In this case, no transaction is done, i.e. max profit = 0.


*/


public class BestTimetoBuyandSellStock {
	
	public static void main(String[] args) {
		int[] test = { 7, 1, 5, 3, 6, 4 };
		System.out.println(new BestTimetoBuyandSellStock().maxProfit(test));
	}
	
	public int maxProfit(int[] prices) {
		int buyingPrice = prices[0];
		int maxProfit = 0;
		int sellingDay = 0;		
		for (int i = 1; i < prices.length; i++) {
			int profit = prices[i] - buyingPrice;
			if (profit > maxProfit) {
				maxProfit = profit;
				sellingDay = i;
			}
		}
			
		for (int i = 1; i < prices.length; i++) {
			if (prices[i] < buyingPrice) {
				if (i < sellingDay) {
					maxProfit = prices[sellingDay] - prices[i];
					buyingPrice = prices[i];
				}
			}
		}
		return maxProfit;

	}

}
