/*
643. Maximum Average Subarray I

You are given an integer array nums consisting of n elements, and an integer k.
Find a contiguous subarray whose length is equal to k that has the maximum average value and return this value. Any answer with a calculation error less than 10-5 will be accepted.

 

Example 1:

Input: nums = [1,12,-5,-6,50,3], k = 4
Output: 12.75000
Explanation: Maximum average is (12 - 5 - 6 + 50) / 4 = 51 / 4 = 12.75

*/

public class maxAvgSubarray{

	//method to return subarray having maximum Average.
	public static double maxAvgSubarray(int[] nums,int k){
		
		//double maxAvg = Integer.MIN_VALUE;
		double maxAvg = Double.NEGATIVE_INFINITY;
		int start = 0; 		//index to shrink the window and keep track of valid subarrray window.
		int end = 0;
		int arrlen = 0;
		int sum = 0;		//to store sum of element in subarray.

		for(end = 0;end < nums.length;end++){
			
			sum = sum + nums[end];
			arrlen++;

			if(arrlen == k){
				//computing Avg and update maxAvg.
				double avg =(double)sum/k;
				maxAvg = maxAvg < avg ? avg: maxAvg;

				//updating window by deleting start index value for specific subrray window
				sum = sum - nums[start];
				start++;
				arrlen--;
			}
		}
		return maxAvg;
	}



	//main
	public static void main(String[] args){
		
		int[] nums = {1,12,-5,-6,50,3};
		//int[] nums = {5};
		int k = 4;
	
		System.out.println("Given Array elements are:");
		for(int i = 0; i < nums.length;i++){
			System.out.print(nums[i]+"\t");
		}
		System.out.println("");


		double maxAvg = maxAvgSubarray(nums,k);
		System.out.println("Subarray with maximum average is "+maxAvg);
	}
}
