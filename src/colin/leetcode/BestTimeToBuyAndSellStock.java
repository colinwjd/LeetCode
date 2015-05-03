/**
 * 
 */
package colin.leetcode;

/**
 * Say you have an array for which the ith element is the price of a given stock
 * on day i.
 * 
 * If you were only permitted to complete at most one transaction (ie, buy one
 * and sell one share of the stock), design an algorithm to find the maximum
 * profit.
 * 
 * @author Colin Wang Created on Apr 26, 2015
 */
public class BestTimeToBuyAndSellStock {
	public int maxProfit(int[] prices) {
		if (prices == null || prices.length == 0) {
			return 0;
		}
		// 假设第0天，股票价格最低
		int low = prices[0];
		// 当前利润是0
		int profit = 0;
		// 遍历一次数组，找出prices[i] - prices[j]的最大值，并且i > j，即先买后卖。
		for (int i = 1; i < prices.length; i++) {
			// 从第一天开始，如果第i天的价格更低，则从更低的价格买
			if (prices[i] < low) {
				low = prices[i];
			} else if (prices[i] - low > profit) {
				// 如果第i天卖出股票获利更高，则卖出
				profit = prices[i] - low;
			}
		}
		return profit;
	}
}
