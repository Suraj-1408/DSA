import java.util.*;

class returnMinSizeSubarraySum{
	public static int minSizeSubArraySum(int[] nums,int target){
		int minlen = Integer.MAX_VALUE;
		int start = 0;
		int end  = 0;
		int currSum = 0;

		for(end = 0;end < nums.length;end++){
			currSum = currSum + nums[end];

			//update the minlen by shrink the window size using start index.
			while(currSum >= target){
				minlen = (end-start +1 )< minlen? (end-start+1):minlen;

				//update currSum by removing value at start index.
				currSum = currSum - nums[start];
				start++;
			}
		}

		//if currSum > target exist, than return minlen computed for it.
		if(minlen == Integer.MAX_VALUE){
			return 0;
		}

		else{
			return minlen;
		}
	}
}


public class minSizeSubarraySum{
	public static void main(String[] args){
		int[]  arr = {2,3,1,2,4,3};
		int target = 7;

		int minSize = returnMinSizeSubarraySum.minSizeSubArraySum(arr,target);
	       System.out.println("Minimum Size sub Array Sum is "+ minSize);	
	}
}
