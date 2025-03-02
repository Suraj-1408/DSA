public class longestIncresingSubsequence{
	
	//method to return length of longest Incresing Sequence.
	public static int longestIncresingSubsequence(int[] nums){

		//using a new array that stores longest incresing subsequence upto every ith index.
		//initially the longest incresing subsequence would be 1. therefore initializing complete array with 1.

		int[] dp = new int[nums.length];
		//Arrays.fill(dp[]);
		
		for(int i = 0;i < dp.length;i++){
			dp[i] = 1;
		}


		int maxlen = 1;
		//now O(m*n) approach, checking all previous element of j for every i th element.
		//incase we find a elemenet where i element > j, than i th element can be extended as longest incresing subsequence.
		
		for(int i = 1;i < nums.length;i++){
			
			for(int j  = 0; j < i; j++){
				
				if(nums[i] > nums[j]){
					//update maximum among the previous LIS and current LIS.
					dp[i] = Math.max(dp[i],dp[j]+1);
				}
			}

			maxlen = Math.max(dp[i],maxlen);
		}



		return maxlen;
	}


	//main()
	public static void main(String[] args){
		
		int[] nums = {10,9,2,5,3,7,101,18};
		System.out.println("Given array elements");
		for(int i = 0; i < nums.length;i++){
			System.out.print(nums[i]+"\t");
		}
		System.out.println();


		int max = longestIncresingSubsequence(nums);
		System.out.println("Longest Subsequence length is:"+max);
	}
}
