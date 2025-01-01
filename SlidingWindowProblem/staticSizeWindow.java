/* Program to find the Maximum sum in the given array having a static window size of 2.
 */

import java.util.*;

class maxSumSubarray{
	public static int maxSumSubarray(int[]  arr,int k){
		int start = 0;
		int end = 0;

		int count = 0;
		int maxSum = 0;
		int currSum = 0;

		for(end = 0;end < arr.length;end++){
			//keep updating currSum intil it reaches k window size.
			currSum = currSum + arr[end];
			count++;

			if(count == k){
				//check currSum and update maxSum accordingly.
				if(currSum > maxSum){
					maxSum = currSum;
				}	
				//preservinf current indeex and then update start index to next index 
				//int index = start++;
				
				currSum = currSum - arr[start++];	//remove first index value from currSum and then incre STart.
				count--;
			}
		}
		return maxSum;
	}
}


public class staticSizeWindow {
	public static void main(String[] args){
		int[] arr = {-1,2,3,1,-3,2};
		
		int k = 2;

		maxSumSubarray instance = new maxSumSubarray();

		int maxSum = instance.maxSumSubarray(arr,k);
		System.out.println("Max SubArray SUm is "+maxSum);
	}
}
