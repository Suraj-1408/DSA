public class buySellStock{
	
	//method to return high profit,for stock buyed at certain price on ith day sold on that stock nosome  jth day, if difference  of prices between ith and jth day > 0 , i updtae the profit value.
	

	public static int maxProfit(int[] prices){
		
	//OPTIMIZED- INSTEAD OF CHECK EVERY POSSIBLE PAIRS OF DAYS.
	//KEEP TRACK OF MINIMUM STOCK PRICE ENCOUNTERED TILL ith DAY.
	//USE THE MIN.STOCK PRICE TO COMPUTE MAX PROFIT BY JUST DIFFERENCE OF "CURRENT DAY STK PRICE" AND "MIN PRICE"
	//AND ACCORDINGLY UPDATE THE MAXPROFIT.
	
	int minStockPrice = Integer.MAX_VALUE;
	int maxProfit = 0;

	for(int i = 0;i < prices.length;i++){	
		//compute min stock price;
		minStockPrice = (prices[i] < minStockPrice)?prices[i]:minStockPrice;

		//next computing maxProfit using minStock price.
		maxProfit = ((prices[i]-minStockPrice)>maxProfit)?(prices[i]-minStockPrice):maxProfit;
	}
	
	return maxProfit;

	/*BRUTE FORCE - WHERE WE TRYING EVERY POSSIBLE PAIRS OF (I,J)TH DAY, THAN UPDATING MAX PROFIT.
		//Initially keeping the maxProfit as 0.
		int maxProfit = 0;

		for(int i = 0;i < prices.length;i++){		//since we are check i next's element, we must stop at i-1
			for(int j = i+1;j < prices.length;j++){
				
				//comaring the prices of stock, on this specific day, if returns profits				//Than update the maxProfit.	

				int currProfit = prices[j]-prices[i];
				if(currProfit > maxProfit){
					maxProfit  = currProfit;
				}
			}
		}
		
		return maxProfit;
	*/
	}
	
	//main
	public static void main(String[] args){
		
		//int[] prices = {7,1,5,3,6,4};
		int[] prices = {7,6,4,3,1};
		System.out.println("Prices of one stock for "+prices.length+" days");

		for(int i = 0;i < prices.length;i++){
			System.out.println("Stock price on day "+i+" is:"+prices[i]);
		}
		System.out.println();

		int profit = maxProfit(prices);
		System.out.println("Maximum Profit Earned:"+profit);


	}
}
