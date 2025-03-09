public class buySellStockMultipleTimes{

	//method to compute the max Profit after buying and selling stock multiple times.
	public static int buySellStockMultipleTimes(int[] prices){
		
		//approach, for every day check the price of ith and i+1 th day, if returns profit , stores it check for next day's.
		int maxProfit = 0;
		for(int i = 0;i < prices.length-1;i++){
			if(prices[i+1] > prices[i]){
				int profit = prices[i+1] - prices[i];
				maxProfit = maxProfit + profit;
			}
		}

		return maxProfit;
	}

	//main
	public static void main(String[] args){
		int[] prices = {7,1,5,3,6,4};
		int profit = buySellStockMultipleTimes(prices);
		System.out.println("MAx PRofit:"+profit);
	}
}
