class Solution {

  public int maxProfit(int[] prices) {
    int maxprofit = 0;
    int min_value = Integer.MAX_VALUE;
    for (int i = 0; i < prices.length; i++) {
      if (prices[i] < min_value) min_value = prices[i]; else if (
        prices[i] - min_value > maxprofit
      ) maxprofit = prices[i] - min_value;
    }
    return maxprofit;
  }
}
